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
            //    System.out.println("current value is " +current.getNum());

            if (counter == 0) {
                n.setNext(head);
                head.setPrev(n);
                head = n;
                n.setPrev(null);
                numItems++;
            } else if (counter == numItems - 1) {
                n.setPrev(current);
                n.setNext(null);
                current.setNext(n);
            } else {

                n.setPrev(current.getPrev());
                n.setNext(current);
                current.setPrev(n);
                n.getPrev().setNext(n);
                numItems++;
            }
        }
    }

    public void remove(int num) {
        Node current = head;
        while (num != current.getNum() && (current.getNext() != null)) {
            current = current.getNext();
        }

//        
        if (current.getNum() == num) {
            if (current.getNext() == null) {
                current.getPrev().setNext(null);
            } else if (current.getPrev() == null) {

                current.getNext().setPrev(null);
                head = current.getNext();
            } else {
                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());
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

    public void size() {
        System.out.println("the number of items in the list is: " + numItems);
    }

    public void isEmpty() {
        if (numItems == 0) {
            System.out.println("the list is empty");
        }
    }

    public void get(int index) {
        int counter = 0;
        Node current = head;
        while (counter != index) {
            counter++;
            current = current.getNext();
        }
        System.out.println("the number at " + counter + " is " + current.getNum());
    }
}
