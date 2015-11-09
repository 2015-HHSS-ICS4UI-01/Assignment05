/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author branc2347
 */
public class OrderedList {

    private Node head;
    private int numItems;

    /**
     * Creates an Empty List
     */
    public OrderedList() {
        head = null;
        numItems = 0;
    }

    /**
     * Adds a node at a specific index
     *
     * @param num
     */
    public void add(int num) {
        Node temp = new Node(num);
        Node current = head;
        if (numItems == 0) {
            temp.setNext(head);
            head = temp;
        } else if (head.getNum() > num) {
            temp.setNext(current);
            head = temp;
        } else {
            current = head;
            for (int j = 0; j < numItems - 1; j++) {
                if (current.getNext().getNum() < num) {
                    current = current.getNext();
                }
            }
            temp.setNext(current.getNext());
            current.setNext(temp);
        }
        numItems++;
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }

    public boolean isEmpty() {
        if (numItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void remove(int num) {
        Node n = head;
        for (int i = 0; i < numItems - 1 && n.getNext() != null; i++) {
            if (num == head.getNum()) {
                head = head.getNext();
                break;
            } else if (n.getNext().getNum() == num) {
                n.setNext(n.getNext().getNext());
                break;
            }
            n = n.getNext();
        }
    }

    public int getInt(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n.getNum();
    }

    public int size() {
        return numItems;
    }
}
