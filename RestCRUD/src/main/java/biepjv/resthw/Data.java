/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.resthw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import javax.ws.rs.GET;

public class Data {

    private ConcurrentNavigableMap<Integer, Customer> customers = new ConcurrentSkipListMap<>();
    public static final Data inst = new Data();

    private Data() {
        addCustomer(new Customer("Tom"));
    }

    public List<Customer> get() {
        return new ArrayList(customers.values());
    }

    int addCustomer(Customer c) {
        int newKey = 1;
        if (!customers.isEmpty()) {
            newKey = customers.lastKey() + 1;
        }
        c.setId(newKey);
        customers.put(c.getId(), c);
        return newKey;
    }

    void updateCustomer(Customer c) {
        customers.put(c.getId(), c);

    }
}
