package biepjv.customersjsf.integration;

import biepjv.customersjsf.model.Customer;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;


@Singleton
@Startup
public class Init {

    @Inject
    CustomerDAO customerDAO;

    @PostConstruct
    public void init() {
//        customerDAO.create(new Customer("Tom"));
//        customerDAO.create(new Customer("Bob"));      

    }

}
