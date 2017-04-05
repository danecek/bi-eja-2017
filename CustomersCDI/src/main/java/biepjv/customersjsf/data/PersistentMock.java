/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.data;

import biepjv.customersjsf.model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@ApplicationScoped
@Alternative
@Data
public class PersistentMock implements CustomersPersistence {

    NavigableMap<Integer, Customer> customers = new ConcurrentSkipListMap<>();
    
    

    @PostConstruct
    private void init() {
        for (char c = 'A'; c <= 'Z'; c++)
            addCustomer(new Customer(Character.toString(c)));
    }

    @Override
    public void addCustomer(Customer c) {
        int id = 1;
        if (!customers.isEmpty()) {
            id = customers.lastKey() + 1;
        }
        c.setId(id);
        customers.put(c.getId(), c);
    }

    @Override
    public List<Customer> allCustomers() {
        return new ArrayList(customers.values());
    }

    @Override
    public Customer findCustomer(int custId) {
        return customers.get(custId);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customers.remove(id);
    }

}
