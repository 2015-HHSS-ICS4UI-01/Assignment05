/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caius
 */
public class Stack {

    private CharNode head;
    private int numItems;

    public Stack() {
        head = null;
        numItems = 0;
    }

    /**
     * Add CharNode to the top of stack
     *
     * @param n the CharNode to be added
     */
    public void push(CharNode n) {
        n.setNext(head);
        head = n;
        numItems++;
    }

    /**
     * Remove the last node added and return it
     *
     * @return the last node added (head)
     */
    public CharNode pop() {
        CharNode n = head;
        if (numItems > 0) {
            CharNode temp = head;
            head = head.getNext();
            numItems--;
            return temp;
        }
        return null;
        
    }

    public int size() {
        return numItems;
    }

    /**
     * Return whether or not the stack has no added elements
     *
     * @return true if the length is 0; otherwise, return false
     */
    public boolean isEmpty() {
        return numItems == 0;
    }
}
