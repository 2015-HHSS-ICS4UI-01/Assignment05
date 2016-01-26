/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author thomt9963
 */
public class OrderedList {

    private Node head;
    private int numItems;
    private boolean isEmpty;

    /**
     * Creates an Empty List
     */
    public OrderedList() {
        head = null;
        numItems = 0;
    }

    /**
     * Add the node to the beginning of the list
     *
     * @param n the node to add
     */
    public void add(int num) {
        Node n = new Node(num);
        int counter = 1;
        if (numItems == 0 || n.getNum() < head.getNum()) {
            n.setNext(head);
            head = n;
        } else {
            Node next = head.getNext(), previ = head;
            while (counter < numItems) {
                if (next == null || num < next.getNum() && num > previ.getNum()) {
                    break;
                }
                counter++;
                next = next.getNext();
                previ = previ.getNext();
            }
            if (counter == numItems) {
                previ.setNext(n);
                n.setPrev(previ);
            } else {
                n.setNext(next);
                next.setPrev(n);
                previ.setNext(n);
                n.setPrev(previ);
            }
        }
        numItems++;
    }

    public void remove(int num) {
        Node current = head;
        int index = 0;
        for (int i = 0; i < numItems; i++) {
            if (current.getNum() == num) {
                break;
            }
            index++;
            current = current.getNext();
        }
        if (index == 0) {
            head = head.getNext();
            // deleting end item
        } else if (index == numItems - 1) {
            // go to the second last node
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.getNext();
            }
            // make it point nowhere
            n.setNext(null);
            // remove from the middle
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.getNext();
            }
            // ask the node for its next next node
            n.setNext(n.getNext().getNext());
        }
        numItems--;
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        if (numItems == 0) {
            return isEmpty;
        } else {
            return false;
        }
    }

    public int get(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n.getNum();
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
}
