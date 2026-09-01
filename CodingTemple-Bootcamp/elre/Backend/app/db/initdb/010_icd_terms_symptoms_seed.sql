-- Add Data into ref.icd_terms Table
INSERT INTO ref.icd_terms(
    en_name, tr_name, icd_code, embedding, chapter_code, chapter_name, block_code, block_name,
    parent_code, term_type, source, version
)VALUES(
    'Headache', 'Baş Ağrısı', 'R51', NULL,
    '18', 'Symptoms, signs or clinical findings, not elsewhere classified',
    'R50-R69', 'General symptoms and signs',
    NULL, 'term', 'ICD-11', '2025-01'
),(
    'Chest Pain', 'Göğüs Ağrısı', 'R07', NULL,
    '18', 'Symptoms, signs or clinical findings, not elsewhere classified',
    'R00-R09', 'Symptoms and signs involving the circulatory and respiratory systems',
    NULL, 'term', 'ICD-11', '2025-01'
),(
    'Type 2 Diabetes Mellitus', 'Tip 2 Diyabet', 'E11', NULL,
    '05', 'Endocrine, nutritional or metabolic diseases',
    'E10-E14', 'Diabetes mellitus',
    NULL, 'term', 'ICD-11', '2025-01'
),(
    'Chronic Kidney Disease', 'Kronik Böbrek Hastalığı', 'N18', NULL,
    '14', 'Diseases of the genitourinary system',
    'N17-N19', 'Renal failure',
    NULL, 'term', 'ICD-11', '2025-01'
),(
    'Depression', 'Depresyon', 'F32', NULL,
    '06', 'Mental, behavioural or neurodevelopmental disorders',
    'F30-F39', 'Mood [affective] disorders',
    NULL, 'term', 'ICD-11', '2025-01'
);