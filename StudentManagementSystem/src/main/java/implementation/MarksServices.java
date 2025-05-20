package implementation;

import model.Mark;
import org.example.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarksServices implements StudentManagerInterface <Mark, Integer> {
    @Override
    public void addStudent(Mark entity) throws Exception {
        String sql = "INSERT INTO Marks (student_id, course_id, marks) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, entity.getStudent_id());
            ps.setInt(2, entity.getCourse_id());
            ps.setFloat(3, entity.getMarks());
            ps.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error adding mark: " + e.getMessage());
        }
    }

    @Override
    public Mark getById(Integer id) throws Exception {
        String sql = "SELECT * FROM Marks WHERE student_id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Mark(
                        rs.getInt("student_id"),
                        rs.getInt("course_id"),
                        rs.getFloat("marks")
                );
            }
        }
        return null;
    }

    @Override
    public List<Mark> getAll() throws Exception {
        String sql = "SELECT * FROM Marks";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<Mark> marks = new ArrayList<>();
            while (rs.next()) {
                marks.add(new Mark(
                        rs.getInt("student_id"),
                        rs.getInt("course_id"),
                        rs.getFloat("marks")
                ));
            }
            return marks;
        }
    }

    @Override
    public void update(Mark entity) throws Exception {
        String sql = "UPDATE Marks SET course_id = ?, marks = ? WHERE student_id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, entity.getCourse_id());
            ps.setFloat(2, entity.getMarks());
            ps.setInt(3, entity.getStudent_id());
            ps.executeUpdate();
        }
    }

    @Override
    public void delete(Integer id, int cid) throws Exception {
        String sql = "DELETE FROM Marks WHERE student_id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    @Override
    public void delete(Integer id) throws Exception {

    }
}