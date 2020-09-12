/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.impl.BillDAO;
import dao.impl.BookDAO;
import dao.impl.CustomerDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;


/**
 *
 * @author TienTaiTu
 */
@WebServlet("/viewBill")
public class ViewBill extends HttpServlet{
       private BookDAO bookDao = new BookDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idBook = req.getParameter("idBook");
        String idCustomer = req.getParameter("idCustomer");  
        Customer customer = new CustomerDAO().getCustomerById(idCustomer);
        req.setAttribute("nameCustomer", customer.getPerson().getName());
        req.setAttribute("idCustomer", idCustomer);
        req.setAttribute("book", bookDao.getBookById(idBook));
       RequestDispatcher rd = req.getRequestDispatcher("viewBill.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }
    
    
}
