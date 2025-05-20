package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    // Database connection details
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/Student Management System";
    private static final String USER ="postgres";
    private static final String PASSWORD = "123";

    // Method to establish a connection to the database
    public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(DB_URL, USER, PASSWORD);
        }
    }


