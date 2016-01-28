/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class OrderedList {

    private Node head;
    private int numItems;
/**
 * Setting the original numbers to be what they need to be dependant on the numbers that are being added or taken away.
 */
    public OrderedList() {
        head = null;
        numItems = 0;
    }
/**
 * This method is to add numbers into the array 
 * @param num the number that is being added into the list of numbers
 */
    public void Add(int num) {
        
        Node n = new Node(num);
        Node current = head;
        if (numItems == 0 || n.getNum() < head.getNum()) {//checks to see if there is no items in the list
            head = n;
            head.setPrev(null);
            head.setNext(current);
            if (current != null) {
                current.setPrev(head);
            }
            

        } else {//if there are items in the list the method will look through the list to find the spot where in the list it must go

            for (int i = 0; i < numItems; i++) {
                if (current.getNum() > n.getNum()) {
                    n.setNext(current);
                    n.setPrev(current.getPrev());
                    current.getPrev().setNext(n);
                    current.setPrev(n);
                    break;
                }else if(current.getNext() == null){
                    
                    current.setNext(n);
                    n.setPrev(current);
                    n.setNext(null);
                    break;
                }else{
                    current = current.getNext();
                }

            }
        }


        numItems++;
    }
/**
 * This method looks through the list and finds the number that needs to be removed, and takes it out of the list, by looking through ever digit until it finds it
 * @param num the number that need to be removed
 */
    public void Remove(int num) {
        Node current = head;
        
        if(num == head.getNum()){
            head = head.getNext();
            head.setPrev(null);
        }else{
        for(int i = 0; i < numItems -1; i++){
          if(num == current.getNum()){
                current.getPrev().setNext(current.getNext());
                if(current.getNext()!= null){
                current.getNext().setPrev(current.getPrev());
                }
            }
            current = current.getNext();
        }   
    }
      numItems--;  
  }
    /**
     * The size of the list 
     * @return Returns the size of the list
     */
    public int size() {
        return numItems;
    }
/**
 * If there are no numbers in the list
 */
    public void isEmpty() {
        if (numItems == 0) {
            head = null;
        }
    }
/**
 * To get a certain number out of the list.
 * @param index the place in the list that holds a certain value
 * @return returns the number that is being look for
 */
    public int get(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n.getNext();
        }
        return n.getNum();
    }
/**
 * To output the list to the user
 */
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
}