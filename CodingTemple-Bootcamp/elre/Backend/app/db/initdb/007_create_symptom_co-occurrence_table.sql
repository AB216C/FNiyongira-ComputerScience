-- Create Symptom Co-Occurrence Table
CREATE TABLE IF NOT EXISTS app.symptom_co_occurrence(
    id SERIAL PRIMARY KEY,
    user_id INT NOT NULL REFERENCES app.users(id) ON DELETE CASCADE,
    symptom_a_id INT NOT NULL REFERENCES ref.icd_terms(id) ON DELETE CASCADE,
    symptom_b_id INT NOT NULL REFERENCES ref.icd_terms(id) ON DELETE CASCADE,
    icd_a_code VARCHAR(20) NOT NULL REFERENCES ref.icd_terms(icd_code),
    icd_b_code VARCHAR(20) NOT NULL REFERENCES ref.icd_terms(icd_code),
    occurrence_count INT DEFAULT 0,
    period_type TEXT NOT NULL CHECK (period_type IN ('daily', 'weekly', 'monthly')),
    period_start DATE NOT NULL,
    period_end DATE NOT NULL,
    last_updated TIMESTAMPTZ DEFAULT NOW(),
    CONSTRAINT unique_user_symptom_pair_period 
        UNIQUE (user_id, symptom_a_id, symptom_b_id, period_type, period_start)
);