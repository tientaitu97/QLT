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
 * @author TienTaiTu
 */
@WebServlet("/create")
public class CreateCustomerController extends HttpServlet {

    CustomerDAO customerDao = new CustomerDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String nameCustomer = req.getParameter("nameCustomer");
            String points = req.getParameter("points");
            String age = req.getParameter("age");
            String gender = req.getParameter("gender");
            String address = req.getParameter("address");
            String contact = req.getParameter("contact");

            customerDao.create(nameCustomer, points, age, gender, address, contact);
        } catch (Exception e) {
            throw e;
        }

        RequestDispatcher rd = req.getRequestDispatcher("view/createCustomer.jsp");
        rd.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
