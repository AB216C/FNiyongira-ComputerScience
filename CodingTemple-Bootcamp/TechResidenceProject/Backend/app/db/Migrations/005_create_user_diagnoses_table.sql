-- Create User Diagnoses Table
CREATE TABLE IF NOT EXISTS app.user_diagnoses(
    id SERIAL PRIMARY KEY,
    user_id INT NOT NULL REFERENCES app.users(id),
    diagnosis_code TEXT REFERENCES ref.icd_terms(icd_code),
    source TEXT NOT NULL CHECK (source IN ('self', 'doc', 'dr')) DEFAULT 'self',
    recorded_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);