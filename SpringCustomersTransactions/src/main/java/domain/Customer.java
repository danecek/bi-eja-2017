
package domain;

import java.io.Serializable;

public class Customer implements Serializable {
    
    private String name;

    public Customer(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + '}';
    }
    
}
