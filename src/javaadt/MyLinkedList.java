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
        if (numitems == 0) {
            node.setNext(head);
            head = node;
        } else {
            for (int i = 0; i < numitems; i++) {
                
            }
            Node current = this.head;
//            for (int i = 0; i < index - 1; i++) {
//                current = current.getNext();
//            }
            node.setNext(current.getNext());
            current.setNext(node);
        }
        numitems++;
    }

    public void remove(int num) {
        Node node = new Node(num);
        for (int i = 0; i < numitems; i++) {
            
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
        Node node = new Node(index);
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getNum();
    }

    public void printList() {
        Node node = this.head;
        while (node != null) {
            System.out.println(node.getNum());
            node = node.getNext();
        }
    }
}
