/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author branc2347
 */
public class OrderedList {

    private Node head;
    private int numItems;

    /**
     * Creates an Empty List
     */
    public OrderedList() {
        head = null;
        numItems = 0;
    }

    /**
     * Adds a node with a specific number in an ordered list
     *
     * @param num
     */
    public void add(int num) {
        Node addNode = new Node(num); //create the node with the number to add
        Node current = head; // create a node to use as a reference, compare addNode to current node
        if (numItems == 0) { //if the list is empty
            addNode.setNext(head); //set the beginning and end of the list(because only 1 item)
            head = addNode; //make the head the node with the number added
        } else if (head.getNum() > num) { //if the number to be added is smaller than the first number in the ordered list
            addNode.setNext(current); //make the current node(head) come after the node to be added
            head = addNode; // make the node the head, aka the first number in the list
        } else {
            current = head;
            for (int j = 0; j < numItems - 1; j++) { //for each spot in the list except the last one(becuase the second last Node.getNext = the last node)
                if (current.getNext().getNum() < num) { //if the number to be added is greater than the number of the the next node
                    current = current.getNext(); //set the current to the next node(in order to do the check again)
                } else {
                    break; //if the number in the next node (after the current) is greater than the number to be added, exit out of the loop
                }
            }
            //insert number in between current and current.getNext (current.getnext is greater)
            addNode.setNext(current.getNext()); //set the addNode's next node as current.getNext
            current.setNext(addNode); //set the current's nextNode as addNode
        }
        numItems++; //you've added 1 item to the list
    }

    public void printList() {
        Node n = head;
        //while the node isn't null, print the number in the node
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
/**
 * Determine whether the list is empty or not
 * @return true or false, depending on numItems
 */
    public boolean isEmpty() { 
        //if empty return true, else return false
        if (numItems == 0) {
            return true;
        } else {
            return false;
        }
    }
/**
 * Removes a node that contains the number the user wants to remove
 * @param num 
 */
    public void remove(int num) {
        Node n = head;
        for (int i = 0; i < numItems - 1 && n.getNext() != null; i++) {
            if (num == head.getNum()) {
                head = head.getNext();
                break;
            } else if (n.getNext().getNum() == num) {
                n.setNext(n.getNext().getNext());
                break;
            }
            n = n.getNext();
        }
    }

    public int getInt(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n.getNum();
    }

    public int size() {
        return numItems;
    }
}
