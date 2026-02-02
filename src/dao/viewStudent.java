package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import db.DBConnection;

public class viewStudent {
    public void viewStudents() {
        String sql = "SELECT * FROM student";

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("email")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
