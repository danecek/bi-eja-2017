/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.business;

import biepjv.customersjsf.data.CustomersPersistence;
import biepjv.customersjsf.data.Data;
import biepjv.customersjsf.model.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@Stateless
@FacadeBinder
public class Facade {
    
    @Inject @Data
    CustomersPersistence custPers;

    public void addCustomer(Customer c) {
        custPers.addCustomer(c);
    }

    public List<Customer> allCustomers() {
        return custPers.allCustomers();
    }

    public Customer findCustomer(int custId) {
        return custPers.findCustomer(custId);
    }

    public void deleteCustomer(Integer id) {
        custPers.deleteCustomer(id);
    }

}
