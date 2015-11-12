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
        Node node = new Node(num), tail = head;
        for (int i = 1; i < numitems; i++) {
            tail = tail.getNext();
        }
        if (numitems == 0 || node.getNum() < head.getNum()) {
            node.setNext(head);
            head = node;
        } else if (node.getNum() > tail.getNum()) {
            tail.setNext(node);
        } else {
            int index = 1;
            Node prev = head, next = head.getNext();
            for (int i = 0; i < numitems; i++) {
                if (prev.getNum() < node.getNum() && node.getNum() < next.getNum()) {
                    break;
                }
                index++;
                prev = prev.getNext();
                next = next.getNext();
            }
            node.setNext(next);
            prev.setNext(node);
        }
        numitems++;
    }

    public void remove(int num) {
        Node node = head;
        int index = 0;
        for (int i = 0; i < numitems; i++) {
            if (num == node.getNum()) {
                break;
            }
            index++;
            node = node.getNext();
        }
        if (index != numitems) {
            if (numitems == 1) {
                head = null;
            } else if (index == 0) {
                head = head.getNext();
            } else if (index == numitems - 1) {
                node = head;
                for (int i = 0; i < index - 1; i++) {
                    node = node.getNext();
                }
                node.setNext(null);
            } else {
                node = head;
                for (int i = 0; i < index - 1; i++) {
                    node = node.getNext();
                }
                node.setNext(node.getNext().getNext());
            }
            numitems--;
        }
    }

    public int size() {
        return numitems;
    }

    public boolean isEmpty() {
        if (numitems > 0) {
            return false;
        }
        return true;
    }

    public int get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getNum();
    }
}
