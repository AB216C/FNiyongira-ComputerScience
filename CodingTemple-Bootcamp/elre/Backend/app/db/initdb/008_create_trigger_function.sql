CREATE OR REPLACE FUNCTION app.update_symptom_statistic_cooccurrence()
RETURNS TRIGGER AS $$
DECLARE 
    daily_start DATE;
    weekly_start DATE;
    monthly_start DATE;
    other_symptom RECORD;
BEGIN
    -- Determine start dates for each period
    daily_start := NEW.created_at::date;
    weekly_start := date_trunc('week', NEW.created_at)::date;
    monthly_start := date_trunc('month', NEW.created_at)::date;

    -- DAILY STATISTICS

    INSERT INTO app.symptom_statistics (
        user_id, symptom_id, icd_code, period_type, period_start, period_end, occurrence_count
    )
    VALUES (
        NEW.user_id, NEW.id, NEW.symptom_code, 'daily', daily_start, daily_start, 1
    )
    ON CONFLICT (user_id, symptom_id, period_type, period_start)
    DO UPDATE SET
        occurrence_count = app.symptom_statistics.occurrence_count + 1,
        last_updated = NOW();

    -- WEEKLY STATISTICS

    INSERT INTO app.symptom_statistics (
        user_id, symptom_id, icd_code, period_type, period_start, period_end, occurrence_count
    )
    VALUES (
        NEW.user_id, NEW.id, NEW.symptom_code, 'weekly', weekly_start, (weekly_start + INTERVAL '6 days')::date, 1
    )
    ON CONFLICT (user_id, symptom_id, period_type, period_start)
    DO UPDATE SET
        occurrence_count = app.symptom_statistics.occurrence_count + 1,
        last_updated = NOW();

    -- MONTHLY STATISTICS
    
    INSERT INTO app.symptom_statistics (
        user_id, symptom_id, icd_code, period_type, period_start, period_end, occurrence_count
    )
    VALUES (
        NEW.user_id, NEW.id, NEW.symptom_code, 'monthly',
        monthly_start,
        (date_trunc('month', monthly_start) + INTERVAL '1 month - 1 day')::date,
        1
    )
    ON CONFLICT (user_id, symptom_id, period_type, period_start)
    DO UPDATE SET
        occurrence_count = app.symptom_statistics.occurrence_count + 1,
        last_updated = NOW();

    -- CO-OCCURRENCE TRACKING 

    FOR other_symptom IN
        SELECT symptom_code, id
        FROM app.entry_symptoms
        WHERE user_id = NEW.user_id
          AND created_at::date = daily_start
          AND id <> NEW.id
    LOOP    
        INSERT INTO app.symptom_co_occurrence (
            user_id, symptom_a_id, symptom_b_id, icd_a_code, icd_b_code,
            occurrence_count, period_type, period_start, period_end
        )
        VALUES (
            NEW.user_id,
            LEAST(NEW.id, other_symptom.id),
            GREATEST(NEW.id, other_symptom.id),
            LEAST(NEW.symptom_code, other_symptom.symptom_code),
            GREATEST(NEW.symptom_code, other_symptom.symptom_code),
            1, 'daily', daily_start, daily_start
        )
        ON CONFLICT (user_id, symptom_a_id, symptom_b_id, period_type, period_start)
        DO UPDATE SET
            occurrence_count = app.symptom_co_occurrence.occurrence_count + 1,
            last_updated = NOW();
    END LOOP;

    RETURN NEW;
END;
$$ LANGUAGE plpgsql;
