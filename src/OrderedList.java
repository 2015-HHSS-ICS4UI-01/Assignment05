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
        } else if (numItems == 1) {
            if (current.getNum() <= num) {
                current.setNext(temp);
            } else {
                temp.setNext(current);
                head = temp;
            }
        } else if (numItems == 2) {
            if (current.getNext().getNum() <= num) {
                current.getNext().setNext(temp);
            } else {
                temp.setNext(current.getNext());
                current.setNext(temp);
                if (current.getNum() <= num) {
                    current.setNext(temp);
                    temp.setNext(current.getNext());
                } else {
                    current.setNext(temp.getNext());
                    temp.setNext(current);
                    head = temp;
                }
            }
        } else {

            for (int j = 2; j <numItems; j++) {
                current = head;
                for (int i = 0; i < numItems - j; i++) {
                    current = current.getNext();
                }
                if (current.getNext().getNum() <= num) {
                    temp.setNext(current.getNext().getNext());
                    current.getNext().setNext(temp);
                    break;
                }
            }
        }
        numItems++;
    }

    public void add1(int num) {
        Node temp = new Node(num);
        Node current = head;
        if (numItems == 0) {
            temp.setNext(head);
            head = temp;
        } else {
            current = head;
            for (int i = 0; i < numItems - 1; i++) {
                current = current.getNext();
                if (current.getNum() <= num) {
                    current.setNext(temp);
                } else {
                    current = head;
                    for (int x = 0; x < numItems - 2; x++) {
                        current = current.getNext();
                    }
                    if (numItems == 1) {
                        temp.setNext(head);
                        head = temp;
                    } else {
                        // set the node im adding's next node
                        temp.setNext(current.getNext());
                        current.setNext(temp);
                    }
                }

            }
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

    public void remove(int num) {
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
