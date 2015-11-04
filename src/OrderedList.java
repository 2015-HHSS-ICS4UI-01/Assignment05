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
        Node n = head; //the first node
        Node temp = new Node(num);
        if (numItems == 0) {
            temp.setNext(head);
            head = temp; //first node becomes temp
        } else {
            //current = head
            for (int x = 0; x < numItems; x++) {
                n = n.getNext();
                if (n == head) {
                    if (n.getNum() <= num) {
                        n.setNext(temp);
                    }
                    else
                    {
                        temp.setNext(n);
                        head = temp;
                    }
                } else if (n.getNum() <= num) {
                    n.setNext(temp);
                }
                else {
                    
                }
            }
        }
    }

    public void add1(int num) {

        Node n = head; //the first node
        Node temp = new Node(num);
        if (numItems == 0) {
            head = temp; //first node becomes temp
            temp.setNext(head);
        } else {
            for (int x = 0; x < numItems; x++) {
                if (num < n.getNum()) { //if the number added is less than the number in the list
                    n.setPrev(temp); //set the first num
                    //head.setNext(n);
                } else {
                    n.setNext(temp);
                    n = n.getNext();
                }
            }
        }
        numItems++;
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
