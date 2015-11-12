/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class CharNode {
    private char character;
    private CharNode next;
    private CharNode prev;
    
    public CharNode(char c){
        this.character = c;
        next = null;
    }
    
    public CharNode(char c, CharNode next){
        this.character = c;
        this.next = next;
        prev = null;
    }
    
    public CharNode getPrev()
    {
        return this.prev;
    }
    
    public void setPrev(CharNode c){
        this.prev = c;
    }
    /**
     * Get the node that is next in line
     * @return the next node
     */
    public CharNode getNext(){
        return this.next;
    }
    
    /**
     * Sets the node this is pointing to
     * @param n the new node to point to
     */
    public void setNext(CharNode c){
        this.next = c;
    }
    
    /**
     * Return the number the node stores
     * @return the integer the node is storing
     */
    public char getChar(){
        return this.character;
    }
    
    /**
     * Check if this node has something to go to
     * @return if the node is connected to another
     */
    public boolean hasNext(){
        return next != null;
    }
    
}
