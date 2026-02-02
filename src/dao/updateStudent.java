package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import db.DBConnection;
public class updateStudent {
    public void updateStudent(int id, String name) {
        String sql = "UPDATE student SET name=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Student updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
