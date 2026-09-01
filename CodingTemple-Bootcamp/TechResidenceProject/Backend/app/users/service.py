from fastapi import HTTPException, status
from sqlalchemy.exc import IntegrityError
from sqlalchemy.orm import Session

from app.users import repository, schemas, models


def create_user(db: Session, payload: schemas.UserCreate) -> models.User:
    if repository.get_by_email(db, payload.email):
        raise HTTPException(
            status_code=status.HTTP_409_CONFLICT,
            detail="Email already exists",
        )

    user = models.User(
        email=payload.email,
        first_name=payload.first_name,
        last_name=payload.last_name,
    )
    db.add(user)
    try:
        db.commit()
    except IntegrityError:
        db.rollback()
        raise HTTPException(
            status_code=status.HTTP_409_CONFLICT,
            detail="User with same email already exists",
        )
    db.refresh(user)
    return user


def list_users(db: Session, skip: int = 0, limit: int = 10) -> list[models.User]:
    return repository.list_users(db, skip, limit)


def get_user(db: Session, user_id: int) -> models.User:
    user = repository.get_by_id(db, user_id)
    if not user:
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND,
            detail="User not found",
        )
    return user


def update_user(db: Session, user_id: int, payload: schemas.UserUpdate) -> models.User:
    user = repository.get_by_id(db, user_id)
    if not user:
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND,
            detail="User not found",
        )

    # Pydantic v1/v2 compatibility
    try:
        update_data = payload.dict(exclude_unset=True)
    except Exception:
        update_data = (
            payload.model_dump(exclude_unset=True)
            if hasattr(payload, "model_dump")
            else {}
        )

    if not update_data:
        raise HTTPException(
            status_code=status.HTTP_400_BAD_REQUEST,
            detail="No fields to update",
        )

    # check email uniqueness if provided
    if "email" in update_data and update_data["email"] is not None:
        existing = repository.get_by_email(db, update_data["email"])
        if existing and existing.id != user_id:
            raise HTTPException(
                status_code=status.HTTP_409_CONFLICT,
                detail="Email already exists",
            )

    try:
        updated = repository.update_user(
            db,
            user_id,
            first_name=update_data.get("first_name"),
            last_name=update_data.get("last_name"),
            email=update_data.get("email"),
        )
    except IntegrityError:
        db.rollback()
        raise HTTPException(
            status_code=status.HTTP_409_CONFLICT,
            detail="Email already in use",
        )

    if not updated:
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND,
            detail="User not found",
        )

    return updated


def delete_user(db: Session, user_id: int) -> None:
    """
    Soft-delete a user by setting is_active = False.

    The tests do:
      - DELETE /users/{id}
      - GET /users/{id}
      - assert body["is_active"] is False
    """
    user = repository.get_by_id(db, user_id)
    if not user:
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND,
            detail="User not found",
        )

    # Soft delete 
    user.is_active = False
    db.add(user)
    db.commit()
    db.refresh(user)
    return

def get_by_auth_id(db: Session, auth_id: str):
    return repository.get_by_auth_id(db, auth_id)

def soft_delete_by_auth_id(db: Session, auth_id: str):
    return repository.soft_delete_by_auth_id(db, auth_id)