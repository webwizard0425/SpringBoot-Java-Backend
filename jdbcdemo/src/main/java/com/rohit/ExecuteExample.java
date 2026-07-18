package com.rohit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteExample {

    public static void main(String[] args) {

        Connection connection = DBConnection.getConnection();
        // using execute command
        if (connection != null) {

            String query = "SELECT * FROM students";

            try {

                PreparedStatement ps = connection.prepareStatement(query);

                boolean hasResult = ps.execute();

                if (hasResult) {

                    ResultSet rs = ps.getResultSet();
                    // resultset will store all the data from the query u write
                    while (rs.next()) {

                        System.out.println(
                                rs.getInt("id") + " "
                                        + rs.getString("name") + " "
                                        + rs.getInt("age") + " "
                                        + rs.getString("scity")
                        );
                    }

                    rs.close();

                } else {

                    System.out.println("Rows Affected : " + ps.getUpdateCount());

                }

                ps.close();
                connection.close();

            } catch (SQLException e) {

                e.printStackTrace();

            }

        }

    }

}