/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.customersjsf.backing;

import biepjv.customersjsf.business.Facade;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class DeleteCustomer {
    
    @Inject
    Facade facade;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
    private int custId;

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
