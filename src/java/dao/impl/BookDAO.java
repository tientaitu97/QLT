/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;


import dao.IBookDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
            ResultSet rs = ConnectToDatabase.selectData("SELECT b.id, b.name, b.publish_year, b.author, t.name as the_loai, pr.purchase_prive as gia, \n" +
"pb.name as nhaxuatban, s.name as nhaSanXuat\n" +
"FROM quanlitruyen.book as b, quanlitruyen.type as t, \n" +
"quanlitruyen.supplier as s, quanlitruyen.publisher as pb,\n" +
" quanlitruyen.price as pr where b.price_id = pr.id\n" +
" and b.type_id = t.id and b.supplier_id = s.id and b.publisher_id = pb.id");
            while (rs.next()){
                Book book = new Book();
                Type type = new Type();
                Price price = new Price();
                Publisher publisher = new Publisher();
                Supplier supplier = new Supplier();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setPublishYear(rs.getString("publish_year"));
                book.setAuthor(rs.getString("author"));
                type.setName(rs.getString("the_loai"));
                price.setPurchasePrice(rs.getString("gia"));
                publisher.setName(rs.getString("nhaxuatban"));
                supplier.setName(rs.getString("nhaSanXuat"));
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
         
        String sql = "SELECT b.id, b.name, b.publish_year, b.author, t.name as the_loai, pr.purchase_prive as gia, \n" +
"pb.name as nhaxuatban, s.name as nhaSanXuat\n" +
"FROM quanlitruyen.book as b, quanlitruyen.type as t, \n" +
"quanlitruyen.supplier as s, quanlitruyen.publisher as pb,\n" +
" quanlitruyen.price as pr where b.price_id = pr.id\n" +
" and b.type_id = t.id and b.supplier_id = s.id and b.publisher_id = pb.id and b.name like ?";
        Connection connection = ConnectToDatabase.getConnect();
        PreparedStatement statement = null;
        ResultSet rs = null;
        if(connection != null){
            try{
             statement = connection.prepareStatement(sql);
             statement.setString(1,"%"+ name+ "%");
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
                type.setName(rs.getString("the_loai"));
                price.setPurchasePrice(rs.getString("gia"));
                publisher.setName(rs.getString("nhaxuatban"));
                supplier.setName(rs.getString("nhaSanXuat"));
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
