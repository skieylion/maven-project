package com.dmdev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try (Connection connection = open()) {
            Statement statemen = connection.createStatement();
            ResultSet resultSet = statemen.executeQuery("select * from aircraft");
            resultSet.next();
            System.out.println(resultSet.getInt("id"));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Connection open() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5434/testdb", "test", "test");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
