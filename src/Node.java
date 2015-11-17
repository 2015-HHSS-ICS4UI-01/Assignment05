/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author janaj4926
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
        this.prev = prev;
    }
    
    /**
     * get the node that is next in line
     * @return the next node
     */
    public Node getNext(){
        return this.next;
    }
    
    public Node getPrev(){
        return this.prev;
    }
    
    /**
     * sets the node this is pointing to
     * @param n the node to point to
     */
    public void setNext(Node n){
        this.next = n;
    }
    
    public void setPrev(Node n){
        this.prev = n;
    }
    
    /**
     * return the number the node stores
     * @return the integer you get
     */
    public int getNum(){
        return this.num;
    }
    
    /**
     * check if this node has something to go to
     * @return if the node is connected to something
     */
    public boolean hasNext(){
        return next != null;
    }
}
