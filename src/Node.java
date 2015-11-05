/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author branc2347
 */
public class Node {

    private int num;
    private Node next;

    public Node(int n) {
        this.num = n;
        next = null;
    }

    public Node(int n, Node next) {
        this.num = n;
        this.next = next;
    }

    /**
     * Get the node that is next in line
     *
     * @return the next node
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * Sets the node this is pointing to
     *
     * @param n the new node to point to
     */
    public void setNext(Node n) {
        this.next = n;
    }

    /**
     * Return the number the node stores
     *
     * @return the integer the node is storing
     */
    public int getNum() {
        return this.num;
    }

    /**
     * Check if this node has something to go to
     *
     * @return if the node is connected to another
     */
    public boolean hasNext() {
        return next != null;
    }

}
