/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderedList list = new OrderedList();
        list.add(new Node(1));
        list.add(new Node(5));
        list.add(new Node(3));
        list.add(new Node(11));
        list.printList();
        System.out.println("");

        list.printList();
        
    }
}

