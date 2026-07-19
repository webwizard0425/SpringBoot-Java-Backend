package com.rohit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectStudents {

    public static void main(String[] args) {
        // using select statement
        Connection connection = DBConnection.getConnection();

        if (connection != null) {

            String query = "SELECT * FROM students";

            try {

                PreparedStatement ps = connection.prepareStatement(query);

                ResultSet rs = ps.executeQuery();

                System.out.println("ID\tNAME\tAGE\tCITY");

                while (rs.next()) {

                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    String city = rs.getString("scity");

                    System.out.println(id + "\t" + name + "\t" + age + "\t" + city);
                }

                rs.close();
                ps.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}