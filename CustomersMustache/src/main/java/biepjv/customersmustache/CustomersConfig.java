/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersmustache;

import biepjv.customersmustache.controler.CustomersResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.MvcFeature;
import org.glassfish.jersey.server.mvc.mustache.MustacheMvcFeature;

@javax.ws.rs.ApplicationPath("customers")
public class CustomersConfig extends ResourceConfig {

    public CustomersConfig() {
        super(CustomersResource.class);
        property(MustacheMvcFeature.TEMPLATE_BASE_PATH, "WEB-INF");
   //     register(MvcFeature.class);
        register(MustacheMvcFeature.class);
    }

}
