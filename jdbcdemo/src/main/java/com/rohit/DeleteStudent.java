package com.rohit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {

    public static void main(String[] args) {

        // Step 1: Get Database Connection
        Connection connection = DBConnection.getConnection();

        if (connection != null) {

            // Step 2: SQL Query
            String query = "DELETE FROM students WHERE id = ?";

            try {

                // Step 3: Prepare Statement
                PreparedStatement ps = connection.prepareStatement(query);

                // Step 4: Set Placeholder
                ps.setInt(1, 3);

                // Step 5: Execute Query
                int rowsAffected = ps.executeUpdate();

                // Step 6: Check Result
                if (rowsAffected > 0) {
                    System.out.println("Student Deleted Successfully!");
                } else {
                    System.out.println("Student Not Found!");
                }

                // Step 7: Close Resources
                ps.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}