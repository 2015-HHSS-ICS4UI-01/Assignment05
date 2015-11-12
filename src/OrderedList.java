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

    public void remove(int num) {

        //set the head to the next node if its equal to num
        while (head.getNum() == num) {
            head = head.getNext();
            numItems--; //decrease the length
        }

        Node current = head; //Node used to iterate through list
        int tempItems = numItems; //the number of items before any numbers were removed (in case of duplicates)
        for (int x = 0; x < numItems - 1; x++) {
            if (current.getNext().getNum() == num) //if the node after the current one is equal to num
            {
                current.setNext(current.getNext().getNext()); //set the node after the current node to skip the node that is equal to num
                tempItems--; //decrease length
            } else {
                current = current.getNext(); //continue iterating through the list if the num isn't next
            }
        }
        numItems = tempItems; //set numItems equal to the final length after removal
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }
    
    /**
     * Returns the number at a given index (0 is the first number)
     * @param index position of the number wanted
     * @return number at the given index
     */
    public int get(int index)
    {
        if (index < numItems && index >= 0) //if the index is real
        {
            Node current = head; //used to iterate through the list
            for (int x = 0; x < index; x++) //iterate through the list until we reach the number right before the index
            {
                current = current.getNext(); //set the node equal to the next node
            }
            return current.getNum(); //return the number at the node we've reached
        }
        return -1; //return -1 if the index is inadmissable
    }

    
}
