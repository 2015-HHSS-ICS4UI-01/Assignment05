/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author kampn2687
 */
public class Testing {

    public static void main(String[] args) {
        OrderedList list = new OrderedList();
        list.add(5);
        list.add(0);
        list.add(-1);
        list.add(8);
       list.remove(8);
        System.out.println(list.get(3));
        //list.printList();

    }
}
