/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.restcrudclient;

/**
 *
 * @author danecek
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(CustomersProxy.inst.all());
    }
}
