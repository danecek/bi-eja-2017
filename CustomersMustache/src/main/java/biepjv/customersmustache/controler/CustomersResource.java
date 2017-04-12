/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersmustache.controler;

import biepjv.customersmustache.model.Customer;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.server.mvc.Template;

@Path("")
public class CustomersResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Template(name = "index.mustache")
    public Customer get() {
        return new Customer("Tom", new Date());

    }

}
