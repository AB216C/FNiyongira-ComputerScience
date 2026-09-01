-- Create User Table
CREATE TABLE IF NOT EXISTS app.users(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    locale TEXT NULL, -- (for lang)
    auth_provider TEXT, --(ex: auth0)
    external_user_id TEXT UNIQUE, --(0ICD 'sub' (ex: auth0|abc123))
    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    last_login_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);