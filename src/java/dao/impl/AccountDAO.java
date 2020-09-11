/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import Util.HashPassWord;

import dao.IAccountDAO;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author HL2020
 */
public class AccountDAO implements IAccountDAO {

    @Override
    public boolean login(Account account) {
        Connection connection = ConnectToDatabase.getConnect();
        try {
            PreparedStatement stmt = connection.prepareStatement(sqlLogin());
            stmt.setString(1, account.getUserName());
            stmt.setString(2, HashPassWord.hassPassWord(account.getPassWord()));
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (NoSuchAlgorithmException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    private String sqlLogin() {
        return "SELECT * FROM `ACCOUNT` WHERE USERNAME = ? AND PASSWORD = ?";
    }

}
