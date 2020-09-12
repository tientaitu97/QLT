/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.IBillDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bill;

/**
 *
 * @author TienTaiTu
 */
public class BillDAO implements IBillDAO {

    @Override
    public int CreateBill(String createDate, String endDate, String customerId, String bookId) {
        String sqlInsertContact = "INSERT INTO QUANLITRUYEN.BILL(ID,create_date,end_date,customer_id,book_id) VALUE (?,?,?,?,?)";
        Connection connection = ConnectToDatabase.getConnect();
        PreparedStatement statement = null;
        int id = getAutoId("QUANLITRUYEN.BILL");
        if (connection != null) {
            try {
                java.util.Date date = new java.util.Date();
                statement = connection.prepareStatement(sqlInsertContact);
                statement.setInt(1, id);
                statement.setString(2, createDate);
                statement.setString(3, endDate);
                statement.setString(4, customerId);
                statement.setString(5, bookId);
                statement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return id;
    }

    private int getAutoId(String table) {
        try {
            String sqlGetAutoId = "SELECT (MAX(ID)+1) AS AUTO_ID FROM " + table;
            ResultSet rs = ConnectToDatabase.selectData(sqlGetAutoId);
            if (rs.next()) {
                return rs.getInt("AUTO_ID");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}
