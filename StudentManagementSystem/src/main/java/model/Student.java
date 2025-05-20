package model;
import java.time.LocalDate;

public class Student {

        private int id;
        private String first_name, last_name, email;
        private LocalDate dateOfBirth;

        public Student(int id, String fn, String ln, String email, LocalDate dob) {
            this.id = id;
            this.first_name = fn;
            this.last_name = ln;
            this.email = email;
            this.dateOfBirth = dob;
        }

        // Getters & Setters

        public int getId() { return id; }
        public String getFirstName() { return first_name; }
        public String getLastName() { return last_name; }
        public String getEmail() { return email; }
        public LocalDate getDateOfBirth() { return dateOfBirth; }
        public void setId(int id) { this.id = id; }

        @Override
        public String toString() {
            return id + ": " + first_name + " " + last_name + " (" + email + ")";
        }
    }


