/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;
/**
 *
 * @author thomt9963
 */
public class OrderedList {
    private Node head;
    private int numItems;
    
    /**
     * Creates an Empty List
     */
    public OrderedList(){
        head = null;
        numItems = 0;
    }
    
    /** 
     * Add the node to the beginning of the list
     * @param n the node to add
     */
    public void add(Node n){
        n.setNext(head);
        head = n;
        numItems++;
    }
    
    /**
     * Adds a node at a specific index
     * @param index the position to place the node
     * @param n the node to add
     */
    public void add(int index, Node n){
        int pos = 0;
        Node current = head;
        Node prev = null;
        
        while(current.hasNext() && pos < index){
            // previous set to where i was
            prev = current; 
            // current moves forward one node
            current = current.getNext(); 
        }
        // sets the inserted nodes next to the current node
        n.setNext(current);
        // sets the last node to the one being inserted
        prev.setNext(n);
    }
    
    public void printList(){
        Node n = head;
        while(n != null){
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
    
    
    
}
