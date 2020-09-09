/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ConnectToDatabase;
import dao.ICustomerDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Address;
import model.Customer;

/**
 *
 * @author admin
 */
public class CustomerDAO implements ICustomerDAO{

    @Override
    public List<Customer> findAll() {
        List<Customer> results = new ArrayList<>();
         try{
            ResultSet rs = new ConnectToDatabase().selectData("select * from Customer");
            while (rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setPoints(rs.getInt("points"));
                customer.setAge(rs.getInt("age"));
                customer.setGender(rs.getString("gender"));
                customer.setName(rs.getString("name"));
//                customer.getAdrress().setId(rs.getInt("id"));
//                customer.getContact().setId(rs.getInt("id"));
                
                results.add(customer);
                
            }
            return results;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
       List<Customer> results = new ArrayList<>();
       String sql = "select * from customer  where name = ?";
       Connection connection = new ConnectToDatabase().getConnect();
        PreparedStatement statement = null;
        ResultSet rs = null;
        if(connection != null){
            try{
             statement = connection.prepareStatement(sql);
             statement.setString(1, name);
             rs = statement.executeQuery();
            while (rs.next()){
                Customer customer = new Customer();
                Address address = new Address();
                customer.setId(rs.getInt("id"));
                customer.setPoints(rs.getInt("points"));
                customer.setAge(rs.getInt("age"));
                customer.setGender(rs.getString("gender"));
                customer.setName(rs.getString("name"));
//                address.setNumber(rs.getInt("number"));
//                address.setStreet("street");
//                customer.getAdrress().toString();
//                customer.getContact().setId(rs.getInt("id"));
                
                results.add(customer);
                
            }
            return results;
        } catch (Exception e){
            e.printStackTrace();
      
        }
         
      }
        return null;
    }
    
}
