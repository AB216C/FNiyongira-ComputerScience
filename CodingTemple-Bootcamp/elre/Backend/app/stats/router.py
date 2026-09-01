from fastapi import APIRouter, Depends, Request
from sqlalchemy.orm import Session

from app.api.deps import get_db
from app.core.security import Limiter, UserClaims, get_remote_address, validate_token

router = APIRouter(prefix="/stats", tags=["stats"])

limiter = Limiter(key_func=get_remote_address)


@router.get("/summary")
@limiter.limit("20/minute")
def summary(
    request: Request,
    window: str = "week",
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    return {"window": window, "top_symptoms": []}


@router.get("/timeline")
@limiter.limit("30/minute")
def timeline(
    request: Request,
    from_: str,
    to: str,
    symptom_id: str | None = None,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    return {"points": []}


@router.get("/cooccurrence")
@limiter.limit("20/minute")
def cooccurrence(
    request: Request,
    window: str = "month",
    top: int = 10,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    return {"window": window, "pairs": []}
