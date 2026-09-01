from __future__ import annotations
from typing import List
from datetime import datetime
from fastapi import HTTPException, status
from sqlalchemy.orm import Session

from app.entries import repository
from app.entries.schemas import EntryCreate, EntryUpdate, EntryOut


# Update with auth when ready
DEFAULT_USER_ID = "usr_1"


# List all entries
def list_entries(db: Session, *, user_id: str = DEFAULT_USER_ID) -> List[EntryOut]:
    """
    Retrieve all non-deleted entries for a given user.

    - Calls the repository to get all entries.
    - Filters by user_id and deleted_at=None (repository handles it).
    - Returns list of Pydantic EntryOut models.
    """
    rows = repository.list_entries(db, include_deleted=False, user_id=user_id)
    return [EntryOut(**r) for r in rows]


# Retrieve a single entry by ID
def get_entry(db: Session, entry_id: str, *, user_id: str = DEFAULT_USER_ID) -> EntryOut:
    """
    Fetch a single entry by its ID and perform ownership and deletion checks.

    Raises:
      - 404 if entry doesn’t exist
      - 410 if entry is soft-deleted
      - 403 if user doesn’t own the entry
    """
    rec = repository.get_entry_by_id(db, entry_id)
    if rec is None:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Entry not found")
    if rec.get("deleted_at"):
        raise HTTPException(status_code=status.HTTP_410_GONE, detail="Entry deleted")
    if rec.get("user_id") != user_id:
        raise HTTPException(status_code=status.HTTP_403_FORBIDDEN, detail="Forbidden")

    return EntryOut(**rec)


# Create a new entry
def create_entry(db: Session, payload: EntryCreate, *, user_id: str = DEFAULT_USER_ID) -> EntryOut:
    """
    Create a new entry record.

    - Populates missing optional fields with defaults.
    - Delegates insertion to the repository layer.
    - Returns the new record as EntryOut.
    """
    rec = repository.create_entry(
        db,
        user_id=user_id,
        text=(payload.text or ""),
        captured_at=(payload.captured_at or datetime.utcnow()),
        lang=(payload.lang or "en"),
    )
    return EntryOut(**rec)


# Update an existing entry
def update_entry(db: Session, entry_id: str, payload: EntryUpdate, *, user_id: str = DEFAULT_USER_ID) -> EntryOut:
    """
    Update an existing entry with new values.

    Steps:
      1. Fetch the entry.
      2. Verify it exists and isn’t deleted.
      3. Verify the user owns it.
      4. Ensure at least one field is provided (else 400).
      5. Pass updated data to repository.

    Returns updated record as EntryOut.
    """
    rec = repository.get_entry_by_id(db, entry_id)
    if rec is None:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Entry not found")
    if rec.get("deleted_at"):
        raise HTTPException(status_code=status.HTTP_410_GONE, detail="Entry deleted")
    if rec.get("user_id") != user_id:
        raise HTTPException(status_code=status.HTTP_403_FORBIDDEN, detail="Forbidden")

    # Prevent empty updates
    if not payload.dict(exclude_unset=True):
        raise HTTPException(status_code=status.HTTP_400_BAD_REQUEST, detail="No valid fields to update")

    updated = repository.update_entry(
        db,
        entry_id,
        text=payload.text if "text" in payload.model_fields_set else None,
        captured_at=payload.captured_at if "captured_at" in payload.model_fields_set else None,
        lang=payload.lang if "lang" in payload.model_fields_set else None,
    )
    return EntryOut(**updated)



# Delete (soft delete) an entry
def delete_entry(db: Session, entry_id: str, *, user_id: str = DEFAULT_USER_ID) -> None:
    """
    Soft-delete an entry by marking its deleted_at timestamp.

    - Raises 404 if not found
    - Treats repeated deletes as idempotent (no error)
    - Raises 403 if another user’s entry

    Returns nothing (204 in API layer).
    """
    rec = repository.get_entry_by_id(db, entry_id)
    if rec is None:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Entry not found")
    if rec.get("deleted_at"):
        # Already deleted — treat as successful no-op
        return
    if rec.get("user_id") != user_id:
        raise HTTPException(status_code=status.HTTP_403_FORBIDDEN, detail="Forbidden")

    repository.soft_delete_entry(db, entry_id)
