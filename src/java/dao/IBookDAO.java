/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Book;

/**
 *
 * @author admin
 */
public interface IBookDAO {
    List<Book> findAll();
    List<Book> findByName(String name);
    Book getBookById(String id);
}
