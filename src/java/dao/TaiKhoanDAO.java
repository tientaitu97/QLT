/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.impl.ConnectToDatabase;
import model.Account;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class TaiKhoanDAO {

    public TaiKhoanDAO() {
    }
    public String loadData() {
       
        try{
            ResultSet rs = new ConnectToDatabase().selectData("select * from Account");
            while (rs.next()){
//                int id = rs.getInt("id");
                String tenTaiKhoan = rs.getString("username");
                String matKhau = rs.getString("password");
                
//                Account account = new Account(id, tenTaiKhoan, matKhau);
                return tenTaiKhoan;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
