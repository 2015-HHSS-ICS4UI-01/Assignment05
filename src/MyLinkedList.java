/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author janaj4926
 */
public class MyLinkedList {

    private Node head;
    private int numItems;

    /**
     * creates an empty list
     */
    public MyLinkedList() {
        head = null;
        numItems = 0;
    }

    /**
     * add the node to the beginning of the list
     *
     * @param n the node to add
     */
    public void add(Node n) {
        n.setNext(head);
        head = n;
        numItems++;
    }

    /**
     * adds a node at a specific index
     *
     * @param index the position to place the node
     * @param n the nodes to add
     */
    public void add(int index, Node n) {
        //adding to an empty ist
        if (numItems == 0) {
            add(n);
        } else if (index == 0) {
            add(n);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }

            // set the node im adding's next node
            n.setNext(current.getNext());
            current.setNext(n);


            //we've added a number
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

    public void remove(int index) {
        if (index >= numItems || index < 0) {
            return;
        }
        //delete first item
        if (index == 0) {
            head = head.getNext();
            //delete last item
        } else if (index == numItems - 1) {
            //go to the second last node\
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
               n = n.getNext();
            }
            //point nohwere
            n.setNext(null);
            
            //remove from middle
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.getNext();
            }
            //ask the node for it's next next node
            n.setNext(n.getNext().getNext());
        }
        numItems--;
    }

    public int getInt(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n.getNum();
    }
    
    public int size(){
        return numItems;
    }
}
