/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;


import dao.IBookDAO;
import dao.impl.BookDAO;
import java.util.List;

import model.Book;
import service.IBookService;

/**
 *
 * @author admin
 */
public class BookService implements IBookService{
    private IBookDAO bookDao;
    public BookService(){
        bookDao = new BookDAO();
    }

    @Override
    public List<Book> findAll() {
       
        return bookDao.findAll();
    }

    @Override
    public List<Book> findByName(String name) {
        return bookDao.findByName(name);
    }
}
