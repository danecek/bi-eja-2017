/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.restcrudclient;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;


public class CustomersProxy {
    public static final CustomersProxy inst = new CustomersProxy();
    private final WebTarget customersResource;

    private CustomersProxy() {
        Client c = ClientBuilder.newClient();
        customersResource = c.target("http://localhost:9998/customers");
    }
    
    public List<Customer> all() {
       return customersResource.request(MediaType.APPLICATION_XML).
               get(new GenericType<List<Customer>>(){});
        
    }
    
    
}
