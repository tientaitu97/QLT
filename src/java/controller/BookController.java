/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.IBookService;
import service.impl.BookService;

/**
 *
 * @author admin
 */
@WebServlet("/book")
public class BookController extends HttpServlet{
        private IBookService bookService = new BookService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("search");
        String nameCustomer = req.getParameter("select");
        req.setAttribute("nameCustomer", nameCustomer);
        if(name == null || name.equals("")){
            req.setAttribute("book", bookService.findAll());
        } else{
            req.setAttribute("book",bookService.findByName(name));
        }
       RequestDispatcher rd = req.getRequestDispatcher("view/book.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }
    
}
