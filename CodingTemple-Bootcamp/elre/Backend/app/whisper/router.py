from fastapi import APIRouter, UploadFile, File, HTTPException
from app.whisper.service import transcribe_audio
import tempfile, os

router = APIRouter(prefix="/whisper", tags=["transcribe"])

@router.post("/transcribe")
async def transcribe(file: UploadFile = File(...)):
    try:
        with tempfile.NamedTemporaryFile(delete=False, suffix=file.filename) as tmpfile:
            tmpfile.write(await file.read())
            tmp_path = tmpfile.name
        
        res = transcribe_audio(tmp_path)
        os.remove(tmp_path)

        return{
            "status": "success",
            "detected_language": res["language"],
            "transcription": res["transcription"]
        }
    
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))