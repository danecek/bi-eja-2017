/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.resthw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("customers")
@Singleton
public class CustomersResource {

    private Map<Integer, Customer> customers = new ConcurrentHashMap<>();
    static int idCounter=0;

    public CustomersResource() {
        Customer c = new Customer("Tom", ++idCounter);
        customers.put(c.getId(), c);
    }

    @GET
    public List<Customer> get() {
        return new ArrayList(customers.values());
    }

}
