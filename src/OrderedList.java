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

    /**
     * Prints the list
     */
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
     *
     * @return true or false, depending on numItems
     */
    public boolean isEmpty() {
        return numItems == 0;
    }

    /**
     * Removes a node that contains the number the user wants to remove
     *
     * @param num the number to remove
     */
    public void remove(int num) {

        Node n = head; // node to be used as a reference, to iterate through the list, etc
        int numItemsRemoved = 0; //count of how many items have been removed

        if (numItems == 1) {//if there is only one number in the list
            if (num == head.getNum()) { //if the number in the list is equal to the number to be removed
                head = head.getNext(); //remove the item in the list
                numItemsRemoved++; // an item has been removed
            }
        } else {
            for (int i = 0; i < numItems - 1 && n.getNext() != null; i++) { // for every node in the list that isn't null
                if (num == head.getNum()) { // if the number to be removed is the first number
                    head = head.getNext(); // same as before, making the head the next node
                    numItemsRemoved++; //an item has been removed
                    break;
                } else if (n.getNext().getNum() == num) { //if the next node is the number to be removed
                    n.setNext(n.getNext().getNext()); //skip over the node to be removed. set the current node as the next next node
                    numItemsRemoved++; //a number has been removed
                    break;
                }
                n = n.getNext(); //continue iterating through the list until one of the conditions matches
            }
        }
        numItems -= numItemsRemoved;
    }

    /**
     * Get the number at a certain point in the array
     *
     * @param index spot at which the number is in the list of nodes
     * @return the number of the node specified by the index
     */
    public int getInt(int index) throws Exception {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        if (index >= 0) {
            return n.getNum();
        } else {
            throw new Exception("Invalid index");
        }
    }

    /**
     * Get the size of the list of nodes
     *
     * @return the amount of items in the list
     */
    public int size() {
        return numItems;
    }
}
