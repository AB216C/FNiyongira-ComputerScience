-- Create Symptom Statistics Table
-- This SQL file will combine all three statistic tables (daily, weekly, and monthly)
CREATE TABLE IF NOT EXISTS app.symptom_statistics(
    id SERIAL PRIMARY KEY,
    user_id INT NOT NULL REFERENCES app.users(id) ON DELETE CASCADE,
    symptom_id INT NOT NULL REFERENCES app.entry_symptoms(id) ON DELETE CASCADE,
    icd_code VARCHAR(20) NOT NULL REFERENCES ref.icd_terms(icd_code),
    period_type TEXT CHECK(period_type IN ('daily', 'weekly', 'monthly')) NOT NULL,
    period_start DATE NOT NULL,
    period_end DATE NOT NULL,
    occurrence_count INT DEFAULT 0,
    last_updated TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    UNIQUE(user_id, symptom_id, period_type, period_start)
);