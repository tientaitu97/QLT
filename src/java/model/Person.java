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
public class Person {
    private int id;
    private String gender;
    private int age;
    private String name;
    private Address adrress;
    private Contact contact;
   

    public Person(int id, String gender, int age, String name, Address adrress, Contact contact) {
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.name = name;
        this.adrress = adrress;
        this.contact = contact;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdrress() {
        return adrress;
    }

    public void setAdrress(Address adrress) {
        this.adrress = adrress;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
