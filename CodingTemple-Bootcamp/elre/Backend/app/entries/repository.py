from __future__ import annotations
from typing import Dict, List, Optional
from datetime import datetime
from sqlalchemy.orm import Session  # kept for future DB swap

# In memory store now. REPLACE with DB later
_ENTRIES: Dict[str, Dict] = {}

def _new_id() -> str:
    return f"ent_{len(_ENTRIES) + 1}"

# ---------- Query helpers ----------
def list_entries(db: Session, *, include_deleted: bool = False, user_id: Optional[str] = None) -> List[Dict]:
    rows = list(_ENTRIES.values())
    if not include_deleted:
        rows = [r for r in rows if not r.get("deleted_at")]
    if user_id is not None:
        rows = [r for r in rows if r.get("user_id") == user_id]
    return rows

def get_entry_by_id(db: Session, entry_id: str) -> Optional[Dict]:
    return _ENTRIES.get(entry_id)

# ---------- Mutations ----------
def create_entry(db: Session, *, user_id: str, text: str, captured_at: datetime, lang: str) -> Dict:
    ent_id = _new_id()
    rec = {
        "id": ent_id,
        "user_id": user_id,
        "captured_at": captured_at.isoformat(),
        "text": text,
        "lang": lang,
        "deleted_at": None,
    }
    _ENTRIES[ent_id] = rec
    return rec

def update_entry(db: Session, entry_id: str, *, text: Optional[str] = None,
                 captured_at: Optional[datetime] = None, lang: Optional[str] = None) -> Dict:
    rec = _ENTRIES.get(entry_id)
    if rec is None:
        raise KeyError("not_found")

    if text is not None:
        rec["text"] = text
    if captured_at is not None:
        rec["captured_at"] = captured_at.isoformat()
    if lang is not None:
        rec["lang"] = lang

    _ENTRIES[entry_id] = rec
    return rec

def soft_delete_entry(db: Session, entry_id: str) -> None:
    rec = _ENTRIES.get(entry_id)
    if rec is None:
        raise KeyError("not_found")
    if rec.get("deleted_at"):
        # already deleted; idempotent
        return
    rec["deleted_at"] = datetime.utcnow().isoformat()
    _ENTRIES[entry_id] = rec
