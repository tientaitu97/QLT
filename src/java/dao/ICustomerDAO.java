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
    void create(String name, String points, String age, String gender, String address, String contact);
}
