-- Activate Trigger Function (008 file)
CREATE TRIGGER trg_update_symptom_statistic_cooccurrence
AFTER INSERT ON app.entry_symptoms
FOR EACH ROW
EXECUTE FUNCTION app.update_symptom_statistic_cooccurrence();