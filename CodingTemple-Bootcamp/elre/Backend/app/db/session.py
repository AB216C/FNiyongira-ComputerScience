from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from app.core.config import settings
from app.db.base import Base

engine = create_engine(settings.database_url, pool_pre_ping=True)
SessionLocal = sessionmaker(autocommit=False, autoflush=False, bind=engine)

# Dev-only: create tables on startup (import models here so they register)
def create_all():
    from app.users import models as _users_models  # noqa: F401
    Base.metadata.create_all(bind=engine)
