/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Node {
    public int num;
    public Node next;
    public Node prev;
    
    /**
     * Constructor for the nodes.
     * @param n the number held by the node.
     */
    public Node(int n){
        this.num = n;
        next = null;
        prev = null;
    }
    
    /**
     * Constructor for the nodes given two variables.
     * @param n the number held by the node.
     * @param next the node that is after the node being constructed.
     */
    public Node(int n, Node next){
        this.num = n;
        this.next = next;
    }
    
    /**
     * Get the node that is next in line.
     * @return the next node.
     */
    public Node getNext(){
        return this.next;
    }
    
    /**
     * Get the node that is previous in line.
     * @return the previous node.
     */
    public Node getPrev(){
        return this.prev;
    }
    
     /**
     * Set the next node this is pointing to.
     * @param n the node to point at.
     */
    public void setNext(Node n){
        this.next = n;
    }
    
    /**
     * Set the previous node this is pointing to.
     * @param n the node to point at
     */
    public void setPrev(Node n){
        this.prev = n;
    }
    
    /**
     * Return the number the node stores.
     * @return the integer the node is storing.
     */
    public int getNum(){
        return this.num;
    }
    
    /**
     * Check if this node has something to go to.
     * @return if the node is connected to another.
     */
    public boolean hasNext(){
        return next != null;
    }
}
