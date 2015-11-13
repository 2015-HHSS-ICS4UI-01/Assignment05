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
        head = null; //set the head to nothing
        numItems = 0; //set the number of items to 0
    }

    /**
     * Adds a number to the list based on its value in comparison to the numbers
     * already in the list
     *
     * @param num the number to be added
     */
    public void add(int num) {
        Node currentNode = new Node(num); //used to keep track of position
        if (numItems == 0) { //if there are no items in the list yet
            head = currentNode; //add the number to the start
        } else if (num < head.getNum()) { //if the number added is less than the first number in the list
            currentNode.setNext(head); //number comes before the previous head
            head = currentNode; //the current number becomes the head
        } else {
            Node n = head;
            for (int x = 0; x < numItems - 1; x++) { //iterate through the nodes except for the last (because its null)
                if (num > n.getNext().getNum()) { //if the number being added is bigger than the next number in the list
                    n = n.getNext(); //n becomes the node that is bigger than number
                }
            }
            currentNode.setNext(n.getNext()); //the number comes before the bigger node
            n.setNext(currentNode); //the bigger node is followed by number
        }
        numItems++; //increase the number of items
    }

    /**
     * Prints the items within the array
     */
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }

    /**
     * Removes a specific number from the list. If a number occurs more than
     * once, only the first occurrence is removed.
     *
     * @param num the number to be removed.
     */
    public void remove(int num) throws Exception {
        if (numItems == 1) { //if there is only one item in the array
            if (head.getNum() == num) { //if the number matches the only number in the list, remove it
                head = null;
                numItems--;
            } else { //if the number isn't even in the list, throw an exception
                throw new Exception("Invalid Number");
            }
        } else {
            //remove the head from the list if its number to be removed
            if (head.getNum() == num) {
                head = head.getNext();
                numItems--; //decrease the length
            } else {

                Node current = head; //Node used to iterate through list
                for (int x = 0; x < numItems - 1; x++) { //iterate through all the items in the list except the last one because its null
                    if (current.getNext().getNum() == num) //if the node after the current one is equal to num
                    {
                        current.setNext(current.getNext().getNext()); //remove the next node (skip to the one after the next node)
                        numItems--; //decrease the number of items
                        break; //break the loop so only one number is removed
                    } else {
                        current = current.getNext(); //continue iterating through the list if the num isn't next
                    }
                }
            }
        }
    }

    /**
     * Method used to return the size of the list
     *
     * @return numItems; the number of items in the list.
     */
    public int size() {
        return numItems;
    }

    /**
     * Method used to return whether a list is empty or not
     *
     * @return whether or not the number of items is 0
     */
    public boolean isEmpty() {
        return numItems == 0;
    }

    /**
     * Returns the number at a given index (0 is the first number)
     *
     * @param index position of the number wanted
     * @return number at the given index
     */
    public int get(int index) throws Exception {
        if (index < numItems && index >= 0) //if the index is real
        {
            Node current = head; //used to iterate through the list
            for (int x = 0; x < index; x++) //iterate through the list until we reach the number right before the index
            {
                current = current.getNext(); //set the node equal to the next node
            }
            return current.getNum(); //return the number at the node we've reached
        }
        throw new Exception("Invalid Index");
    }
}
