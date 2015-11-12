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
        head = null;
        numItems = 0;
    }

    public void push(CharNode c) {
        c.setNext(head);
        head = c;
        numItems++;
    }

    public CharNode pop() {
        CharNode temp = head;
        head = head.getNext();
        numItems--;
        return temp;
    }

    public CharNode peek() {
        return head;
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }
}
