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
        Node node = new Node(num);
        if (numitems == 0 || node.getNum() < head.getNum()) {
            node.setNext(head);
            head = node;
        } else {
            int index = 1;
            Node check = head.getNext();
            
        }
        numitems++;
    }

    public void remove(int num) {
        Node node = new Node(num);
        for (int i = 0; i < numitems; i++) {
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
        if (index >= numitems) {
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
