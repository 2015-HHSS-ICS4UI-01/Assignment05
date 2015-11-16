/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alimu
 */
public class Stack {

    private CharNode head;
    private int numItems;

    public Stack() {
        head = null;
        numItems = 0;
    }

    /**
     *
     * @return the head
     */
    public char peek() {
        return head.getNum();
    }

    public void push(CharNode n) {
        //whatevers after n is now n
        n.setNext(head);
        head = n;
        //increase amount of numbers in the list
        numItems++;
    }

    public char pop() {
        //n is the head
        CharNode n = head;
        //the head is whatevers after n
        head = head.getNext();
        //whatevers before the head is nothing
        //remove an item from the list
        numItems--;
        return n.getNum();
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

}
