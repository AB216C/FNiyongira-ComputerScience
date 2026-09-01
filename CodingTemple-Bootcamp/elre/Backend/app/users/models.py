from datetime import datetime

from sqlalchemy import Column, Integer, String, DateTime, Boolean
from app.db.base import Base


class User(Base):
    __tablename__ = "users"

    id = Column(Integer, primary_key=True, index=True)
    
    # Auth0 user ID (required to link DB <-> Auth0)
    auth0_id = Column(String(255), unique=True, index=True, nullable=False)

    # Required fields (DB enforces NOT NULL)
    first_name = Column(String(50), nullable=False, default="")
    last_name = Column(String(50), nullable=False, default="")

    email = Column(String(255), unique=True, index=True, nullable=False)

    # Soft-delete flag 
    is_active = Column(Boolean, nullable=False, default=True)

    # Python-side defaults instead of DB functions
    created_at = Column(
        DateTime(timezone=True),
        nullable=False,
        default=datetime.utcnow,
    )
    updated_at = Column(
        DateTime(timezone=True),
        nullable=False,
        default=datetime.utcnow,
        onupdate=datetime.utcnow,
    )
