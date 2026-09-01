FROM python:3.12-slim

RUN apt-get update && apt-get install -y ffmpeg libsndfile1 && apt-get clean

WORKDIR /app

# Copy and install dependencies
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy the app source code
COPY . .

EXPOSE 5500

# Run FastAPI using uvicorn
CMD ["uvicorn", "app.main:app", "--host", "0.0.0.0", "--port", "5500"]
