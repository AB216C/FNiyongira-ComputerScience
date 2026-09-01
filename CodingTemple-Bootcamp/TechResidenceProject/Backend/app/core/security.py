from fastapi import APIRouter, HTTPException, Depends, Request
from fastapi.responses import RedirectResponse, JSONResponse
from fastapi.security import HTTPAuthorizationCredentials, HTTPBearer
from pydantic import BaseModel
from jose import jwt, jws, ExpiredSignatureError, JWSError, JWTError
from jose.exceptions import JWTClaimsError
from typing_extensions import Annotated
import requests
from slowapi import Limiter
from slowapi.util import get_remote_address
from sqlalchemy.orm import Session

from app.users import schemas
from app.api.deps import get_db
from app.users.schemas import UserCreate

# -----------------------------
# Rate Limiter
# -----------------------------
limiter = Limiter(key_func=get_remote_address)

# -----------------------------
# Router
# -----------------------------
router = APIRouter(prefix="/auth", tags=["auth"])

AUTH0_DOMAIN = "dev-2siyddrbx6u3mzlq.us.auth0.com"
CLIENT_ID = "lAU215KbpDsBudRB7WBCT0buhCVCUdKU"
CLIENT_SECRET = "HppKk-YH_DMU7ggR20Z_HaaJSNVQGKnT_iAIcDdRQ5BwfRSajND-YZCBHvy6twc5"
AUDIENCE = "https://apithreats.com/api/elre"
REDIRECT_URI = "com.elre.expoapp:///"  # "http://localhost:8000/docs" 

JWKS_URL = f"https://{AUTH0_DOMAIN}/.well-known/jwks.json"
jwks = requests.get(JWKS_URL).json().get("keys", [])

security = HTTPBearer()

# -----------------------------
# Models
# -----------------------------
class UserClaims(BaseModel):
    sub: str
    permissions: list[str] = []

# -----------------------------
# Auth0 Helpers
# -----------------------------
def find_public_key(kid):
    for key in jwks:
        if key.get("kid") == kid:
            return key
    raise HTTPException(status_code=401, detail="Invalid token header")

def validate_token(credentials: Annotated[HTTPAuthorizationCredentials, Depends(security)]):
    try:
        unverified_header = jws.get_unverified_header(credentials.credentials)
        public_key = find_public_key(unverified_header["kid"])
        token_payload = jwt.decode(
            token=credentials.credentials,
            key=public_key,
            audience=AUDIENCE,
            algorithms=["RS256"]
        )
        return UserClaims(sub=token_payload["sub"], permissions=token_payload.get("permissions", []))
    except (ExpiredSignatureError, JWTClaimsError, JWSError, JWTError) as e:
        raise HTTPException(status_code=401, detail=str(e))

# -----------------------------
# Routes
# -----------------------------
@router.get("/protected") # protected route for testing
def protected(user_claims: UserClaims = Depends(validate_token)):
    return user_claims

@router.post("/register")
@limiter.limit("5/minute")
def register_user(request: Request, user: UserCreate, db: Session = Depends(get_db)):
    """
    Send Auth0 magic link for passwordless login.
    """
    url = f"https://{AUTH0_DOMAIN}/passwordless/start"
    payload = {
        "client_id": CLIENT_ID,
        "client_secret": CLIENT_SECRET,
        "connection": "email",
        "email": user.email,
        "send": "link"
    }
    headers = {"content-type": "application/json"}

    try:
        res = requests.post(url, json=payload, headers=headers, timeout=10)
    except requests.RequestException as exc:
        raise HTTPException(status_code=502, detail=f"Error contacting Auth0: {exc}")

    if res.status_code != 200:
        try:
            detail = res.json()
        except ValueError:
            detail = res.text
        raise HTTPException(status_code=res.status_code, detail=detail)

    return {"message": f"Magic link sent to {user.email}"}

@router.get("/login")
@limiter.limit("10/minute")
def login(request: Request):
    return RedirectResponse(
        f"https://{AUTH0_DOMAIN}/authorize"
        f"?response_type=code"
        f"&client_id={CLIENT_ID}"
        f"&redirect_uri={REDIRECT_URI}"
        f"&scope=openid profile email"
        f"&audience={AUDIENCE}"
    )

@router.get("/token")
def get_access_token(request: Request, code: str, db: Session = Depends(get_db)):
    """
    Exchange authorization code for access token and ensure local user exists.
    Returns structured JSON even on errors.
    """
    import traceback
    from app.users.service import create_user
    from app.users.repository import get_by_email

    try:
        # 1. Exchange auth code for token
        token_url = f"https://{AUTH0_DOMAIN}/oauth/token"
        token_payload = {
            "grant_type": "authorization_code",
            "client_id": CLIENT_ID,
            "client_secret": CLIENT_SECRET,
            "code": code,
            "redirect_uri": REDIRECT_URI
        }
        token_res = requests.post(
            token_url,
            data=token_payload,
            headers={"content-type": "application/x-www-form-urlencoded"},
            timeout=10
        )

        if token_res.status_code != 200:
            return JSONResponse(
                status_code=token_res.status_code,
                content={"error": "Auth0 token exchange failed", "details": token_res.text}
            )

        token_data = token_res.json()
        access_token = token_data.get("access_token")
        if not access_token:
            return JSONResponse(
                status_code=500,
                content={"error": "No access_token returned by Auth0", "details": token_data}
            )

        # 2. Fetch user info
        userinfo_res = requests.get(
            f"https://{AUTH0_DOMAIN}/userinfo",
            headers={"Authorization": f"Bearer {access_token}"},
            timeout=10
        )

        if userinfo_res.status_code != 200:
            return JSONResponse(
                status_code=400,
                content={"error": "Failed to fetch user info", "details": userinfo_res.text}
            )

        userinfo = userinfo_res.json()
        email = userinfo.get("email")
        if not email:
            return JSONResponse(
                status_code=400,
                content={"error": "Email not returned by Auth0", "details": userinfo}
            )

        # 3. Ensure local user exists
        existing_user = get_by_email(db, email)
        if not existing_user:
            new_user_payload = schemas.UserCreate(
                email=email,
                first_name="",
                last_name=""
            )
            create_user(db, new_user_payload)

        # 4. Return token data
        return token_data

    except Exception as e:
        return JSONResponse(
            status_code=500,
            content={"error": str(e), "traceback": traceback.format_exc()}
        )

@router.get("/logout")
def logout(request: Request):
    return RedirectResponse(
        f"https://{AUTH0_DOMAIN}/v2/logout"
        f"?returnTo={REDIRECT_URI}"
        f"&client_id={CLIENT_ID}"
    )
