/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class MyArrayList {
    private Node head;
    private int numItems;
    
    /**
     * Creates an empty list.
     */
    public MyArrayList(){
        head = null;
        numItems = 0;
        int[] nums = new int[10];
    }
    
    /**
     * Add the node to the beginning of the list.
     * @param n the node to add
     */
    public void add(Node n){
        n.setNext(head);
        head = n;
        numItems++;
    }
    
    /**
     * Adds a node at a specific index.
     * @param index the position to place the node
     * @param n the node to add
     */
    public void add(int index, Node n){
        //adding to an empty list
        if(numItems == 0){
            add(n);
        }else if(index == 0){
            add(n);
        }else{
            Node current = head;
            for(int i = 0; i < index - 1; i++){
               current = current.getNext(); 
            }
            //set the node I'm adding's next node
            n.setNext(current.getNext());
            current.setNext(n);
            
            //we've added a number
            numItems++; 
        }       
    }
    
    /**
     * Print out the list of Nodes.
     */
    public void printList(){
        Node n = head;
        while(n != null){
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
    
    /**
     * Removes a node from a specific index.
     * @param index the position to remove a node from.
     */
    public void remove(int index){
        //make sure it is in our list
        if(index >= numItems || index < 0){
            return;
        }
        //delete first item
        if(index == 0){
            head = head.getNext();
        //deleting end item
        }else if(index == numItems - 1){
            //go to the second last node
            Node n = head;
            for(int i = 0; i < index - 1; i++){
                n = n.getNext();
            }
            //make it point nowhere
            n.setNext(null);
        //remove from the middle
        }else{
            Node n = head;
            for(int i = 0; i < index - 1; i++){
                n = n.getNext();
            }
            //ask the node for its next next node
            n.setNext(n.getNext().getNext());
        }
        numItems--;
    }
    
    /**
     * Get the value of a Node at a specified index.
     * @param index the position of the Node to check.
     * @return the value of the Node.
     */
    public int getInt(int index){
        Node n = head;
        for(int i = 0; i < index; i++){
            n = n.getNext();
        }
        return n.getNum();
    }
    
    /**
     * Get the total size of the List.
     * @return the number of Nodes in the List.
     */
    public int size(){
        return numItems;
    }
    
    public boolean isEmpty(){
        if(numItems <= 0){
            return true;
        }else{
            return false;
        }
    }
}
