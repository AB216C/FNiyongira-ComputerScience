-- Add Data into app.entry_symptoms Table
INSERT INTO app.entry_symptoms(
    user_id, symptom_code, confidence, severity, attrs, created_at
)VALUES (
    1, 'R51', 0.95, 2, '{"note": "Mild Headache"}', NOW()
),(
    2, 'R51', 0.90, 2, '{"note": "Hafif Baş Ağrısı"}', NOW()
),(
    3, 'N18', 0.80, 1, '{"note": "Edema due to CKD"}', NOW()
),(
    4, 'R07', 0.70, 1, '{"note": "Slight Chest Pain"}', NOW()
),(
    5, 'F32', 0.75, 3, '{"note": "Depresyon"}', NOW()
);