-- Add Data into app.user_diagnoses Table
INSERT INTO app.user_diagnoses(
    user_id, diagnosis_code, source, recorded_at
)VALUES(
    1, 'R51', 'self', NOW()
),(
    2, 'R51', 'self', NOW()
),(
    3, 'N18', 'self', NOW()
),(
    4, 'R07', 'doc', NOW()
),(
    5, 'F32', 'self', NOW()
);