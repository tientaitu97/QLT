/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.impl.BookDAO;
import java.io.IOException;
import javax.jws.WebService;
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
@WebServlet("/book")
public class BookController extends HttpServlet{
       BookDAO bookDao = new BookDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("search");
        String idCustomer = req.getParameter("idCustomer");
        req.setAttribute("idCustomer", idCustomer);
        if(name == null || name.equals("")){
            req.setAttribute("book", bookDao.findAll());
        } else{
            req.setAttribute("book",bookDao.findByName(name));
        }
       RequestDispatcher rd = req.getRequestDispatcher("view/book.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }
    
}
