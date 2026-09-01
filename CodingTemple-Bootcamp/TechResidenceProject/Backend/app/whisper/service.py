import whisper 

model = whisper.load_model("base")

def transcribe_audio(file_path: str):
    res = model.transcribe(file_path, task = "transcribe")
    return{
        "language": res.get("language", "unknown"),
        "transcription": res.get("text", "").strip()
    }