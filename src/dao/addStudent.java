package dao;

import model.Student;
import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class addStudent {
    public void addStudent(Student s {
        String query="INSERT INTO student VALUES (?,?,?)";
        try(
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);

        ){
            ps.setInt(1,s.getId());
            ps.setString(2,s.getName());
            ps.setString(3, s.getEmail());

            ps.executeUpdate();
            System.out.println("Student added successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    }


}
