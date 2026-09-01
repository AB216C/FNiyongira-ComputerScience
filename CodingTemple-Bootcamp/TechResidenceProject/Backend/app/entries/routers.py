from fastapi import APIRouter, Depends, status, Request
from sqlalchemy.orm import Session
from typing import List

from app.api.deps import get_db
from app.entries.schemas import EntryCreate, EntryOut, EntryUpdate
from app.entries import service
from app.core.security import Limiter, UserClaims, get_remote_address, validate_token

import logging

logger = logging.getLogger("app.entries")

router = APIRouter(prefix="/entries", tags=["entries"])

# Rate limiter
limiter = Limiter(key_func=get_remote_address)


# GET /entries
@router.get("", response_model=List[EntryOut])
@limiter.limit("5/minute")
def list_entries(
    request: Request,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    logger.info("[LIST ENTRIES] Listing all entries")
    entries = service.list_entries(db)
    logger.info(f"[LIST ENTRIES] Returned {len(entries)} entries")
    return entries


# POST /entries
@router.post("", response_model=EntryOut, status_code=status.HTTP_201_CREATED)
@limiter.limit("5/minute")
def create_entry(
    request: Request,
    body: EntryCreate,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    logger.info(f"[CREATE ENTRY] Payload={body.__dict__}")
    entry = service.create_entry(db, body)
    logger.info(f"[CREATE ENTRY] Success id={entry.id}")
    return entry


# GET /entries/{entry_id}
@router.get("/{entry_id}", response_model=EntryOut)
@limiter.limit("5/minute")
def get_entry(
    request: Request,
    entry_id: str,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    logger.info(f"[GET ENTRY] id={entry_id}")
    entry = service.get_entry(db, entry_id)
    logger.info(f"[GET ENTRY] Success id={entry_id}")
    return entry


# PUT /entries/{entry_id}
@router.put("/{entry_id}", response_model=EntryOut)
@limiter.limit("5/minute")
def update_entry(
    request: Request,
    entry_id: str,
    body: EntryUpdate,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    logger.info(f"[UPDATE ENTRY] id={entry_id} fields={body.__dict__}")
    entry = service.update_entry(db, entry_id, body)
    logger.info(f"[UPDATE ENTRY] Success id={entry_id}")
    return entry


# DELETE /entries/{entry_id}
@router.delete("/{entry_id}", status_code=status.HTTP_204_NO_CONTENT)
@limiter.limit("5/minute")
def delete_entry(
    request: Request,
    entry_id: str,
    db: Session = Depends(get_db),
    user_claims: UserClaims = Depends(validate_token),
):
    logger.info(f"[DELETE ENTRY] id={entry_id}")
    service.delete_entry(db, entry_id)
    logger.info(f"[DELETE ENTRY] Success id={entry_id}")
    return
