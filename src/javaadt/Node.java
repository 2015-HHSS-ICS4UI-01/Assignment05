/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author simma1980
 */
public class Node {

    private int num;
    private Node next, prev;

    public Node(int num) {
        this.num = num;
        next = null;
        prev = null;
    }

    public Node(int num, Node next) {
        this.num = num;
        this.next = next;
        prev = null;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getNum() {
        return this.num;
    }

    public boolean hasNext() {
        return next != null;
    }
}