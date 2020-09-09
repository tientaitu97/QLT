/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import dao.ICustomerDAO;
import dao.impl.CustomerDAO;
import java.util.List;
import model.Customer;
import service.ICustomerService;

/**
 *
 * @author admin
 */
public class CustomerService implements ICustomerService {
    private ICustomerDAO customerDao;
    public CustomerService(){
        customerDao = new CustomerDAO();
    }

    @Override
    public List<Customer> findAll() {
       
        return customerDao.findAll();
    }

    @Override
    public List<Customer> findByName(String name) {
        return customerDao.findByName(name);
    }
    
}
