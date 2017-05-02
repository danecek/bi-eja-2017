package biepjv.customersjsf.backing;

import biepjv.customersjsf.business.Facade;
import biepjv.customersjsf.model.Customer;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@Model
public class UpdateCustomer {

    private static final Logger LOG = Logger.getLogger(UpdateCustomer.class.getName());

    @Inject
    Facade facade;
    private Customer customer;

    @PostConstruct
    void init() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpServletRequest req = (HttpServletRequest) fc.getExternalContext().getRequest();
        int custId = Integer.parseInt(req.getParameter("custId"));
        customer = facade.findCustomer(custId);
    }

    public Customer getCustomer() {
        return customer;
    }

    public String update() {
        facade.updateCustomer(customer);
        return "index?faces-redirect=true";
    }

}
