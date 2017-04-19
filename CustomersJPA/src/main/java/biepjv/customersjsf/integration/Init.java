/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.integration;

import biepjv.customersjsf.model.Customer;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.inject.Inject;


@Singleton
public class Init {

    @Inject
    CustomerDAO customerDAO;

    @PostConstruct
    public void init() {
        customerDAO.create(new Customer("Tom"));
        customerDAO.create(new Customer("Bob"));

    }

}
