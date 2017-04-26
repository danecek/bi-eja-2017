/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.backing;

import biepjv.customersjsf.business.Facade;
import biepjv.customersjsf.model.Customer;
import java.util.logging.Logger;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class UpdateCustomer {

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

    @Inject
    Facade facade;

    private Integer custId;
    private Customer customer;
    private String name;

    public void setCustId(Integer custId) {
        this.custId = custId;
        customer = facade.findCustomer(custId);
        
        LOG.info(customer.toString());
        name = customer.getName();
        
        
    }
    private static final Logger LOG = Logger.getLogger(UpdateCustomer.class.getName());

    public Integer getCustId() {
        return custId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String updateCustomer() {
        customer.setName(name);
        facade.updateCustomer(customer);
           return "index?faces-redirect=true";
    }

}
