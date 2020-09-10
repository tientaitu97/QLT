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
import service.IBillService;
import service.impl.BillService;


/**
 *
 * @author TienTaiTu
 */
@WebServlet("/bill")
public class BillController extends HttpServlet{
       private IBillService billService = new BillService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idBook = req.getParameter("select");
        String nameCustomer = req.getParameter("name");
        
        req.setAttribute("nameCustomer", nameCustomer);
            req.setAttribute("bill", billService.findAll());
       RequestDispatcher rd = req.getRequestDispatcher("view/bill.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }
    
    
}
