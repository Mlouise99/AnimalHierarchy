--CREATION OF DOCTORS TABLE
CREATE TABLE doctors (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    specialty VARCHAR(100),
    phone_number VARCHAR(20),
    email VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT doctor_unique_email UNIQUE (email)
);

--CREATION OF PATIENTS TABLE
CREATE TABLE patients(
 id SERIAL PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    date_of_birth VARCHAR(100),
    gender VARCHAR(20),
    email VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT patient_unique_email UNIQUE (email)
);

--CREATION OF APPOINTMENTS TABLE
CREATE TABLE appointments(
id SERIAL PRIMARY KEY,
doctor_id INT REFERENCES doctors(id),
patient_id INT REFERENCES patients(id),
appointment_date TIMESTAMP, 
status VARCHAR(100),
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

--CREATION OF MEDICAL_RECORDS TABLE
CREATE TABLE medical_records(
id SERIAL PRIMARY KEY,
patient_id INT REFERENCES patients(id),
diagnosis VARCHAR(500),
treatment VARCHAR(500),
doctor_id INT REFERENCES doctors(id),
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

--Many-to-Many: Patients can have many doctors, and doctors can have many patients 
--(Implement this through a pivottable named doctor_patient )

--PIVOT TABLE TO CREATE MANY-TO-MANY RELATIONSHIP BETWEEN a DOCTOR AND a PATIENT
CREATE TABLE doctor_patient(
doctor_id INT,
patient_id INT,
PRIMARY KEY (doctor_id, patient_id),
FOREIGN KEY (doctor_id) REFERENCES doctors(id),
FOREIGN KEY (patient_id) REFERENCES patients(id)
);