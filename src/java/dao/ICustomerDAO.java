/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Customer;

/**
 *
 * @author admin
 */
public interface ICustomerDAO {

    List<Customer> findAll();

    List<Customer> findByName(String name);

    int create(String name, String points, String age, String gender, String address, String phone);

    int createAddress(String address);

    int createContact(String phone);

    int createPerson(String name, String age, String gender, int idAdress, int idContact);

    int createCustomer(int idPersion, String points);
    
    int getAutoId(String table);

}
