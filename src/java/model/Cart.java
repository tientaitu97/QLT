/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Cart {
    private int id;
    private String disCountCode;
    private int quantityPurchase;
    private List<Book> book = new ArrayList<>();

    public Cart() {
    }

    public Cart(int id, String disCountCode, int quantityPurchase) {
        this.id = id;
        this.disCountCode = disCountCode;
        this.quantityPurchase = quantityPurchase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisCountCode() {
        return disCountCode;
    }

    public void setDisCountCode(String disCountCode) {
        this.disCountCode = disCountCode;
    }

    public int getQuantityPurchase() {
        return quantityPurchase;
    }

    public void setQuantityPurchase(int quantityPurchase) {
        this.quantityPurchase = quantityPurchase;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

   
}
