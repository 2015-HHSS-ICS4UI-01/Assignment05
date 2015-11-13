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

    private CharNode head; // char last added to stack
    private int numItems; //number of items in the stack

    public Stack() {
        head = null;
        numItems = 0;
    }

    /**
     * Add CharNode to the top of the stack
     *
     * @param n the CharNode to be added
     */
    public void push(CharNode n) {

        n.setNext(head); //set n's next as whatever the head was and then make n the head
        head = n; // ^ make the head n
        numItems++; //an item has been added
    }

    /**
     * Remove the last node added to the stack and return it
     *
     * @return the last node added (head)
     */
    public CharNode pop() {

        //if there are items in the stack
        if (numItems > 0) {
            CharNode temp = head; // temporary node to use as reference
            head = head.getNext(); //set the head as the next node in the stack, because the last added node (head) is now removed
            numItems--; // an item has been removed
            return temp; //return the removed node
        }
        return null; //if the stack is empty, return null
    }

    /**
     * Get the number of nodes in the stack
     *
     * @return number of objects in stack
     */
    public int size() {
        return numItems;
    }

    /**
     * Determine whether the stack has items in it or not
     *
     * @return true for empty , false for having objects inside
     */
    public boolean isEmpty() {
        return numItems == 0;
    }
/**
 * Look at the last added item
 * @return head, the last item added
 */
    public CharNode peek() {
        return head;
    }
}
