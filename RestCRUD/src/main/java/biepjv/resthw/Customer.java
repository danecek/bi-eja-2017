/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.resthw;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    private String name;
    private int id;

    public Customer(int id, String name) {
        this.name = name;
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the age to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
