/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.business;

import biepjv.customersjsf.integration.CustomerDAO;
import biepjv.customersjsf.model.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@Stateless
@FacadeBinder
public class Facade {

    @Inject
    CustomerDAO customerDAO;

    public void addCustomer(Customer c) {
        customerDAO.create(c);
    }

    public List<Customer> allCustomers() {
        return customerDAO.all();
    }

    public Customer findCustomer(int custId) {
        return customerDAO.find(custId);
    }

    public void deleteCustomer(Integer id) {
        customerDAO.delete(id);
    }

}
