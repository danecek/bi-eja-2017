/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.resthw;

import javax.ws.rs.PUT;

public class CustomerSubresource {

    @PUT
    public void update(Customer c) {
        Data.inst.updateCustomer(c);
    }

}
