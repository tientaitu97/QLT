/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectToDatabase {

    public ConnectToDatabase() {

    }

    public static Connection getConnect() {
        Connection con = null;
        try {
            // Buoc 1: Tai lop Driver  
            Class.forName("com.mysql.jdbc.Driver");

// Buoc 2: Tao doi tuong Connection  
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8080/quanlytruyen?characterEncoding=utf8", "root", "12345");
            System.out.println("Connect success");
        } catch (Exception e) {
            System.out.println("Error When you connect to database is: " + e.getMessage());

        }
        return con;
    }
    public static void main(String[] args) {
        System.out.println(getConnect());

    }

    public void excuteSql(String sql) throws Exception {
        Connection connect = getConnect();
        Statement stmt = connect.createStatement();
        stmt.executeUpdate(sql);
    }

    public static ResultSet selectData(String sql) throws Exception {
        Connection connect = getConnect();
        Statement stmt = connect.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        return rs;
    }
}

