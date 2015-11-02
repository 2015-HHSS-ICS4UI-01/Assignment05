/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class OrderedList {

    private Node head;
    private int numItems;

    public OrderedList() {
        head = null;
        numItems = 0;
    }

    public void add(int num) {

        Node n = head;
        Node temp = new Node(num);
        if (numItems == 0) {
            head = temp;
        } else {
            for (int x = 0; x < numItems; x++) {
                if (num >= n.getNum()) { //if the number is greater than the current number
                    n.setNext(temp); //set the next node to be num
                }
                n = n.getNext();
            }
            numItems++;
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }

    public void remove(int index) {
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int get(int index) {
        return 0;
    }
}
