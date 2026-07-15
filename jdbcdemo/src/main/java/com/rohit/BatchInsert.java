package com.rohit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchInsert {

    public static void main(String[] args) {

        Connection connection = DBConnection.getConnection();

        if (connection != null) {

            String query =
                    "INSERT INTO students(name,age,scity) VALUES(?,?,?)";

            try {

                PreparedStatement ps =
                        connection.prepareStatement(query);

                // Student 1
                ps.setString(1, "A");
                ps.setInt(2, 18);
                ps.setString(3, "Delhi");
                ps.addBatch();

                // Student 2
                ps.setString(1, "B");
                ps.setInt(2, 19);
                ps.setString(3, "Mumbai");
                ps.addBatch();

                // Student 3
                ps.setString(1, "C");
                ps.setInt(2, 20);
                ps.setString(3, "Pune");
                ps.addBatch();

                // Execute all inserts together
                int[] result = ps.executeBatch();

                System.out.println("Total Queries Executed : "
                        + result.length);

                ps.close();
                connection.close();

            } catch (SQLException e) {

                e.printStackTrace();

            }

        }

    }

}