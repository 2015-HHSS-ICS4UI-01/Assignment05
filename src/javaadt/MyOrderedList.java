/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author simma1980
 */
public class MyOrderedList {

    private Node head;
    private int numitems = 0;

    public MyOrderedList() {
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
                if (prev.getNum() <= node.getNum() && node.getNum() <= next.getNum()) {
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
        //determines index of num to remove
        Node node = head;
        int index = 0;
        for (int i = 0; i < numitems; i++) {
            if (num == node.getNum()) {
                break;
            }
            index++;
            node = node.getNext();
        }
        if (index != numitems) { //only goes to remove an item if the item exists in the array
            if (numitems == 1) { //deletes the list if the only item is being deleted
                head = null;
            } else if (index == 0) { //sets the first item to be the second if the first if being removed
                head = head.getNext();
            } else if (index == numitems - 1) { //sets the second last item to point to null instead of last item
                node = head;
                for (int i = 0; i < index - 1; i++) {
                    node = node.getNext();
                }
                node.setNext(null);
            } else {
                /**
                 * sets the node before the node to be removed to point to the
                 * node after the node to be removed instead of to the node to
                 * be removed
                 */
                node = head;
                for (int i = 0; i < index - 1; i++) {
                    node = node.getNext();
                }
                node.setNext(node.getNext().getNext());
            }
            numitems--; //decreases number of numbers since a number was taken out of the list
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
