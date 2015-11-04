/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Stack {
    
    private Node head;
    private int numItems;
    
    /**
     * Constructor for the Stacks.
     */
    public Stack(){
        head = null;
        numItems = 0;
    }
    
    /**
     * Get the size of the Stack.
     * @return the number of items in the Stack.
     */
    public int size(){
        return numItems;
    }
    
    /**
     * Get the first node in the Stack.
     * @return the head Node of the Stack.
     */
    public Node peek(){
        return head;
    }
    
    public void push(Node n){
        n.setNext(head);
        head = n;
        numItems++;
    }
    
    public Node pop(){
        Node temp = head;
        head = head.getNext();
        numItems--;
        return temp;
    }
}
