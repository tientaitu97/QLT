/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ConnectToDatabase;
import dao.IBookDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Author;
import model.AuthorBook;
import model.Book;
import model.Price;
import model.Publisher;
import model.Supplier;
import model.Type;

/**
 *
 * @author admin
 */
public class BookDAO implements IBookDAO{
    @Override
    public List<Book> findAll(){
        List<Book> results = new ArrayList<>();
         try{
            ResultSet rs = new ConnectToDatabase().selectData("SELECT b.id, b.name, b.publish_year, a.name, t.name as the_loai, pr.purchase_prive as gia, \n" +
"pb.name as nhaxuatban, s.name as nhaSanXuat\n" +
"FROM quanlitruyen.book as b, quanlitruyen.type as t, \n" +
"quanlitruyen.supplier as s, quanlitruyen.publisher as pb,\n" +
" quanlitruyen.price as pr, quanlitruyen.author_book as ab, quanlitruyen.author as a where b.price_id = pr.id and b.id = ab.book_id and ab.author_id = a.id\n" +
" and b.type_id = t.id and b.supplier_id = s.id and b.publisher_id = pb.id");
            while (rs.next()){
                Book book = new Book();
                Type type = new Type();
                Price price = new Price();
                Publisher publisher = new Publisher();
                Supplier supplier = new Supplier();
                Author author = new Author();
                AuthorBook authorBook = new AuthorBook();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setPublishYear(rs.getString("publish_year"));
                type.setName(rs.getString("the_loai"));
                price.setPurchasePrice(rs.getString("purchase_prive"));
                publisher.setName(rs.getString("nhaxuatban"));
                supplier.setName(rs.getString("nhaSanXuat"));
//                author.setName(rs.getString("name"));
//                authorBook.setAuthor(author);
                book.setPrice(price);
                book.setType(type);
                book.setPublisher(publisher);
                book.setSupplier(supplier);
                results.add(book);
                
            }
            return results;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    };
    public List<Book> findByName(String name){
         List<Book> results = new ArrayList<>();
         
        String sql = "SELECT b.id, b.name, b.publish_year, a.name, t.name, pr.purchase_prive, \n" +
"pb.name, s.name\n" +
"FROM quanlitruyen.book as b, quanlitruyen.type as t, \n" +
"quanlitruyen.supplier as s, quanlitruyen.publisher as pb,\n" +
" quanlitruyen.price as pr, quanlitruyen.author_book as ab, quanlitruyen.author as a where b.price_id = pr.id and b.id = ab.book_id and ab.author_id = a.id\n" +
" and b.type_id = t.id and b.supplier_id = s.id and b.publisher_id = pb.id and p.name = ?";
        Connection connection = ConnectToDatabase.getConnect();
        PreparedStatement statement = null;
        ResultSet rs = null;
        if(connection != null){
            try{
             statement = connection.prepareStatement(sql);
             statement.setString(1, name);
             rs = statement.executeQuery();
              while (rs.next()){
                Book book = new Book();
                Type type = new Type();
                Price price = new Price();
                Publisher publisher = new Publisher();
                Supplier supplier = new Supplier();
                
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setPublishYear(rs.getString("publish_year"));
                type.setName(rs.getString("name"));
                price.setPurchasePrice(rs.getString("purchase_prive"));
                publisher.setName(rs.getString("name"));
                supplier.setName(rs.getString("name"));
                book.setPrice(price);
                book.setType(type);
                book.setPublisher(publisher);
                book.setSupplier(supplier);
                results.add(book);
                
            }
            return results;
        } catch (Exception e){
            e.printStackTrace();
        }
        }
        return null;
    }
}
