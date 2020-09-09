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
import model.Contact;
import model.Customer;
import model.Person;

/**
 *
 * @author admin
 */
public class CustomerDAO implements ICustomerDAO{

    @Override
    public List<Customer> findAll() {
        List<Customer> results = new ArrayList<>();
         try{
            ResultSet rs = new ConnectToDatabase().selectData("select * from quanlytruyen.customer as c, quanlytruyen.address a, "
               + "quanlytruyen.contact as ct, quanlytruyen.person as p "
               + "where p.address_id = a.id and p.contact_id = ct.id and p.id = c.person_id");
            while (rs.next()){
                Customer customer = new Customer();
                Address address = new Address();
                Person person = new Person();
                Contact contact = new Contact();
                customer.setId(rs.getInt("id"));
                customer.setPoints(rs.getInt("points"));
                person.setAge(rs.getInt("age"));
                person.setGender(rs.getString("gender"));
                person.setName(rs.getString("name"));
                address.setNumber(rs.getInt("number"));
                address.setStreet(rs.getString("street"));
                address.setTown(rs.getString("town"));
                address.setDistrict(rs.getString("district"));
                address.setCity(rs.getString("city"));
                contact.setPhone(rs.getString("phone"));
                person.setAdrress(address);
                person.setContact(contact);
                customer.setPerson(person);
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
       String sql = "select * from quanlytruyen.customer as c, quanlytruyen.address a, "
               + "quanlytruyen.contact as ct, quanlytruyen.person as p "
               + "where p.address_id = a.id and p.contact_id = ct.id and p.id = c.person_id and p.name = ?";
       Connection connection = ConnectToDatabase.getConnect();
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
                Person person = new Person();
                Contact contact = new Contact();
                customer.setId(rs.getInt("id"));
                customer.setPoints(rs.getInt("points"));
                person.setAge(rs.getInt("age"));
                person.setGender(rs.getString("gender"));
                person.setName(rs.getString("name"));
                address.setNumber(rs.getInt("number"));
                address.setStreet(rs.getString("street"));
                address.setTown(rs.getString("town"));
                address.setDistrict(rs.getString("district"));
                address.setCity(rs.getString("city"));
                contact.setPhone(rs.getString("phone"));
                person.setAdrress(address);
                person.setContact(contact);
                customer.setPerson(person);
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
