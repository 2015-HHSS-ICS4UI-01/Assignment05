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

        Node n = head; //used to keep track of position
        Node numNode = new Node(num); 
        if (numItems == 0) {
            head = numNode; //add the number to the start
        } else if (num < head.getNum()) { //if the number added is less than the number in the list
            numNode.setNext(head); //number comes before the previous head
            head = numNode; //the head becomes the number
        } else {
            for (int x = 0; x < numItems - 1; x++) { //iterate through the nodes except for the last (because its null)
                if (num > n.getNext().getNum()) { //if the number is bigger than the next number
                    n = n.getNext(); //n becomes the node that is bigger than number
                }
            }
            numNode.setNext(n.getNext()); //the number comes before the bigger node
            n.setNext(numNode); //the bigger node is followed by number
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
