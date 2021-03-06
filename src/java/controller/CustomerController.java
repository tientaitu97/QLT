/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.impl.CustomerDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author admin
 */
@WebServlet("/customer")
public class CustomerController extends HttpServlet{
    private CustomerDAO customerDAO = new CustomerDAO();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String name = req.getParameter("search");
        if(name == null || name.equals("")){
            req.setAttribute("customer", customerDAO.findAll());
        } else{
            req.setAttribute("customer",customerDAO.findByName(name));
        }
        
        RequestDispatcher rd = req.getRequestDispatcher("view/customer.jsp");
        rd.forward(req, resp);
                
        } catch(Exception e){
            throw e;
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
    }
    
}
