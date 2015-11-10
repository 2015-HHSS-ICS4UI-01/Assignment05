/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rayan4858
 */
public class OrderedList {

    private int itemNum;
    private Node head;

    /**
     * Creates an empty ordered list
     */
    public OrderedList() {
        head = null;
        itemNum = 0;
    }

    /**
     * Adds a Node to the ordered list and rearranges the list from least to
     * greatest
     *
     * @param n
     */
    public void add(Node n) {

        //if there are no items in the ordered list made the node being added the head of the list.
        if (itemNum == 0) {
            n.setNext(head);
            head = n;
            n.setPrev(null);
            itemNum++;
        } else {
            //creat a counter node 
            Node counter = head;
            boolean swap = false;

            //keep running the loop until there is no node
            while (counter != null && swap == false) {
                /*  if the number being added is smaller than the current node, than 
                 *   add that node before the current node and make that node the head 
                 */
                if (n.getNum() < counter.getNum()) {
                    n.setNext(counter);
                    head = n;
                    counter.setPrev(n);
                    itemNum++;
                    swap = true;
                    /*
                     * if the node being added is bigger than the last node on the list, 
                     * than add it behind the current biggest node
                     */
                } else if (n.getNum() > counter.getNum() && !counter.hasNext() && swap == false) {
                    counter.setNext(n);
                    n.setPrev(counter);
                    itemNum++;
                    swap = true;
                    /*
                     * if the counter node has nodes behind it 
                     * and in front of it and the current node being added is less than the counter node, 
                     * add the current node in teh appropriate spot
                     */
                } else if (counter.hasNext() && n.getNum() < counter.getNext().getNum() && swap == false) {
                    n.setNext(counter.getNext());
                    counter.setNext(n);
                    n.setPrev(counter);
                    counter.getNext().setPrev(n);
                    itemNum++;
                    swap = true;
                    /*
                     * if none of the above requirements are met, move on to the next node in line
                     */
                } else {
                    counter = counter.getNext();
                }
            }
        }
    }
    
    /**
     * Removes a node from the ordered list
     * @param x 
     */
    public void remove(int x) {
        //creat counter node
        Node counter = head;
        
        //keep running the loop until there is no node
        while (counter != null) {
            /*
             * if the first number in the list is being removed make the next node the head
             */
            if (x == counter.getNum() && !counter.hasPrev() && counter.hasNext()) {
                head = counter.getNext();
                counter.getNext().setPrev(null);
                itemNum--;
                break;
                /*
                 * if the last number in the list is being removed, than remove it
                 */
            } else if (x == counter.getNum() && counter.hasPrev() && !counter.hasNext()) {
                counter.getPrev().setNext(null);
                itemNum--;
                break;
                /*
                 * if a node is being removed from the middle of the list, 
                 * than set the previous nodes node to be the next node of the node being removed
                 */
            } else if (x == counter.getNum() && counter.hasNext() && counter.hasPrev()) {
                counter.getPrev().setNext(counter.getNext());
                itemNum--;
                break;   
                
            // if none of the above requirements are met than move onto the next node     
            } else {
                counter = counter.getNext();
            }
            // if none of the numbers are removed than tell the user nothing was removed
            if (counter == null) {
                System.out.println("The number you are trying to remove does not exist in the Ordered List.");
                System.out.println("");
            }
        }
    }   
    
    /**
     * 
     * @return The number of items in the list
     */
    public int size() {
        return itemNum;
    }

    /**
     * if the number is empty
     */
    public boolean isEmpty() {
        return itemNum == 0;
    }

    /**
     * gets the number at a certain position in the ordered list
     * @param x 
     */
    public void getInt(int x) {
        int counter = 0;
        Node n = head;
        do {
            n = n.getNext();
            counter++;
        } while (counter != x);
        System.out.println(n.getNum());
    }

    /**
     * Prints the numbers in the list
     */
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
}