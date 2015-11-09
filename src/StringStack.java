/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class StringStack {
    
    private Node head;
    private int numItems;
    
    /**
     * Constructor for the Stacks.
     */
    public StringStack(){
        head = null;
        numItems = 0;
    }
    
    /**
     * Get the size of the StringStack.
     * @return the number of items in the StringStack.
     */
    public int size(){
        return numItems;
    }
    
    /**
     * Get the first node in the StringStack.
     * @return the head Node of the StringStack.
     */
    public Node peek(){
        return head;
    }
    
    /**
     * Adds a Node to the top of the Stack.
     * @param n the value of the Node being added.
     */
    public void push(Node n){
        n.setNext(head);
        head = n;
        numItems++;
    }
    
    /**
     * Removes a Node from the top of the Stack.
     * @return the Node that was removed.
     */
    public Node pop(){
        Node temp = head;
        head = head.getNext();
        numItems--;
        return temp;
    }
}
