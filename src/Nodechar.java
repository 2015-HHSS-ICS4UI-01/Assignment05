/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Nodechar {
    private char c;
    private Nodechar next;
    private Nodechar prev;
    
    public Nodechar(char n){
        this.c = n;
        next = null;
        prev = null;
    }
    
    public Nodechar(char n, Nodechar next){
        this.c = n;
        this.next = next;
        prev = null;
    }
    
    /*
     * Get the node that is next in line
     * @return the next node
     */
    public Nodechar getNext(){
        return this.next;        
    }
    
    public Nodechar getPrev(){
        return this.prev;
    }
    
    /*
     * Set the node this is pointing to
     * @param n the new node to point to
     */
    
    public void setNext(Nodechar n){
        this.next = n;
    }
    
    public void setPrev(Nodechar n){
        this.prev = n;
    }
        
    
    /*
     * Return the number the node stores
     * @return the integer the node is storing
     */
    
    public char getChar(){
        return this.c;
    }
    
    /*
     * Check if this node has something to go to
     * @return if the node is connected to another
     */
    public boolean hasNext(){
        return next != null;
    }
    
}
