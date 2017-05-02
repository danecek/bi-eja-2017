package biepjv.customersjsf.backing;

import biepjv.customersjsf.business.Facade;
import biepjv.customersjsf.model.Customer;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
public class Index implements Serializable {

    int firstRow;
    int rows;
    final int MAX_ROWS = 4;

    @Inject
    Conversation conversation;

    @Inject
    Facade facade;

    @PostConstruct
    void init() {
        conversation.begin();
    }

    public List<Customer> getCustomers() {
        return facade.allCustomers();
    }

    public int getFirst() {
        return firstRow;
    }

    public int getRows() {
        return Math.min(getCustomers().size() - firstRow, MAX_ROWS);

    }
    
    public void first() {
       firstRow = 0;
    }

    public void next() {
       firstRow = Math.min(firstRow + MAX_ROWS, getCustomers().size() - 1);
    }

    public void prev() {
       firstRow = Math.max(0, firstRow - MAX_ROWS);
    }

    public void last() {
       firstRow = Math.max(0, getCustomers().size()- MAX_ROWS);
    }

}
