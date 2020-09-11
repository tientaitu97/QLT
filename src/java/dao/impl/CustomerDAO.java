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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Address;
import model.Contact;
import model.Customer;
import model.Person;

/**
 *
 * @author admin
 */
public class CustomerDAO implements ICustomerDAO {

    @Override
    public List<Customer> findAll() {
        List<Customer> results = new ArrayList<>();
        try {
            ResultSet rs = ConnectToDatabase.selectData("select * from quanlitruyen.customer as c, quanlitruyen.address as a, "
                    + "quanlitruyen.contact as ct, quanlitruyen.person as p "
                    + "where p.address_id = a.id and p.contact_id = ct.id and p.id = c.person_id");
            while (rs.next()) {
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
        } catch (Exception e) {
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
        if (connection != null) {
            try {
                statement = connection.prepareStatement(sql);
                statement.setString(1, "%" + name + "%");
                rs = statement.executeQuery();
                while (rs.next()) {
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
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
        return null;
    }

    @Override
    public int create(String name, String points, String age, String gender, String address, String phone) {
        int idAddress = createAddress(address);
        int idContact = createContact(phone);
        int idPerson = createPerson(name, age, gender, idAddress, idContact);
        return createCustomer(idPerson, points);
    }

    @Override
    public int createAddress(String address) {
        String sqlInsertAddress = "INSERT INTO QUANLITRUYEN.ADDRESS(CITY, ID) VALUE (?,?)";
        Connection connection = ConnectToDatabase.getConnect();
        PreparedStatement statement = null;
        int id = getAutoId("QUANLITRUYEN.ADDRESS");
        if (connection != null) {
            try {
                statement = connection.prepareStatement(sqlInsertAddress);
                statement.setString(1, address);
                statement.setInt(2, id);
                statement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return id;
    }

    @Override
    public int createContact(String phone) {
        String sqlInsertContact = "INSERT INTO QUANLITRUYEN.CONTACT(PHONE, ID) VALUE (?,?)";
        Connection connection = ConnectToDatabase.getConnect();
        PreparedStatement statement = null;
        int id = getAutoId("QUANLITRUYEN.CONTACT");
        if (connection != null) {
            try {
                statement = connection.prepareStatement(sqlInsertContact);
                statement.setString(1, phone);
                statement.setInt(2, id);
                statement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return id;
    }

    @Override
    public int createPerson(String name, String age, String gender, int idAdress, int idContact) {
        String sqlInsertPerson = "INSERT INTO QUANLITRUYEN.PERSON(NAME, AGE, GENDER, ADDRESS_ID, CONTACT_ID, ID) VALUE (?, ?, ?, ?, ?, ?)";
        Connection connection = ConnectToDatabase.getConnect();
        PreparedStatement statement = null;
        int id = getAutoId("QUANLITRUYEN.PERSON");
        if (connection != null) {
            try {
                statement = connection.prepareStatement(sqlInsertPerson);
                statement.setString(1, name);
                statement.setString(2, age);
                statement.setString(3, gender);
                statement.setInt(4, idAdress);
                statement.setInt(5, idContact);
                statement.setInt(6, id);
                statement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return id;

    }

    @Override
    public int createCustomer(int idPersion, String points) {
        String sqlInsertCustomer = "INSERT INTO QUANLITRUYEN.CUSTOMER(POINTS, PERSON_ID, ID) VALUE (?, ?, ?)";
        Connection connection = ConnectToDatabase.getConnect();
        PreparedStatement statement = null;
        int id = getAutoId("QUANLITRUYEN.CUSTOMER");
        if (connection != null) {
            try {
                statement = connection.prepareStatement(sqlInsertCustomer);
                statement.setString(1, points);
                statement.setInt(2, idPersion);
                statement.setInt(3, id);
                statement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return id;
    }

    @Override
    public int getAutoId(String table) {
        try {
            String sqlGetAutoId = "SELECT (MAX(ID)+1) AS AUTO_ID FROM "+table;
            ResultSet rs = ConnectToDatabase.selectData(sqlGetAutoId);
            if(rs.next()){
                return rs.getInt("AUTO_ID");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}
