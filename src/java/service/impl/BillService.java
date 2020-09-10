/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import dao.IBillDAO;
import dao.impl.BillDAO;
import java.util.List;
import model.Bill;
import service.IBillService;

/**
 *
 * @author TienTaiTu
 */
public class BillService implements IBillService{
    private  IBillDAO billDao;
      
    public BillService(){
        billDao = new BillDAO();
    }

    @Override
    public List<Bill> findAll() {
       
        return billDao.findAll();
    }

       } 

