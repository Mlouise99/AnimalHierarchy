package org.example;

import implementation.CourseServices;
import implementation.MarksServices;
import implementation.StudentServices;
import model.Course;
import model.Mark;
import model.Student;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentServices studentDAO = new StudentServices();
        CourseServices courseDAO = new CourseServices();
        MarksServices markDAO = new MarksServices();


        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("a. Add Student");
            System.out.println("b. View Student by ID");
            System.out.println("c. Update Student");
            System.out.println("d. Delete Student");
            System.out.println("e. Add Course");
            System.out.println("f. Get All Courses");
            System.out.println("g. View Course by ID");
            System.out.println("h. Update Course");
            System.out.println("i. Delete Course");
            System.out.println("j. Add/Update Mark");
            System.out.println("k. View Student Marks");
            System.out.println("l. Delete Student Mark");
            System.out.println("n. Exit");
            System.out.print("Select: ");

            String choice = sc.nextLine();
            try {
                switch (choice) {
                    case "a" -> {
                        System.out.print("First name: ");
                        String fn = sc.nextLine();
                        System.out.print("Last name: ");
                        String ln = sc.nextLine();
                        System.out.print("Email: ");
                        String em = sc.nextLine();
                        System.out.print("DOB (yyyy-mm-dd): ");
                        LocalDate dob = LocalDate.parse(sc.nextLine());
                        studentDAO.addStudent(new Student(0, fn, ln, em, dob));
                        System.out.println("Student added.");
                    }
                    case "b" -> {
                        System.out.print("ID: ");
                        Student s = studentDAO.getById(Integer.parseInt(sc.nextLine()));
                        System.out.println(s != null ? s : "Not found.");
                    }
                    case "c" -> {
                        System.out.print("Student ID to update: ");
                        int id = Integer.parseInt(sc.nextLine());
                        Student s = studentDAO.getById(id);
                        if (s == null) {
                            System.out.println("Not found.");
                            break; }
                        System.out.print("New email: ");
                        String newEmail = sc.nextLine();
                        s = new Student(id, s.getFirstName(), s.getLastName(), newEmail, s.getDateOfBirth());
                        studentDAO.update(s); System.out.println("Updated.");
                    }
                    case "d" -> {
                        System.out.print("Student ID to delete: ");
                        int studentId = Integer.parseInt(sc.nextLine());
                        studentDAO.delete(studentId);
                        System.out.println("Deleted.");
                    }
                    case "e" -> {
                        System.out.print("Course name: ");
                        String name = sc.nextLine();
                        System.out.print("Description: ");
                        String desc = sc.nextLine();
                        courseDAO.addStudent(new Course(0, name, desc));
                        System.out.println("Course added.");
                    }
                    case "f" -> {
                        for (Course c : courseDAO.getAll())
                            System.out.println(c);
                    }
                    case "g" -> {
                        System.out.print("Course ID: ");
                        Course c = courseDAO.getById(Integer.parseInt(sc.nextLine()));
                        System.out.println(c != null ? c : "Not found.");
                    }
                    case "h" -> {
                        System.out.print("Course ID to update: ");
                        int cid = Integer.parseInt(sc.nextLine());
                        Course c = courseDAO.getById(cid);
                        if (c == null) { System.out.println("Not found."); break; }
                        System.out.print("New name: "); String newName = sc.nextLine();
                        System.out.print("New description: "); String newDesc = sc.nextLine();
                        courseDAO.update(new Course(cid, newName, newDesc));
                        System.out.println("Course updated.");
                    }
                    case "i" -> {
                        System.out.print("Course ID to delete: ");
                        int courseId = Integer.parseInt(sc.nextLine());
                        courseDAO.delete(courseId);
                        System.out.println("Deleted.");
                    }
                    case "j" -> {
                        System.out.print("Student ID: ");
                        int sid = Integer.parseInt(sc.nextLine());
                        System.out.print("Course ID: ");
                        int cid = Integer.parseInt(sc.nextLine());
                        System.out.print("Marks: ");
                        float m = Float.parseFloat(sc.nextLine());
                        markDAO.addStudent(new Mark(sid, cid, m));
                        System.out.println("Mark added/updated.");
                    }
                    case "k" -> {
                        System.out.print("Student ID: ");
                        int studentId = Integer.parseInt(sc.nextLine());
                        List<Mark> marks = Collections.singletonList(markDAO.getById(studentId));
                        if (marks.isEmpty()) {
                            System.out.println("No marks found.");
                        } else {
                            marks.forEach(System.out::println);
                        }
                    }

                    case "l" -> {
                        System.out.print("Student ID: ");
                        int sid = Integer.parseInt(sc.nextLine());
                        System.out.print("Course ID: ");
                        int cid = Integer.parseInt(sc.nextLine());
                        markDAO.delete(sid, cid);
                        System.out.println("Mark deleted.");
                    }
                    case "n" -> {
                        System.out.println("Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}