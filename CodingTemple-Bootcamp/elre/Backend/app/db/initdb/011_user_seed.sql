-- Add Data into app.user Table
INSERT INTO app.users(
    first_name, last_name, email, locale, auth_provider,
    external_user_id, is_active, created_at, updated_at, last_login_at 
)VALUES(
    'John', 'Doe', 'john.doe@example.com', 'en', 'auth0',
    'auth0|jd123', TRUE, NOW(), NOW(), NOW()
),(
    'Ayse', 'Kara', 'ayse.kara@example.com', 'tr', 'google',
    'google|ak456', TRUE, NOW(), NOW(), NOW()
),(
    'Emily', 'Clark', 'emily.clark@example.com', 'en', 'facebook',
    'facebook|ak457', TRUE, NOW(), NOW(), NOW()
),(
    'David', 'Lee', 'david.lee@example.com', 'en', 'auth0',
    'auth0|dl789', FALSE, NOW(), NOW(), NOW()
),(
    'Fatma', 'Yilmaz', 'fatma.yilmaz@example.com', 'tr', 'facebook',
    'facebook|fy234', TRUE, NOW(), NOW(), NOW()
);