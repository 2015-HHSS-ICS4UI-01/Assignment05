/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class StringNode {
    
    private char letter;
    private StringNode next;
    private StringNode prev;
    
    public StringNode(char i){
        letter = i;
        next = null;
        prev = null;
    }
    
    public StringNode(char i, StringNode next){
        letter = i;
        this.next = next;
        prev = null;
    }
    
    /**
     * Get the node that is next in line
     * @return the next node
     */
    public StringNode getNext(){
        return this.next;
    }
    
    public StringNode getPrev(){
        return this.prev;
    }
    
    /**
     * Sets the node this is pointing to
     * @param i the new node to point to
     */
    public void setNext(StringNode i){
        this.next = i;
    }
    
    public void setPrev(StringNode i){
        this.prev = i;
    }
    
    
    /**
     * Return the number the node stores
     * @return the integer the node is storing
     */
    public char getString(){
        return letter;
    }
    
    /**
     * Check if this node has something to go to
     * @return if the node is connected to another
     */
    public boolean hasNext(){
        return next != null;
    }
    
    
}
