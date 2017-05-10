package eja.service;

import eja.domain.Customer;
import eja.persistence.CustomersDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerFacade {

    @Autowired
    CustomersDAO customersDAO;

    public List<Customer> allCustomers() {
        return customersDAO.all();
    }

}
