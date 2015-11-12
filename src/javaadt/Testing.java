/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author simma1980
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(6);
        list.add(11);
        list.add(9);
        
        list.get(0);
        list.get(1);
        list.get(2);
        
        list.remove(11);
        
        list.get(0);
        list.get(1);
        list.get(2);
    }
}
