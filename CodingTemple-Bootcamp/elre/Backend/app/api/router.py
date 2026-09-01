from fastapi import APIRouter

from app.users.router import router as users_router
from app.entries.routers import router as entries_router
from app.catalog.router import router as catalog_router
from app.stats.router import router as stats_router
from app.core.security import router as auth_router
from app.whisper.router import router as whisper_router


api_router = APIRouter(prefix="/v1")

api_router.include_router(users_router, tags=["users"])
api_router.include_router(entries_router, tags=["entries"])
api_router.include_router(catalog_router, tags=["catalog"])
api_router.include_router(stats_router, tags=["stats"])
api_router.include_router(auth_router, tags=["auth"])
api_router.include_router(whisper_router, tags=["transcribe"])

