/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yaol9270
 */
public class CharNode {
    private char num;
    private CharNode next;
    private CharNode prev;
    
    /**
     * The original character node
     * @param n the character
     */
    public CharNode(char n){
        this.num = n;
        next = null;
        prev = null;
    }
    
    
    /**
     * Get the character node that is previous in line
     * @return the previous character node
     */
    public CharNode getPrev(){
        return this.prev;
    }
    
    
    /**
     * Get the character node that is next in line
     * @return the next character node
     */
    public CharNode getNext(){
        return this.next;
    }
    
    /**
     * Set the previous character node 
     * @param n the previous character node
     */
    public void setPrev(CharNode n){
        this.prev = n;
    }
    
    /**
     * Sets the character node this is pointing to 
     * @param n the new character node to point to
     */
    public void setNext(CharNode n){
        this.next = n;
    }
    
    /**
     * Return the number the node stores
     * @return the integer the node is storing
     */
    public char getNum(){
        return this.num;
    }
    
    /**
     * is there more character nodes after this
     * @return if there are more character nodes after this
     */
    public boolean hasNext(){
        return next != null;
    }
    
    
}
