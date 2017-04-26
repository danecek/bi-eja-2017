package biepjv.customersjsf.backing;

import biepjv.customersjsf.business.Facade;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class DeleteCustomer {

    @Inject
    Facade facade;
    private int custId;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return facade.findCustomer(custId).getName();
    }

//    private Customer customer;
//
//    @PostConstruct
//    void init() {
//        FacesContext fc = FacesContext.getCurrentInstance();
//        HttpServletRequest req = (HttpServletRequest) fc.getExternalContext().getRequest();
//        int custId = Integer.parseInt(req.getParameter("custId"));
//        customer = Facade.inst.findCustomer(custId);
//    }
    public String delete() {
        facade.deleteCustomer(custId);
        return "index?faces-redirect=true";
    }

}
