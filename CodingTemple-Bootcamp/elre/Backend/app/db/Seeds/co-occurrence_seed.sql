-- Add Data into app.symptom_co_occurrence Table
INSERT INTO app.symptom_co_occurrence(
    user_id, symptom_a_id, symptom_b_id, icd_a_code, icd_b_code, occurrence_count, period_type, period_start, period_end, last_updated
)VALUES(
    1, 1, 2, 'R51', 'R07', 3, 'daily', '2025-10-20', '2025-10-20', NOW()
),(
    2, 1, 5, 'R51', 'F32', 2, 'daily', '2025-10-21', '2025-10-21', NOW()
),(
    3, 3, 2, 'N18', 'R07', 1, 'daily', '2025-10-21', '2025-10-21', NOW()
),(
    4, 4, 1, 'R07', 'R51', 1, 'daily', '2025-10-17', '2025-10-17', NOW()
),(
    5, 5, 1, 'F32', 'R51', 1, 'daily', '2025-10-24', '2025-10-24', NOW()
);