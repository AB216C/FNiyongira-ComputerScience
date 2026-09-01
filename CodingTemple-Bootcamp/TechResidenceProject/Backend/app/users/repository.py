from typing import List, Optional
from sqlalchemy.orm import Session
from app.users import models
from datetime import datetime

def get_by_email(db: Session, email: str) -> Optional[models.User]:
    return db.query(models.User).filter(models.User.email == email).first()

def get_by_id(db: Session, user_id: int) -> Optional[models.User]:
    return db.query(models.User).filter(models.User.id == user_id).first()

def list_users(db: Session, skip: int = 0, limit: int = 10) -> List[models.User]:
    return db.query(models.User).offset(skip).limit(limit).all()

def create_user(db: Session, *, email: str, first_name: str | None = None, last_name: str | None = None) -> models.User:
    user = models.User(email=email, first_name=first_name, last_name=last_name)
    db.add(user)
    db.commit()
    db.refresh(user)
    return user

def update_user(
    db: Session,
    user_id: int,
    *,
    first_name: str | None = None,
    last_name: str | None = None,
    email: str | None = None,
    is_active: bool | None = None,
) -> Optional[models.User]:
    u = get_by_id(db, user_id)
    if not u:
        return None
    if first_name is not None:
        u.first_name = first_name
    if last_name is not None:
        u.last_name = last_name
    if email is not None:
        u.email = email
    if is_active is not None:
        u.is_active = is_active
    db.add(u)
    db.commit()
    db.refresh(u)
    return u

def soft_delete_user(db: Session, user_id: int) -> bool:
    u = get_by_id(db, user_id)
    if not u:
        return False
    # soft delete: 
    u.is_active = False
    db.add(u)
    db.commit()
    return True

def get_by_auth_id(db: Session, auth_id: str) -> Optional[models.User]:
    return db.query(models.User).filter(models.User.auth_id == auth_id).first()

def soft_delete_by_auth_id(db: Session, auth_id: str) -> bool:
    u = get_by_auth_id(db, auth_id)
    if not u:
        return False
    u.is_active = False
    db.add(u)
    db.commit()
    return True