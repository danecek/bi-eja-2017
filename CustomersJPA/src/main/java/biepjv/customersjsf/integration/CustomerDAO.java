/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.integration;

import biepjv.customersjsf.model.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class CustomerDAO {

    @PersistenceContext
    EntityManager em;

    public void create(Customer customer) {
        em.persist(customer);
    }

    public Customer find(int id) {
        return em.find(Customer.class, id);
    }

    public List<Customer> all() {
        TypedQuery<Customer> q = em.createQuery("SELECT c FROM Customer c", Customer.class);
        return q.getResultList();
    }

    public void update(Customer c) {
        em.merge(c);
    }

    public void delete(int id) {
        em.remove(find(id));
    }

}
