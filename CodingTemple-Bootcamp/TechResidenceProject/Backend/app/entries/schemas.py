from pydantic import BaseModel
from datetime import datetime
from typing import Optional

class EntryCreate(BaseModel):
    text: Optional[str] = None
    captured_at: Optional[datetime] = None
    lang: Optional[str] = None

class EntryOut(BaseModel):
    id: str
    user_id: str
    captured_at: datetime
    text: Optional[str] = None
    lang: Optional[str] = None
    deleted_at: Optional[str] = None

class EntryUpdate(BaseModel):
    text: Optional[str] = None
    captured_at: Optional[datetime] = None
    lang: Optional[str] = None

    class Config:
        orm_mode = True
