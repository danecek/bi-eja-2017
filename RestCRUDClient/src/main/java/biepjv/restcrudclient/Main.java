
package biepjv.restcrudclient;

public class Main {
    public static void main(String[] args) {
        CustomersProxy.inst.create(new Customer("Bob"));
        System.out.println(CustomersProxy.inst.all());
    }
}
