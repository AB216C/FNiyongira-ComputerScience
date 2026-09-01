-- Create Entry(s) Table
CREATE TABLE IF NOT EXISTS app.entries(
    id SERIAL PRIMARY KEY,
    user_id INT NOT NULL REFERENCES app.users(id),
    entry_text VARCHAR(255) NULL, -- (Not going to store it)
    lang VARCHAR(10) DEFAULT 'en', -- ('en' or 'tr')
    source VARCHAR(100) NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);