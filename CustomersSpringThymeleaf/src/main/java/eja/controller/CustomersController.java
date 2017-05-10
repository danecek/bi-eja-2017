/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja.controller;

import eja.domain.Customer;
import eja.service.CustomerFacade;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CustomersController {

    @Autowired
    CustomerFacade facade;

    @ModelAttribute(name = "customers")
    public List<Customer> customers() {
        return facade.allCustomers();
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
