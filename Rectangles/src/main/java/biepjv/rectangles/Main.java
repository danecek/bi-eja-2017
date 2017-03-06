/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.rectangles;

/**
 *
 * @author danecek
 */
public class Main {

    public static void main(String[] args) {
        MyRectangle r = new MyRectangle(0, 2, 1, 1);
      //  MyRectangle r2 = new MyRectangle(1, 1, 1, 1);
        System.out.println(r.union(MyRectangle.zero)); // [[0,2], 2,2]
    }
}
