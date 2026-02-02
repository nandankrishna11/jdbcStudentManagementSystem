package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import db.DBConnection;
public class deleteStudent {

    public void deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
