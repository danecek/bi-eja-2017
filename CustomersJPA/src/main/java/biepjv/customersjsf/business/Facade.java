/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.business;

import biepjv.customersjsf.integration.CustomerDAO;
import biepjv.customersjsf.integration.OrderDAO;
import biepjv.customersjsf.model.Customer;
import biepjv.customersjsf.model.Order;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@Stateless
@FacadeBinder
public class Facade {

    @Inject
    CustomerDAO customerDAO;
    @Inject
    OrderDAO orderDAO;

    public void addOrder(Integer custId, Order o) {
        orderDAO.create(custId, o);
    }

    public List<Order> allOrders() {
        return orderDAO.all();
    }

    public Order findOrder(int custId) {
        return orderDAO.find(custId);
    }

    public void deleteOrder(Integer id) {
        orderDAO.delete(id);
    }

    public void addCustomer(Customer c) {
        customerDAO.create(c);
    }

    public List<Customer> allCustomers() {
        return customerDAO.all();
    }

    public Customer findCustomer(int custId) {
        return customerDAO.find(custId);
    }
    
    
    public void updateCustomer(Customer customer) {
         customerDAO.update(customer);
    }

    public void deleteCustomer(Integer id) {
        customerDAO.delete(id);
    }
    
    

}
