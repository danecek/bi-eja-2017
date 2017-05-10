/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja.domain;

public class Customer {
    
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(long aLong, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + '}';
    }
    
}
