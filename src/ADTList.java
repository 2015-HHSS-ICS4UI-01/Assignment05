/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class ADTList {

    private Node head;
    private int numItems;
    private boolean isEmpty;

    /**
     * Creates an Empty List
     */
    public ADTList() {
        head = null;
        numItems = 0;
    }

    /**
     * Adds a node at specific index
     *
     * @param index the position to place the node
     * @param n the node to add
     */
    public void add(Node n) {
        //adding to an empty list
        if (numItems == 0) {
            n.setNext(head);
            head = n;
            numItems++;
        } else {

            Node current = head;
            while (current != null && n.getNum() <= current.getNum()) {
                current = current.getNext();
            }


            //set the node im adding next node
            n.setNext(current.getNext());
            current.setPrev(n);
            //weve added a number 
            numItems++;
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }

    public void remove(Node n) {
        if (numItems == 0) {

            return;

        } else {
            Node current = head;
            if (n.getNum() == current.getNum()) {
                n.setNext(head);
                n.setPrev(null);
            } else {
                while (current != null && n.getNum() == current.getNum()) {
                    current = current.getNext();
                }


                //set the node im adding next node
                current.getPrev().setNext(current.getNext());


                //weve added a number 
                numItems--;
            }
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

    public boolean isEmpty() {
        if (numItems == 0) {
            isEmpty = true;
            return isEmpty;
        } else {
            isEmpty = false;
        }
        return isEmpty;

    }
}
