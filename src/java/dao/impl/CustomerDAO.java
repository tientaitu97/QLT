/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

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
            ResultSet rs = new ConnectToDatabase().selectData("select * from quanlitruyen.customer as c, quanlitruyen.address as a, "
               + "quanlitruyen.contact as ct, quanlitruyen.person as p "
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
       String sql = "select * from quanlitruyen.customer as c, quanlitruyen.address as a, "
               + "quanlitruyen.contact as ct, quanlitruyen.person as p "
               + "where p.address_id = a.id and p.contact_id = ct.id and p.id = c.person_id and p.name like ?";
       Connection connection = ConnectToDatabase.getConnect();
        PreparedStatement statement = null;
        ResultSet rs = null;
        if(connection != null){
            try{
             statement = connection.prepareStatement(sql);
             statement.setString(1, "%" +name+ "%");
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

    @Override
    public void create(String name, String points, String age, String gender, String address, String contact ) {
        
         String sql = "insert into quanlitruyen.address(city) value (?);\n" +
"set @address_id = last_insert_id();\n" +
"insert into quanlitruyen.contact(phone) value (?);\n" +
"set @contact_id = last_insert_id();\n" +
"insert into quanlitruyen.person(name, age, gender, address_id, contact_id) value (?, ?, ?, @address_id, @contact_id);\n" +
"set @person_id = last_insert_id();\n" +
"insert into quanlitruyen.customer(points, person_id) value (?, @person_id);"; 

       Connection connection = ConnectToDatabase.getConnect();
        PreparedStatement statement = null;
        if(connection != null){
            try{
             statement = connection.prepareStatement(sql);
             statement.setString(1, address);
             statement.setString(2, contact);
             statement.setString(3, name);
             statement.setString(4, age);
             statement.setString(5, gender);
             statement.setString(6, points);
             
             statement.executeUpdate(sql);
           
           
        } catch (Exception e){
            e.printStackTrace();
      
        }
         
      }
        
       
    }
    
}
