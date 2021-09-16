package com.CRM.qa.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection con;

    public static void main(String[] args) {


        try {
            System.out.println("started");
            Class.forName("org.postgresql.Driver");
            System.out.println("loaded");
            con = DriverManager.getConnection("jdbc:postgresql://10.200.200.221:5432/qaconcussion", "postgres", "presagia");
            System.out.println("Java JDBC PostgreSQL Example");
            // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within
            // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver");

            System.out.println("Connected to PostgreSQL database!");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
