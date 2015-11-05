/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class OrderedList {

    private Node head;
    private int numItems = 0;

    public OrderedList() {
        head = null;
        numItems = 0;
    }

    /**
     * Adds a node at a specific index
     *
     * @param index the position to place the node
     * @param n the node to add
     */
    public void add(Node n) {
        // adding to an empty list 



        if (numItems == 0) {
            n.setNext(head);
            head = n;
            n.setPrev(null);
            numItems++;
        } else {
            Node current = head;
            int counter = 0;
            while (counter < numItems - 1 && current.getNum() < n.getNum()) {
                current = current.getNext();
                counter++;
            }

            if (counter == 0) {
                n.setNext(head);
                head.setPrev(n);
                head = n;
                n.setPrev(null);
                numItems++;
            } else {

                n.setPrev(current.getPrev());
                n.setNext(current);
                current.setPrev(n);
                n.getPrev().setNext(n);
                numItems++;




            }



        }

    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
}
