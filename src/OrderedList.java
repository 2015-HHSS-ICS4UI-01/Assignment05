/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class OrderedList {

    private Node head;
    private int numItems = 0;

    public OrderedList() {
        head = null;
        numItems = 0;
    }

    public void add(Node n) {

        // adding a number to an empty list 
        if (numItems == 0) {
            n.setNext(head);
            head = n;
            n.setPrev(null);
            numItems++;
        } else {
            Node current = head;
            // state that the list isnt shuffled
            boolean shuffle = false;
            //while the current isnt nothing and the list isnt shuffled
            while (current != null && shuffle == false) {
                //if the number being inserted is less than the current number
                if (n.getNum() < current.getNum()) {
                    //place the number before the current 
                    n.setNext(current);
                    head = n;
                    current.setPrev(n);
                    //add 1 to the number of items in the list
                    numItems++;
                    // the list is shuffled
                    shuffle = true;
                } // if the number is greater than the current number 
                //and there isnt another number in the list 
                //and the list isnt shuffled
                else if (n.getNum() > current.getNum() && !current.hasNext() && shuffle == false) {
                    // place the number after the current
                    current.setNext(n);
                    n.setPrev(current);
                    // add 1 to the number of items in the list
                    numItems++;
                    // the list is shuffled
                    shuffle = true;
                } //if there is another number in the list apart from the number being added and the current
                // and the number being added is smaller than the other number 
                //and the list isnt shuffled
                else if (current.hasNext() && n.getNum() < current.getNext().getNum() && shuffle == false) {
                    //place the number after the current
                    //and before the other number in the list
                    current.getNext().setPrev(n);
                    n.setNext(current.getNext());
                    current.setNext(n);
                    n.setPrev(current);
                    //add 1 to the number of items in the list
                    numItems++;
                    //the list is shuffled
                    shuffle = true;
                } else {
                    current = current.getNext();
                }
            }
        }
    }

    public void remove(int num) {
        Node current = head;
        //while the number being removed doesnt equal the current number
        //and there is a number after the current number
        while (num != current.getNum() && (current.getNext() != null)) {
            //the next number in the list becomes the new current number
            current = current.getNext();
        }
        //if the current number equals the number being removed
        if (current.getNum() == num) {
            // if there is no number after the current
            if (current.getNext() == null) {
                // set the number before the current to have no next number
                current.getPrev().setNext(null);
            } //if there is no number before the current
            else if (current.getPrev() == null) {
                //set the number after the current to have no number before it    
                current.getNext().setPrev(null);
                //the number after the current becomes the first number in the list
                head = current.getNext();
            } //if the current has a number before it and a number after it
            else {
                //set the number before the currents next number to the currents previous number    
                current.getNext().setPrev(current.getPrev());
                current.getPrev().setNext(current.getNext());
            }
        } //if the number being removed isnt in the list
        else {
            System.out.println("The number you are trying to remove is not in the list.");
        }
    }

    public void printList() {
        Node n = head;
        //while the number doesnt equal nothing
        while (n != null) {
            //print out the number and move on to the next number in the list
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }

    public void size() {
        System.out.println("the number of items in the list is: " + numItems);
    }

    public void isEmpty() {
        //if the number of items in the list is 0
        if (numItems == 0) {
            System.out.println("the list is empty");
        }
    }

    public void get(int index) {
        int counter = 0;
        Node current = head;
        //while the counter doesnt equal the spot of the array being looked for
        while (counter != index) {
            //add one to the counter
            counter++;
            //move to the next number in the list
            current = current.getNext();
        }
        System.out.println("the number at index " + counter + " is " + current.getNum());
    }
}
