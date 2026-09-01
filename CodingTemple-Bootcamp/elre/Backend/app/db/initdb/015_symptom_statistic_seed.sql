-- Add Data into app.symptom_statistics Table
INSERT INTO app.symptom_statistics(
    user_id, symptom_id, icd_code, period_type, period_start, period_end, occurrence_count, last_updated
)VALUES(
    1, 1, 'R51', 'daily', '2025-10-20', '2025-10-20' , 1, NOW()
),(
    2, 2, 'R51', 'daily', '2025-10-21', '2025-10-21', 2, NOW()
),(
    3, 3, 'N18', 'daily', '2025-10-21', '2025-10-21', 1, NOW()
),(
    4, 4, 'R07', 'daily', '2025-10-17', '2025-10-17', 1, NOW()
),(
    5, 5, 'F32', 'daily', '2025-10-24', '2025-10-24', 1, NOW()
);