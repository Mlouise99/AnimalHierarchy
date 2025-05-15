INSERT INTO doctors (first_name, last_name, specialty, phone_number, email)
VALUES
    ('John', 'Smith', 'Cardiology', '123-456-7890', 'john.smith@example.com'),
    ('Jane', 'Doe', 'Pediatrics', '987-654-3210', 'jane.doe@example.com'),
    ('Robert', 'Jones', 'Dermatology', '555-123-4567', 'robert.jones@example.com');

-- Inserting data into the patients table
INSERT INTO patients (first_name, last_name, date_of_birth, gender, email)
VALUES
    ('Alice', 'Johnson', '1990-05-15', 'Female', 'alice.johnson@example.com'),
    ('Bob', 'Williams', '1985-10-22', 'Male', 'bob.williams@example.com'),
    ('Charlie', 'Brown', '2002-03-08', 'Male', 'charlie.brown@example.com');

	-- Inserting data into the appointments table
INSERT INTO appointments (doctor_id, patient_id, appointment_date, status)
VALUES
    (1, 1, '2024-07-20 10:00:00', 'Scheduled'), -- John Smith (Cardiologist) with Alice Johnson
    (2, 2, '2024-07-21 14:30:00', 'Scheduled'), -- Jane Doe (Pediatrician) with Bob Williams
    (1, 3, '2024-07-22 09:00:00', 'Completed');

	-- Inserting data into the medical_records table
INSERT INTO medical_records (patient_id, diagnosis, treatment, doctor_id)
VALUES
    (1, 'Hypertension', 'Prescribed medication A and lifestyle changes', 1),  -- Alice Johnson diagnosed by John Smith
    (2, 'Common Cold', 'Rest and over-the-counter medication', 2),       -- Bob Williams diagnosed by Jane Doe
    (3, 'Acne', 'Topical cream and dietary advice', 3);                   -- Charlie Brown diagnosed by Robert Jones

