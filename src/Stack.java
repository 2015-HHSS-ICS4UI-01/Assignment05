/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class Stack {

    private CharNode head;
    private int numItems;

    public Stack() {
        head = null; //set the head to null
        numItems = 0; //set the number of items to 0
    }

    /**
     * Pushes a character to the front of the stack
     * @param c the character to be pushed
     */
    public void push(CharNode c) {
        c.setNext(head);
        head = c;
        numItems++;
    }

    /**
     * Removes the first character from the stack and returns it
     * @return the removed character
     */
    public CharNode pop() {
        CharNode temp = head;
        head = head.getNext();
        numItems--;
        return temp;
    }

    /**
     * Method that returns the first number 
     * @return the head of the list
     */
    public CharNode peek() {
        return head;
    }
    
    /**
     * Method that returns the size of the array
     * @return number of items
     */
    public int size() {
        return numItems;
    }

    /**
     * Method that returns the size
     * @return whether or not the number of items is 0
     */
    public boolean isEmpty() {
        return numItems == 0;
    }
}
