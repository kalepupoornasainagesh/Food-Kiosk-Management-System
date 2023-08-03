/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teamae.dbfiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    private static Connection conn;

    public static Connection getConn() {
        String uid = "root";
        String pwd = "";
        String DB_URL = "jdbc:mysql://localhost:3306/delicacydb?user="+uid+"&password="+pwd;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("Connection established");
        } catch (ClassNotFoundException | SQLException e) {
            e.getStackTrace();
        }
        return conn;
    }
}
