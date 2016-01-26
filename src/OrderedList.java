/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class OrderedList {
    private Node head;
    private int numItems;
    /**
     * Creates an empty list
     */
    public OrderedList (){
        head = null;
        numItems = 0;
    }
/**
 * Add the node to the list
 * @param num the node added
 */
    public void add(int num){
        Node n = new Node(num);
        Node current = head;
        if (numItems == 0){
        head = n;
        }
        else if (n.getNum() < head.getNum()){
        head = n;
        head.setNext(current);
        head.setPrev(null);
        if (current.getNext() != null){
            current.setPrev(head);
        }
    }else{   
        for (int i = 0; i < numItems; i++){
            if (current.getNum() > n.getNum() || n.getNum() == current.getNum()){
                n.setPrev(current.getPrev());
                n.setNext(current);
                current.getPrev().setNext(n);
                current.setPrev(n);
                break;             
            }         
            else if (current.getNext() == null && n.getNum() > current.getNum()){
            current.setNext(n);
            n.setPrev(current);
            n.setNext(null);
            
        }
            current = current.getNext();
        } 
        
    }
        numItems++; 
 }
    
    /**
     * Remove the node from the list
     * @param num the node to be removed
     */
    public void remove(int num){
        Node current = head;
        if (num == head.getNum()){
            head = head.getNext();
        }else{
        
        for (int i = 0; i < numItems; i++){
             if (current.getNext() == null && current.getNum() == num){
             current.getPrev().setNext(null);
        }
            
             else if (num == current.getNum()){
                  current.getPrev().setNext(current.getNext());
                  current.getNext().setPrev(current.getPrev());
                  break;
            }
            
          current = current.getNext();
     }
       
    }
        numItems--;  
 }
    /**
     * Checks the size of the list
     * @return the size of the list
     */
    public int size(){
        return numItems;
    }
    /**
     * Checks if the list is empty or not
     */
    public void isEmpty(){
        if (numItems == 0){
            System.out.println("The list is empty."); 
        }
        else if (numItems > 0){
            System.out.println("The list has items in it.");
        }
        
    }
    /**
     * Finds a certain node in the list
     * @param index the node's position
     * @return the node
     */
    public int get(int index){
         Node n = head;
        for (int i = 0; i < index -1; i++){
            n = n.getNext();
        }
        return n.getNum();
    }
    /**
     * Prints the list
     */
     public void printList(){
        Node n = head;
        while (n != null){
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
}
