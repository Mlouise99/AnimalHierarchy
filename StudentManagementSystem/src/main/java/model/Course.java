package model;

public class Course {


        private int id;
        private String course_name;
        private String course_description;

        public Course(int id, String name, String desc) {
            this.id = id;
            this.course_name = name;
            this.course_description= desc;
        }

        public int getId() { return id; }
        public String getCourseName() { return course_name; }
        public String getDescription() { return course_description; }

        public void setId(int id) { this.id = id; }

        @Override
        public String toString() {
            return id + ": " + course_name + " - " + course_description;
        }
    }


