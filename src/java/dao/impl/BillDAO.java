/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ConnectToDatabase;
import dao.IBillDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import model.Bill;

/**
 *
 * @author TienTaiTu
 */
public class BillDAO implements IBillDAO{

    @Override
    public List<Bill> findAll() {
      return null;
    }

    @Override
    public Bill CreateBill(String id, String name) {
//         Bill results = new Bill();
//         
//        String sql = "";
//        Connection connection = ConnectToDatabase.getConnect();
//        PreparedStatement statement = null;
//        ResultSet rs = null;
//        if(connection != null){
//            try{
//             statement = connection.prepareStatement(sql);
//             statement.setString(1, name);
//             rs = statement.executeQuery();
//              while (rs.next()){
//                
//                
//                results.add(bill);
//                
//            }
//            return results;
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        }
      return null;
    }
    
}
