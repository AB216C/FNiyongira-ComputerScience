from fastapi import APIRouter, Depends, Request
from sqlalchemy.orm import Session

from app.api.deps import get_db
from app.core.security import Limiter, UserClaims, get_remote_address, validate_token

router = APIRouter(prefix="/catalog", tags=["catalog"])

limiter = Limiter(key_func=get_remote_address)


@router.get("/symptoms")
@limiter.limit("20/minute")
def search_symptoms(
    request: Request,
    q: str = "",
    limit: int = 10,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    # placeholder - will query ICD table later
    return {"matches": []}


@router.get("/symptoms/{code_or_id}")
@limiter.limit("20/minute")
def get_symptom(
    request: Request,
    code_or_id: str,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    return {"symptom_id": code_or_id, "label": {"en": "TBD"}}
