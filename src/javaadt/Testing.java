/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author thomt9963
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderedList list = new OrderedList();
        list.add(4);
        list.add(10);
        list.add(5);
        list.add(2);
      //  list.remove(4);
       // System.out.println(list.get(0));
        list.printList();
    }
}
