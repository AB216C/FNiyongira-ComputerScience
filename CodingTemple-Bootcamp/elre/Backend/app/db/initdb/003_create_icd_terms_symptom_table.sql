-- Create ICD-Terms/Symptoms Table
CREATE TABLE IF NOT EXISTS ref.icd_terms(
    id SERIAL PRIMARY KEY,
    en_name VARCHAR(100) NOT NULL,
    tr_name VARCHAR(100) NOT NULL,
    icd_code VARCHAR(10) NOT NULL UNIQUE,
    embedding VECTOR(1536),
    chapter_code TEXT NOT NULL,
    chapter_name TEXT NOT NULL,
    block_code TEXT,
    block_name TEXT,
    parent_code TEXT,
    term_type TEXT NOT NULL,
    source TEXT NOT NULL DEFAULT 'ICD-11',
    version TEXT NOT NULL DEFAULT '2025-01'
);