
package biepjv.customersjsf.backing;

import biepjv.customersjsf.business.Facade;
import biepjv.customersjsf.model.Customer;
import java.util.List;
import javax.enterprise.inject.Model;

@Model
public class Index {
    
    private String name;
    
    public List<Customer> getCustomers() {
        return Facade.inst.allCustomers();
    } 


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String addCustomer() {
        Facade.inst.addCustomer(new Customer(name));
        name = null;
        return "index";
    }
}
