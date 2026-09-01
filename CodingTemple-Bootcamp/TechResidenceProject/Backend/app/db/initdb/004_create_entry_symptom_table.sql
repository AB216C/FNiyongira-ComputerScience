-- Create Entry Symptoms Table
CREATE TABLE IF NOT EXISTS app.entry_symptoms(
    id SERIAL PRIMARY KEY,
    user_id INT NOT NULL REFERENCES app.users(id),
    symptom_code TEXT NOT NULL REFERENCES ref.icd_terms(icd_code),
    confidence REAL CHECK (confidence >= 0 AND confidence <= 1),
    severity SMALLINT,
    attrs JSONB DEFAULT '{}' :: jsonb,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW() 
);