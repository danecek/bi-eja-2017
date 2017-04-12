/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersmustache.model;

import java.util.Date;


public class Customer {
    private String name;
        private Date birthDate;

    public Customer(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }
}
