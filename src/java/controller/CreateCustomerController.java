/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.ICustomerService;
import service.impl.CustomerService;

/**
 *
 * @author TienTaiTu
 */
@WebServlet("/create")
public class CreateCustomerController extends HttpServlet{
     private ICustomerService customerService = new CustomerService();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            
        
        RequestDispatcher rd = req.getRequestDispatcher("view/createCustomer.jsp");
        rd.forward(req, resp);
                
        } catch(Exception e){
            throw e;
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
    }
}
