from sqlalchemy.orm import Session
from app.db.session import SessionLocal

def get_db():
    db: Session = SessionLocal()
    try:
        yield db
    finally:
        db.close()

class CurrentUser:
    # User object for dependency
    def __init__(self, id: int = 1, email: str = "test@example.com"):
        self.id = id
        self.email = email
        self.is_active = True


def get_current_user() -> CurrentUser:
    return CurrentUser()