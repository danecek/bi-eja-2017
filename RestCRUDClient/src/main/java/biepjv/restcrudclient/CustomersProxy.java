/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.restcrudclient;

import java.net.URI;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.filter.LoggingFilter;

public class CustomersProxy {

    public static final CustomersProxy inst = new CustomersProxy();
    private final WebTarget customersResource;

    private CustomersProxy() {
        Client c = ClientBuilder.newClient();
        customersResource = c.target("http://localhost:9998/customers");
        customersResource.register(new LoggingFilter());
    }

    public List<Customer> all() {
        return customersResource.request(MediaType.APPLICATION_XML).
                get(new GenericType<List<Customer>>() {
                });
    }

    public void create(Customer customer) {
        Response resp = customersResource.request(MediaType.APPLICATION_XML).
                put(Entity.text(""));
        if (resp.getStatus() != Response.Status.CREATED.getStatusCode()) {
            throw new RuntimeException(resp.getStatusInfo().getReasonPhrase());
        }
        URI uri = resp.getLocation();
        String usris = uri.toString();
        String id = usris.substring(usris.lastIndexOf('/') + 1);
        customer.setId(Integer.parseInt(id));
        customersResource.path(id).
                request(MediaType.APPLICATION_XML).
                put(Entity.xml(customer), Customer.class);
    }

}
