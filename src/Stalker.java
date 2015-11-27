/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Stalker {
 
    private Node head;
    private int numItems;
    private boolean isEmpty;

    /**
     * Creates an Empty List
     */
    public Stalker() {
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
            while (current != null && (n.getNum() >= current.getNum())) {
                if (current.getNext() != null) {
                    current = current.getNext();
                } else {
                    break;
                }
            }

            if (current.getNext() == null && n.getNum() >= current.getNum()) {
                n.setPrev(current);
                current.setNext(n);
                n.setNext(null);
                System.out.println("ending: " + n.getNum());

            } else if (current == head) {
                n.setNext(current);
                current.setPrev(n);
                head = n;
                System.out.println("starting: " + n.getNum());
                
            } else{
                //set the node im adding next node
                n.setNext(current);
                n.setPrev(current.getPrev());
                n.getPrev().setNext(n);
                current.setPrev(n);
                System.out.println("mid: " + n.getNum());
            }
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

    public void remove(int n) {
        if (numItems == 0) {

            return;

        } else {
            Node current = head;
            if (n == current.getNum()) {
                head = current.getNext();
                head.setPrev(null);
            } else {
                while (current != null && n == current.getNum()) {
                    current = current.getNext();
                }
                //set the node im adding next node
                
                if(current.getNext() == null){
                    current.getPrev().setNext(null);
                }else
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