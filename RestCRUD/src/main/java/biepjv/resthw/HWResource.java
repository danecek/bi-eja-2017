/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.resthw;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("HW")
public class HWResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
//    public Customer hello(@QueryParam("name") @DefaultValue("Anybody") String name) {
//        return new Customer(name, 10);
//    }
    public Response hello(@QueryParam("name") @DefaultValue("Anybody") String name) {
        Customer c = new Customer(name, 10);
        return Response.status(Response.Status.SERVICE_UNAVAILABLE).build();//  ok(c, MediaType.APPLICATION_JSON).build();
    }

}
