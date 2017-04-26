/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.integration;

import biepjv.customersjsf.model.Customer;
import biepjv.customersjsf.model.Order;
import static biepjv.customersjsf.model.Order_.customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class OrderDAO {

    @PersistenceContext
    EntityManager em;

    public void create(Integer custId, Order order) {
        Customer c = em.find(Customer.class, custId);
        order.setCustomer(c);
        em.persist(order);
    }

    public Order find(int id) {
        return em.find(Order.class, id);
    }

    public List<Order> all() {
        TypedQuery<Order> q = em.createNamedQuery("allOrders", Order.class);
        return q.getResultList();
    }

    public void update(Order c) {
        em.merge(c);
    }

    public void delete(int id) {
        em.remove(find(id));
    }

}
