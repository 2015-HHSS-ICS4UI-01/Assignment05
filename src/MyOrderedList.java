/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class MyOrderedList {
    private Node head;
    private int numItems;
    
    /**
     * Creates an empty list.
     */
    public MyOrderedList(){
        head = null;
        numItems = 0;
    }
    
    /**
     * Adds a node at a specific index.
     * @param index the position to place the node
     * @param n the node to add
     */
    public void add(int num){
        //adding to an empty list
        if(numItems == 0){
            head = new Node(num);
            //we've added a number
            numItems++;
        //adding to a list with one Node
        }else if(numItems == 1){
            if(head.getNum() > num){
                Node temp = head;
                head = new Node(num);
                head.setNext(temp);
                temp.setPrev(head);
            }else if(head.getNum() < num){
                Node n = new Node(num);
                head.setNext(n);
                n.setPrev(head);
            }
            
            numItems++;
        }else{
            Node current = head;
            int i = 0;
            if(head.getNum() > num){
                Node temp = head;
                head = new Node(num);
                head.setNext(temp);
                temp.setPrev(head);
            }else{
                while(i < numItems || current.getNum() < num){
                current = current.getNext();
                i++;
            }
            
            } 
            Node n = new Node(num);
            n.setPrev(current.getPrev());
            n.setNext(current);
            current.getPrev().setNext(n);
            current.setPrev(n);

//            Node n = new Node(num);
//            n.setNext(current);
//            n.setPrev(current.getPrev());
//            current.setPrev(n);

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
    public void remove(int num){
        //make sure it is in our list
        Node check = head;
        for(int i = 0; i < numItems; i++){
            if(check.getNum() == num){
                break;
            }
        }
        
        if(check.getNum() == num){
            return;
        }
        
        //delete first item
//        if(index == 0){
//            head = head.getNext();
//        //deleting end item
//        }else if(index == numItems - 1){
//            //go to the second last node
//            Node n = head;
//            for(int i = 0; i < index - 1; i++){
//                n = n.getNext();
//            }
//            //make it point nowhere
//            n.setNext(null);
//        //remove from the middle
//        }else{
//            Node n = head;
//            for(int i = 0; i < index - 1; i++){
//                n = n.getNext();
//            }
//            //ask the node for its next next node
//            n.setNext(n.getNext().getNext());
//        }
//        numItems--;
    }
    
    /**
     * Get the value of a Node at a specified index.
     * @param index the position of the Node to check.
     * @return the value of the Node.
     */
    public int get(int index){
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
        if(numItems == 0){
            return true;
        }else{
            return false;
        }
    }
}
