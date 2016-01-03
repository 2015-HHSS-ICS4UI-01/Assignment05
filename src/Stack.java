/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yaol9270
 */
public class Stack {
    
    private CharNode head;
    private int numItems;
    
    
    public Stack(){
        head = null;
        numItems = 0;
    }
    
    /**
     * the size of the stack
     * @return the number of items in the stack
     */
    public int size(){
        return numItems;
    }
    
    /**
     * look at the head
     * @return the number in the head
     */
    public char peek(){
        return head.getNum();
    }
    
    /**
     * push a stack on top
     * @param n the character
     */
    public void push(CharNode n){
        n.setNext(head);
        head = n;
        numItems++;
    }
    
    /**
     * take a stack off
     * @return 
     */
    public char pop(){
        
         CharNode n = head;
         
         head = head.getNext();
         numItems--;
         return n.getNum();
        
    }
    
    /**
     * if the stack is empty
     * @return nothing in the stack
     */
    public boolean isEmpty(){
        return numItems == 0;
    }
}
