/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Stack {

    private StringNode head;
    private int numItems;

    public Stack() {
        head = null;
        numItems = 0;
    }

    public int size() {
        return numItems;
    }

    public StringNode peek() {
        return head;
    }

    public void push(StringNode n) {
        n.setNext(head);
        head = n;
        numItems++;
    }

    public StringNode pop() {
        StringNode temp = head;
        if (head.getNext() != null) {
            head = head.getNext();
        }
        numItems--;
        return temp;
    }
}
