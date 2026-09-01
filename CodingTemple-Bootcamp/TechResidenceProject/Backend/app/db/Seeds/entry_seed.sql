-- Add Data into app.entries Table
INSERT INTO app.entries(
    user_id, entry_text, lang, source, created_at
)VALUES(
    1, 'I''m experiencing headaches and a mild fever.', 'en', 'user_input', NOW()
),(
    2, 'Hafif baş ağrıları yaşıyorum.', 'tr', 'user_input', NOW()
),(
    3, 'My legs and stomach are swollen again.', 'en', 'user_input', NOW()
),(
    4, 'Experiencing chest pains.', 'en', 'ICD-11', NOW()
),(
    5, 'Yine moralim bozuk, kendime zarar verme düşünceleriyle boğuşuyorum.', 'tr', 'user_input', NOW()
);