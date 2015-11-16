/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author janaj4926
 */
public class NodeChar {
    private char w;
    private NodeChar next;
    private NodeChar prev;
    
    public NodeChar(char n){
        this.w = n;
        next = null;
        prev = null;
    }
    
    public NodeChar(char n, NodeChar next){
        this.w = n;
        this.next = next;
        this.prev = prev;
    }
    
    /**
     * get the node that is next in line
     * @return the next node
     */
    public NodeChar getNext(){
        return this.next;
    }
    
    public NodeChar getPrev(){
        return this.prev;
    }
    
    /**
     * sets the node this is pointing to
     * @param n the node to point to
     */
    public void setNext(NodeChar n){
        this.next = n;
    }
    
    public void setPrev(NodeChar n){
        this.prev = n;
    }
    
    /**
     * return the number the node stores
     * @return the char you get
     */
    public char getchar(){
        return this.w;
    }
    
    /**
     * check if this node has something to go to
     * @return if the node is connected to something
     */
    public boolean hasNext(){
        return next != null;
    }
}
