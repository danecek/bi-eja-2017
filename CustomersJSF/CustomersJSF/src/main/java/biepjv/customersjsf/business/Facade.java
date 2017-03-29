/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.business;

import biepjv.customersjsf.model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Facade {

    public static final Facade inst = new Facade();

    NavigableMap<Integer, Customer> customers = new ConcurrentSkipListMap<>();

    private Facade() {
        addCustomer(new Customer("Tom"));
        addCustomer(new Customer("Bob"));
    }

    public void addCustomer(Customer c) {
        int id = 1;
        if (!customers.isEmpty()) {
            id = customers.lastKey() + 1;
        }
        c.setId(id);
        customers.put(c.getId(), c);
    }

    public List<Customer> allCustomers() {
        return new ArrayList(customers.values());
    }

}
