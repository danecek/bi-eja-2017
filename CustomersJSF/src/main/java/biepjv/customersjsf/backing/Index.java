
package biepjv.customersjsf.backing;

import biepjv.customersjsf.business.Facade;
import biepjv.customersjsf.model.Customer;
import java.util.List;
import javax.enterprise.inject.Model;

@Model
public class Index {
    
    public List<Customer> getCustomers() {
        return Facade.inst.allCustomers();
    } 
    
    public int getFirst() {
        return 0;
    }
    
    public int getRows() {
        return 0;
        
    }
    

}
