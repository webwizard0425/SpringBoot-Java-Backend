package com.rohit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123@rohit@123"; // Replace with your MySQL password

    public static Connection getConnection() {

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            System.out.println("✅ Database Connected Successfully!");

        } catch (SQLException e) {

            System.out.println("❌ Failed to connect to the database.");
            e.printStackTrace();

        }

        return connection;
    }
}