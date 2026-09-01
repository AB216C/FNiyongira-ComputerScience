from app.core.logging_config import setup_logging
setup_logging()
from fastapi import FastAPI, Request
from fastapi.middleware.cors import CORSMiddleware
from fastapi.responses import JSONResponse, Response
from slowapi import Limiter
from slowapi.errors import RateLimitExceeded
from slowapi.middleware import SlowAPIMiddleware
from slowapi.util import get_remote_address
from app.core.config import settings
from app.api.router import api_router

# -----------------------------
# FastAPI App
# -----------------------------
app = FastAPI(title=settings.app_name)

# -----------------------------
# CORS
# -----------------------------
origins = [
    "http://localhost:3000",
    "http://127.0.0.1:3000",
    "http://localhost:19000",
    "http://127.0.0.1:19000",
    "http://localhost:19001",
    "http://127.0.0.1:19001",
    "http://localhost:19002",
    "http://127.0.0.1:19002",
    "http://localhost:19006",
    "http://127.0.0.1:19006",
]

app.add_middleware(
    CORSMiddleware,
    allow_origins=origins,
    allow_credentials=True,
    allow_methods=["GET", "POST", "DELETE", "PUT", "OPTION"],
    allow_headers=["*"],
)

# -----------------------------
# Rate Limiting (SlowAPI)
# -----------------------------
limiter = Limiter(key_func=get_remote_address)
app.state.limiter = limiter
app.add_middleware(SlowAPIMiddleware)

@app.exception_handler(RateLimitExceeded)
def rate_limit_handler(request: Request, exc: RateLimitExceeded):
    return JSONResponse(
        status_code=429,
        content={"detail": "Rate limit exceeded. Try again later."}
    )

# -----------------------------
# Security Headers Middleware
# -----------------------------
@app.middleware("http")
async def add_security_headers(request: Request, call_next):
    response: Response = await call_next(request)

    # Skip CSP for docs to allow testing on Swagger UI
    if request.url.path.startswith("/docs") or request.url.path.startswith("/redoc"):
        return response

    response.headers["Strict-Transport-Security"] = "max-age=63072000; includeSubDomains; preload"
    response.headers["X-Content-Type-Options"] = "nosniff"
    response.headers["X-Frame-Options"] = "DENY"
    response.headers["X-XSS-Protection"] = "1; mode=block"
    response.headers["Referrer-Policy"] = "no-referrer"
    response.headers["Content-Security-Policy"] = (
        "default-src 'none'; "
        "img-src 'self' data:; "
        "script-src 'self'; "
        "style-src 'self'; "
        "connect-src 'self' https://dev-2siyddrbx6u3mzlq.us.auth0.com;"
    )

    return response

# -----------------------------
# Health Check
# -----------------------------
@app.get("/v1/healthz")
def healthz():
    return {"status": "ok"}

app.include_router(api_router)
