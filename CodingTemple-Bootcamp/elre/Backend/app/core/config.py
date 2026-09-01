import os
from pydantic import BaseModel

class Settings(BaseModel):
    app_name: str = "ELRE Backend API"
    database_url: str = os.getenv(
        "DATABASE_URL",
        f"postgresql+psycopg2://{os.getenv('POSTGRES_USER','postgres')}:"
        f"{os.getenv('POSTGRES_PASSWORD','postgres')}@"
        f"{os.getenv('POSTGRES_HOST','db')}:"
        f"{os.getenv('POSTGRES_PORT','5432')}/"
        f"{os.getenv('POSTGRES_DB','elre')}"
    )

settings = Settings()
