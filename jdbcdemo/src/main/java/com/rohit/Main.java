package com.rohit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        // Get database connection
        Connection connection = DBConnection.getConnection();

        if (connection != null) {

            // SQL Query
            String query = "INSERT INTO students(name, age, scity) VALUES (?, ?, ?)";

            try {

                // Create PreparedStatement
                PreparedStatement ps = connection.prepareStatement(query);

                // ---------- Student 1 ----------
                ps.setString(1, "Rohit");
                ps.setInt(2, 21);
                ps.setString(3, "Delhi");
                ps.executeUpdate();

                // ---------- Student 2 ----------
                ps.setString(1, "Aman");
                ps.setInt(2, 22);
                ps.setString(3, "Mumbai");
                ps.executeUpdate();

                // ---------- Student 3 ----------
                ps.setString(1, "Rahul");
                ps.setInt(2, 20);
                ps.setString(3, "Jaipur");
                ps.executeUpdate();

                System.out.println("3 Students Inserted Successfully!");
                /*This code is good for learning, but in a real application you wouldn't repeat the same block three times.
                    A professional version would use a loop or JDBC batch processing, for example:
                    for (...) {
                        ps.setString(...);
                        ps.setInt(...);
                        ps.setString(...);
                        ps.executeUpdate();
                    }
                 */

                // Close PreparedStatement
                ps.close();

                // Close Connection
                connection.close();

            } catch (SQLException e) {

                e.printStackTrace();

            }

        } else {

            System.out.println("Database Connection Failed!");

        }

    }
}