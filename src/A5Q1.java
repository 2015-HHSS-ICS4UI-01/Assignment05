/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author janaj4926
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderedLinkedList list = new OrderedLinkedList();
        
        list.add(new Node (3));
        list.printList();
        list.add(new Node (2));
        list.printList();
    }
}
