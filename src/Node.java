/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alimu
 */
public class Node {

    private int num;
    private Node next;
    private Node prev;

    public Node(int n) {
        this.num = n;
        next = null;
        prev = null;
    }

    public Node(int n, Node next) {
        this.num = n;
        this.next = next;
        prev = null;

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
     *
     * @return the node before it
     */
    public Node getPrev() {
        return this.prev;
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
     *
     * @param n the new node to point to
     */
    public void setPrev(Node n) {
        this.prev = n;
    }

    /**
     * Return the number the node stores
     *
     * @return
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
