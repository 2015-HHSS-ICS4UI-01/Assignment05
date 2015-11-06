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
