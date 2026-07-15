package com.rohit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInputCRUD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Connection connection = DBConnection.getConnection();

        if (connection != null) {

            String query = "INSERT INTO students(name, age, scity) VALUES (?, ?, ?)";

            try {

                PreparedStatement ps = connection.prepareStatement(query);

                System.out.print("Enter Name : ");
                String name = sc.nextLine();

                System.out.print("Enter Age : ");
                int age = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter City : ");
                String city = sc.nextLine();

                ps.setString(1, name);
                ps.setInt(2, age);
                ps.setString(3, city);

                int rows = ps.executeUpdate();

                if (rows > 0) {
                    System.out.println("Student Inserted Successfully!");
                }

                ps.close();
                connection.close();
                sc.close();

            } catch (SQLException e) {

                e.printStackTrace();

            }

        }

    }

}