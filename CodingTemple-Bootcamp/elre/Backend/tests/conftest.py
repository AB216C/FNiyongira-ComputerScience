# Backend/tests/conftest.py

import os
import sys
from pathlib import Path

import pytest
from fastapi.testclient import TestClient
from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker, Session
from sqlalchemy.engine import Engine

# -----------------------------------------------------------------------------
# Ensure Backend (which contains the "app" package) is on sys.path
# -----------------------------------------------------------------------------
BACKEND_DIR = Path(__file__).resolve().parents[1]  # .../elre/Backend
if str(BACKEND_DIR) not in sys.path:
    sys.path.insert(0, str(BACKEND_DIR))

# -----------------------------------------------------------------------------
# TEST DATABASE: a local SQLite database just for tests
# -----------------------------------------------------------------------------
TEST_DATABASE_URL = "sqlite:///./test.db"

TEST_ENGINE: Engine = create_engine(
    TEST_DATABASE_URL,
    connect_args={"check_same_thread": False},
)

TestingSessionLocal = sessionmaker(
    autocommit=False,
    autoflush=False,
    bind=TEST_ENGINE,
)

# -----------------------------------------------------------------------------
# Import app and Base AFTER setting up the test engine
# -----------------------------------------------------------------------------
from app.main import app          # type: ignore
from app.db.base import Base      # type: ignore

# -----------------------------------------------------------------------------
# 1) Rebind every SQLAlchemy engine & sessionmaker to TEST_ENGINE
# -----------------------------------------------------------------------------
import sqlalchemy.orm as orm

for mod in list(sys.modules.values()):
    if mod is None:
        continue
    # Rebind any sessionmaker named "SessionLocal"
    for attr_name in dir(mod):
        try:
            attr = getattr(mod, attr_name)
        except Exception:
            continue

        # Rebind any global SQLAlchemy Engine to TEST_ENGINE
        if isinstance(attr, Engine):
            # Replace engines that point to Postgres with our test engine
            setattr(mod, attr_name, TEST_ENGINE)

        # Rebind any sessionmaker to use TEST_ENGINE
        if isinstance(attr, orm.session.sessionmaker):
            attr.configure(bind=TEST_ENGINE)

# -----------------------------------------------------------------------------
# 2) Override every get_db dependency to use TestingSessionLocal
# -----------------------------------------------------------------------------
def override_get_db():
    db: Session = TestingSessionLocal()
    try:
        yield db
    finally:
        db.close()

for mod in list(sys.modules.values()):
    if mod is None:
        continue
    for attr_name in dir(mod):
        if attr_name != "get_db":
            continue
        try:
            func = getattr(mod, attr_name)
        except Exception:
            continue
        if callable(func):
            # Make FastAPI use our override whenever that get_db is used
            app.dependency_overrides[func] = override_get_db

# -----------------------------------------------------------------------------
# 3) Reset the SQLite schema before each test
# -----------------------------------------------------------------------------
@pytest.fixture(autouse=True)
def reset_db():
    """
    Automatically runs for every test:
      - drops all tables on TEST_ENGINE
      - recreates all tables on TEST_ENGINE
    """
    Base.metadata.drop_all(bind=TEST_ENGINE)
    Base.metadata.create_all(bind=TEST_ENGINE)
    yield
    # nothing after; next test will reset again

# -----------------------------------------------------------------------------
# 4) Test client fixture
# -----------------------------------------------------------------------------
@pytest.fixture()
def client():
    with TestClient(app) as c:
        yield c
