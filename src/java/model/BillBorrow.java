/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class BillBorrow {
    private int id;
    private String nameCustommer;
    private String nameBook;
    private String createDate;
    private String endDate;
    private Customer customer;
    private Borrow borrow;

    public BillBorrow() {
    }

    public BillBorrow(int id, String nameCustommer, String nameBook, String createDate, String endDate, Customer customer, Borrow borrow) {
        this.id = id;
        this.nameCustommer = nameCustommer;
        this.nameBook = nameBook;
        this.createDate = createDate;
        this.endDate = endDate;
        this.customer = customer;
        this.borrow = borrow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCustommer() {
        return nameCustommer;
    }

    public void setNameCustommer(String nameCustommer) {
        this.nameCustommer = nameCustommer;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Borrow getBorrow() {
        return borrow;
    }

    public void setBorrow(Borrow borrow) {
        this.borrow = borrow;
    }
    
}
