package biepjv.customersjsf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Version;

@NamedQuery(name = "allOrders", query = "SELECT co FROM CustomerOrder co")
@Entity(name = "CustomerOrder")
public class Order {

    @Id
    @GeneratedValue
    private Integer id;
    private String description;
    @ManyToOne(optional = false)
    private Customer customer;
    @Version
    private int version;

    public Order() {
    }

    public Order(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    public int getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", description=" + description + ", version=" + version + '}';
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
