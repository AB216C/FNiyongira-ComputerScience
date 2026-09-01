from fastapi import APIRouter, Depends, status, Request
from sqlalchemy.orm import Session
from typing import List

from app.api.deps import get_db, get_current_user
from app.users import service
from app.users.schemas import UserCreate, UserOut, UserUpdate
from app.core.security import Limiter, UserClaims, get_remote_address, validate_token

import logging
logger = logging.getLogger("app.users")

# KEEP THIS ROUTER — includes auth dependencies
router = APIRouter(
    prefix="/users",
    tags=["users"],
    dependencies=[Depends(get_current_user)],
)

# Rate limiter
limiter = Limiter(key_func=get_remote_address)


@router.post("", response_model=UserOut, status_code=status.HTTP_201_CREATED)
@limiter.limit("5/minute")
def create_user(
    request: Request,
    body: UserCreate,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    logger.info(f"[CREATE USER] email={body.email}")
    user = service.create_user(db, body)
    logger.info(f"[CREATE USER] success id={user.id}")
    return user


@router.get("", response_model=List[UserOut])
@limiter.limit("5/minute")
def list_users(
    request: Request,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    logger.info("[LIST USERS] Request to list all users")
    users = service.list_users(db)
    logger.info(f"[LIST USERS] returned {len(users)} users")
    return users


@router.get("/{user_id}", response_model=UserOut)
@limiter.limit("5/minute")
def get_user(
    request: Request,
    user_id: int,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    logger.info(f"[GET USER] id={user_id}")
    user = service.get_user(db, user_id)
    logger.info(f"[GET USER] success id={user_id}")
    return user


@router.put("/{user_id}", response_model=UserOut)
@limiter.limit("5/minute")
def update_user(
    request: Request,
    user_id: int,
    body: UserUpdate,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    if hasattr(body, "model_dump"):
        fields = body.model_dump(exclude_unset=True)
    else:
        fields = body.dict(exclude_unset=True)

    logger.info(f"[UPDATE USER] id={user_id} fields={fields}")
    updated = service.update_user(db, user_id, body)
    logger.info(f"[UPDATE USER] success id={user_id}")
    return updated


@router.delete("/{user_id}", status_code=status.HTTP_204_NO_CONTENT)
@limiter.limit("5/minute")
def delete_user(
    request: Request,
    user_id: int,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    logger.info(f"[DELETE USER] id={user_id}")
    service.delete_user(db, user_id)
    logger.info(f"[DELETE USER] success id={user_id}")
    return

@router.get("/auth/{auth_id}", response_model=UserOut)
@limiter.limit("5/minute")
def get_user_by_auth_id(
    request: Request,
    auth_id: str,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    """Retrieve a single user by Auth0 ID."""
    user = service.get_by_auth_id(db, auth_id)
    if not user:
        from fastapi import HTTPException
        raise HTTPException(status_code=404, detail="User not found")
    return user

@router.delete("/auth/{auth_id}", status_code=status.HTTP_204_NO_CONTENT)
@limiter.limit("5/minute")
def delete_user_by_auth_id(
    request: Request,
    auth_id: str,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    """Soft-delete a user by Auth0 ID."""
    success = service.soft_delete_by_auth_id(db, auth_id)
    if not success:
        from fastapi import HTTPException
        raise HTTPException(status_code=404, detail="User not found")
    return
