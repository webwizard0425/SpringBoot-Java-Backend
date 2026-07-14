package com.rohit;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.*;
import java.sql.SQLException;

public class Updatestudents {
    public static void main(String[] args) {

        Connection connection = DBConnection.getConnection();

        if( connection != null ) {
            String query = "UPDATE  students SET scity = ? where age = ?";
            try{

                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1,"jaipur");
                ps.setInt(2,21);

                int rowAffected = ps.executeUpdate();
                if (rowAffected > 0) {
                    System.out.println("Student Updated successfully");
                }else{
                    System.out.println("NO STUDENT FOUND");
                }

                ps.close();
                connection.close();

            }catch (SQLException e){
                e.printStackTrace();
            }

        }
    }
}
