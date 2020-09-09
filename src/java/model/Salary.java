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
public class Salary {
    private int id;
    private int coefficients;

    public Salary() {
    }

    public Salary(int id, int coefficients) {
        this.id = id;
        this.coefficients = coefficients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(int coefficients) {
        this.coefficients = coefficients;
    }
    
}
