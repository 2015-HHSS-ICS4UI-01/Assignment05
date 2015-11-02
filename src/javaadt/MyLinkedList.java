/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author simma1980
 */
public class MyLinkedList {

    private Node head;
    private int numitems = 0;

    public MyLinkedList() {
        head = null;
        numitems = 0;
    }

    public void add(int num) {
        
        numitems++;
    }

    public void remove(int num) {
        numitems--;
    }

    public int size() {
        return numitems;
    }

    public boolean isEmpty() {
        if (numitems == 0) {
            return true;
        }
        return false;
    }

    public int get(int index) {
        Node node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getNum();
    }
}
