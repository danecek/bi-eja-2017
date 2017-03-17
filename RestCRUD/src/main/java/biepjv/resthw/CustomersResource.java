/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.resthw;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("customers")
@Singleton
public class CustomersResource {

    public CustomersResource() {

    }

    @GET
    public List<Customer> get() {
        return Data.inst.get();
    }

    @PUT
    public Response putId() {
        LOG.info("");
        try {
            int newId = Data.inst.addCustomer(new Customer("Anonymous"));
            return Response.created(new URI("http://localhost:9998/customers/" + newId)).build();
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }
    private static final Logger LOG = Logger.getLogger(CustomersResource.class.getName());

    @Path("{id}")
    public CustomerSubresource create(@PathParam("id") int id) {
        return new CustomerSubresource();
    }

}
