ALTER TABLE app.users
  DROP COLUMN IF EXISTS username;

ALTER TABLE app.users
  ALTER COLUMN email SET NOT NULL;

DO $$
BEGIN
  IF NOT EXISTS (
    SELECT 1
    FROM   pg_indexes
    WHERE  schemaname = 'app'
    AND    indexname = 'users_email_key'
  ) THEN
    ALTER TABLE app.users
      ADD CONSTRAINT users_email_key UNIQUE (email);
  END IF;
END $$;