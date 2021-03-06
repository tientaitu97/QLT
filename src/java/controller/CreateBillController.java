/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.impl.BillDAO;
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
@WebServlet("/createBill")
public class CreateBillController extends HttpServlet {

    BillDAO billDAO = new BillDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String create_date = req.getParameter("create_date");
            String end_date = req.getParameter("end_date");
            String idBook = req.getParameter("idBook");
            String idCustomer = req.getParameter("idCustomer");
            billDAO.CreateBill(create_date, end_date, idBook, idCustomer);
        } catch (Exception e) {
            throw e;
        }

        RequestDispatcher rd = req.getRequestDispatcher("view/bill.jsp");
        rd.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
