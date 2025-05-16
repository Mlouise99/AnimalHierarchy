SELECT p.first_name, p.last_name 
FROM patients p
JOIN appointments a ON p.id = a.patient_id
JOIN doctors d ON d.id = a.doctor_id
WHERE d.id=1;
--this will output Alice JohnSon and Charlie Brown 
--because they are the one who had appointment with doctor John Smith.

SELECT  p.first_name, p.last_name, m.diagnosis, m.treatment, m.doctor_id, m.created_at
FROM medical_records m
JOIN patients p ON p.id = m.patient_id
WHERE p.first_name='Bob' AND p.last_name='Williams';

--Total number of appointments for each doctor
SELECT 
    d.id AS doctor_id,
    d.first_name,
    d.last_name,
    COUNT(a.id) AS total_appointments FROM
    doctors d LEFT JOIN
    appointments a ON d.id = a.doctor_id GROUP BY
    d.id, d.first_name, d.last_name;
	
--Doctors and number of patients they are attending to
	SELECT 
    d.id AS doctor_id,
    d.first_name,
    d.last_name,
    COUNT(DISTINCT dp.patient_id) AS total_patients
FROM 
    doctors d
LEFT JOIN 
    doctor_patient dp ON d.id = dp.doctor_id
GROUP BY 
    d.id, d.first_name, d.last_name;

	--Update the status of an appointment
	UPDATE appointments
SET status = 'Completed'
WHERE id = 1;
-- Delete a patient's record from the system
DELETE FROM patients
WHERE id = 1; 

--Doctors with more than 5 patients
SELECT 
    d.id,
    d.first_name,
    d.last_name,
    COUNT(DISTINCT dp.patient_id) AS patient_count
FROM 
    doctors d
JOIN 
    doctor_patient dp ON d.id = dp.doctor_id
GROUP BY 
    d.id, d.first_name, d.last_name
HAVING 
    COUNT(DISTINCT dp.patient_id) > 5;

--Patients diagnosed more than once
SELECT 
    p.id,
    p.first_name,
    p.last_name,
    COUNT(m.id) AS diagnosis_count
FROM 
    patients p
JOIN 
    medical_records m ON p.id = m.patient_id
GROUP BY 
    p.id, p.first_name, p.last_name
HAVING 
    COUNT(m.id) > 1;

--Display the total number of appointments scheduled per month
SELECT 
    TO_CHAR(appointment_date, 'YYYY-MM') AS month,
    COUNT(*) AS total_appointments
FROM 
    appointments
GROUP BY 
    TO_CHAR(appointment_date, 'YYYY-MM')
ORDER BY 
    month;


-- Update foreign key in appointments table
ALTER TABLE appointments
    DROP CONSTRAINT IF EXISTS appointments_patient_id_fkey,
    ADD CONSTRAINT appointments_patient_id_fkey
        FOREIGN KEY (patient_id) REFERENCES patients(id) ON DELETE CASCADE;

-- Update foreign key in medical_records
ALTER TABLE medical_records
    DROP CONSTRAINT IF EXISTS medical_records_patient_id_fkey,
    ADD CONSTRAINT medical_records_patient_id_fkey
        FOREIGN KEY (patient_id) REFERENCES patients(id) ON DELETE CASCADE;

-- Update foreign key in doctor_patient
ALTER TABLE doctor_patient
    DROP CONSTRAINT IF EXISTS doctor_patient_patient_id_fkey,
    ADD CONSTRAINT doctor_patient_patient_id_fkey
        FOREIGN KEY (patient_id) REFERENCES patients(id) ON DELETE CASCADE;


