/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class A5Q1 {

    private Node head;
    private int numItems;

    /**
     * Creates an empty list
     */
    public A5Q1() {
        head = null;
        numItems = 0;
    }

    /**
     * Adds the number to the correct position in the list (ascending order)
     *
     * @param n the number to add
     */
    public void add(int num) {
        //adds the first number in the list
        if (numItems == 0) {
            head = new Node(num);
        } else {
            Node n = head;
            //go through each entry in the list
            for (int i = 0; i < numItems; i++) {
                //find where the number belongs in the list
                if (num <= n.getNum()) {
                    Node temp = new Node(num);
                    //track the node's position
                    temp.setPrev(n.getPrev());
                    //special case to store the node
                    if (n.getPrev() != null) {
                        n.getPrev().setNext(temp);
                    }
                    //store the node between 2 nodes
                    n.setPrev(temp);
                    temp.setNext(n);
                    //special case for the node being in the first position
                    if (i == 0) {
                        head = temp;
                    }
                    break;

                    //number reached the end of the list
                } else if (n.getNext() == null) {
                    Node temp = new Node(num);
                    n.setNext(temp);
                    temp.setPrev(n);

                    //move the comparing node down the list
                } else {
                    n = n.getNext();
                }
            }
        }
        //increase the list size
        numItems++;
    }

    /**
     * Removes the number from the list
     *
     * @param num the number to remove
     */
    public void remove(int num) {
        //make sure it is in the list
        if (numItems == 0) {
            return;
        }
        Node n = head;
        //find the number
        for (int i = 0; i < numItems; i++) {
            //found the number
            if (n.getNum() == num) {
                //special case if the number is the head
                if (n.getPrev() == null) {
                    //remove number by removing connections to it
                    n.getNext().setPrev(null);
                    head = n.getNext();
                    //special case if the number is the end
                } else if (n.getNext() == null) {
                    //remove connection
                    n.getPrev().setNext(null);
                } else {
                    //remove number by removing connections
                    n.getPrev().setNext(n.getNext());
                    n.getNext().setPrev(n.getPrev());
                }
                //decrease the list size
                numItems--;
                //move to the next position
            } else {
                n = n.getNext();
            }

        }
    }

    /**
     * Getter for the size of the list
     *
     * @return size of the list
     */
    public int size() {
        return numItems;
    }

    /**
     * Getter for the lists state of emptiness
     *
     * @return if the list is empty or not
     */
    public boolean isEmpty() {
        //the list is empty
        if (numItems == 0) {
            return true;
        //the list is not empty
        } else {
            return false;
        }
    }

    /**
     * Getter for the stored number of a node
     *
     * @param index the position of the number to return
     * @return the number in the node at the index's position
     */
    public int get(int index) {
        Node n = head;
        //go to the position
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        //returning the stored number
        return n.getNum();
    }

    /**
     * For use with Testing class
     */
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
}
