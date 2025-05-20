package model;

import java.util.List;

public class Mark  {
    private int student_id;
    private int course_id;
    private float marks;

    public Mark( int studentId, int courseId, double mark) {

        this.student_id = studentId;
        this.course_id = courseId;
        this.marks = marks;
    }

    public int getStudent_id() {
        return student_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public float getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "student_id=" + student_id +
                ", course_id=" + course_id +
                ", marks=" + marks +
                '}';
    }
}



