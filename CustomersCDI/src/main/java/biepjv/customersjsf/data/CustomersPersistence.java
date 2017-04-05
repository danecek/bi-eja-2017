/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.data;

import biepjv.customersjsf.model.Customer;
import java.util.List;


public interface CustomersPersistence {

    void addCustomer(Customer c);

    List<Customer> allCustomers();

    void deleteCustomer(Integer id);

    Customer findCustomer(int custId);
    
}
