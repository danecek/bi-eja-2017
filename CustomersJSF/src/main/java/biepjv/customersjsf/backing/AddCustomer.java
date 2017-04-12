/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.backing;

import biepjv.customersjsf.business.Facade;
import biepjv.customersjsf.model.Customer;
import javax.enterprise.inject.Model;

@Model
public class AddCustomer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String addCustomer() {
        Facade.inst.addCustomer(new Customer(name));
        return "index?faces-redirect=true";
    }
}
