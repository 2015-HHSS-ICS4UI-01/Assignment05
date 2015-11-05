/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class A5Q1 {

    private Node head;
    private int numItems;

    /**
     * Creates an empty list
     */
    public A5Q1() {
        head = null;
        numItems = 0;
    }

    /**
     * Add the number to the correct position in the list (ascending order)
     * @param n the number to add
     */
    public void add(int num) {
        //adds the first number in the list
        if (numItems == 0) {
            head = new Node(num);
        } else {
            Node n = head;
            //go through each entry in the list
            for (int i = 0; i < numItems; i++) {
                //find where the number belongs in the list
                if (num <= n.getNum()) {
                    Node temp = new Node(num);
                    //
                    temp.setPrev(n.getPrev());
                    if (n.getPrev() != null) {
                        n.getPrev().setNext(temp);
                    }
                    n.setPrev(temp);
                    temp.setNext(n);

                    if (i == 0) {
                        head = temp;
                    }
                    break;
                    
                } else if (n.getNext() == null) {
                    Node temp = new Node(num);

                    n.setNext(temp);
                    temp.setPrev(n);

                } else {
                    n = n.getNext();
                }
            }
        }
        numItems++;
    }

    /**
     * 
     * @param num 
     */
    public void remove(int num) {
        //make sure it is in our list
        if (numItems == 0) {
            return;
        }
        Node n = head;
        for(int i = 0; i < numItems; i++){
            if(n.getNum() == num){
                if(n.getPrev() == null){
                    n.getNext().setPrev(null);
                    head = n.getNext();
                } else if(n.getNext() == null){
                    n.getPrev().setNext(null);
                } else {
                   n.getPrev().setNext(n.getNext());
                   n.getNext().setPrev(n.getPrev()); 
                }
                
                numItems--;
            }else{
                n = n.getNext();
            }
            
        } 
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        if (numItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int get(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n.getNum();
    }
    
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
}
