package implementation;

import model.Course;
import org.example.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public  class CourseServices implements StudentManagerInterface <Course, Integer> {
    @Override
    public void addStudent(Course course) throws Exception {
        String sql = "INSERT INTO Courses (course_name, course_description) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, course.getCourseName());
            ps.setString(2, course.getDescription());
            ps.executeUpdate();
        }
    }

    @Override
    public Course getById(Integer id) throws Exception {
        String sql = "SELECT * FROM Courses WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Course(
                        rs.getInt("id"),
                        rs.getString("course_name"),
                        rs.getString("course_description")
                );
            }
        }
        return null;
    }

    @Override
    public List<Course> getAll() throws Exception {
        String sql = "SELECT * FROM Courses";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<Course> courses = new ArrayList<>();
            while (rs.next()) {
                courses.add(new Course(
                        rs.getInt("id"),
                        rs.getString("course_name"),
                        rs.getString("course_description")
                ));
            }
            return courses;
        }
    }

    @Override
    public void update(Course entity) throws Exception {
        String sql = "UPDATE Courses SET course_name = ?, course_description = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getCourseName());
            ps.setString(2, entity.getDescription());
            ps.setInt(3, entity.getId());
            ps.executeUpdate();
        }
    }

    @Override
    public void delete(Integer id, int cid) throws Exception {

    }

    @Override
    public void delete(Integer id) throws Exception {
        String sql = "DELETE FROM Courses WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error deleting course: " + e.getMessage());
        }
    }


}
