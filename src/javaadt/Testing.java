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
        list.add(new Node(4));
        list.add(new Node(10));
        list.add(new Node(5));
        list.add(new Node(2));
        list.get(0);
        list.printList();
    }
}
