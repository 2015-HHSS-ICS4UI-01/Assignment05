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
        Node node = new Node(num), next = head;
        int index = 0;
        for (int i = 0; i < numitems; i++) {
            if (node.getNum() == next.getNum()) {
                break;
            }
            index++;
            next = next.getNext();
        }
        if (index != numitems) {
            Node temp = head;
            if (numitems == 1) {
                head = null;
            } else if (index + 1 == numitems) {
                node.setNext(null);
            }
        }
    }

    public void size() {
        System.out.println(numitems);
    }

    public void isEmpty() {
        if (numitems > 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    public void get(int index) {
        Node node = head;
        if (index >= numitems || index < 0) {
            System.out.println("null");
        } else if (index < numitems) {
            for (int i = 0; i < numitems; i++) {
                if (i == index) {
                    break;
                }
                node = node.getNext();
            }
            System.out.println(node.getNum());
        }
    }
}
