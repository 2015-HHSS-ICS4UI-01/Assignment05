/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yaol9270
 */
public class Node {
    private int num;
    private Node next;
    private Node prev;
    
    public Node(int n){
        this.num = n;
        next = null;
        prev = null;
    }
    
    public Node(int n, Node next){
        this.num = n;
        this.next = next;
        prev = null;
    }
    
    public Node getPrev(){
        return this.prev;
    }
    
    
    /**
     * Get the node that is next in line
     * @return the next node
     */
    public Node getNext(){
        return this.next;
    }
    
    
    public void setPrev(Node n){
        this.prev = n;
    }
    
    /**
     * Sets the node this is pointing to 
     * @param n the new node to point to
     */
    public void setNext(Node n){
        this.next = n;
    }
    
    /**
     * Return the number the node stores
     * @return the integer the node is storing
     */
    public int getNum(){
        return this.num;
    }
    
    public boolean hasNext(){
        return next != null;
    }
}
