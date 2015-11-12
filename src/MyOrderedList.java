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
     * Adds a node with a specified value to the list, in increasing numerical order.
     * @param num the value of the node to add.
     */
    public void add(int num){
        //adding to an empty list
        if(numItems == 0){
            //the new node is the first node in the list
            head = new Node(num);
            //a node was added
            numItems++;
        //adding to a list with one node
        }else if(numItems == 1){
            //if the node in the list is larger than the new Node
            //the new node becomes the first node in the list
            //and the original first node becomes the second Node
            if(head.getNum() > num){
                Node temp = head;
                head = new Node(num);
                head.setNext(temp);
                temp.setPrev(head);
            }
            //if the node in the list is less than the new node
            //the new node becomes the second node in the list
            else if(head.getNum() < num){
                Node n = new Node(num);
                head.setNext(n);
                n.setPrev(head);
            }
            
            //a node was added
            numItems++;
        }
        //adding to a list with more than one node
        else{
            Node current = head;
            int i = 0;

            //if the first node is larger than the new node
            //the new node becomes the first node in the list
            //and the original first node becomes the second node
            if(head.getNum() > num){
                Node temp = head;
                head = new Node(num);
                head.setNext(temp);
                temp.setPrev(head);
            }
            //if the first node is less than the new node
            //find the node that is larger than the new node
            else{
                //search the list of nodes until the end is reached
                while(i < numItems){
                    current = current.getNext();
                    i++;
                    
                    //if the current node's next node is null
                    //or if the current node is larger than the new node
                    //stop checking the list
                    if(current.getNext() == null || current.getNum() > num){
                        break;
                    }
                }
                //the node to be added to the list
                Node n = new Node(num);
            
                //if the list's last node has a value less than user's number
                //add number's node to the end of the list
                if(current.getNext() == null && current.getNum() < num){
                    current.setNext(n);
                    n.setPrev(current);
                }//if a node in the middle of the list was stopped on
                //add the new node before that Node
                else{
                    n.setPrev(current.getPrev());
                    n.setNext(current);
                    current.getPrev().setNext(n);
                    current.setPrev(n);
                }
                
            } 
            //a node was added
            numItems++; 
        }
    }
    
    /**
     * Print out the list of nodes.
     */
    public void printList(){
        Node n = head;
        while(n != null){
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
    
    /**
     * Removes a node with a specified value.
     * @param num the value of the node to remove from the list.
     */
    public void remove(int num){
        
        //if there are no nodes in the list
        if(numItems == 0){
            //nothing can be removed; do nothing
        }
        //if the node to be removed is at the beginning of the list
        //remove the first node
        else if(head.getNum() == num){
            head.getNext().setPrev(null);
            head = head.getNext(); 
            //a Node was removed
            numItems--;
        }
        //if the node to be removed is not the first node
        //find the node to remove in the list
        else{
            Node check = head;
            int i = 0;

            //search through the list of nodes until the end is reached
            while(i < numItems){
                check = check.getNext();
                i++;
                
                //if the node being checked is larger than the node to remove
                //or if there is no node after the current node
                //stop checking the list
                if(check.getNum() >= num || check.getNext() == null){
                    break;
                }
            }

            //if the node was not in the list
            if(check.getNum() != num){
                //do nothing
            }
            //if the node was at the end of the list
            //remove the last node
            else if(check.getNext() == null && check.getNum() == num){
                check.getPrev().setNext(null);
                check.setPrev(null);
            }
            //if the node was in the middle of the list
            //remove that node
            else{
                check.getPrev().setNext(check.getNext());
                check.getNext().setPrev(check.getPrev());
            }
            
            //a node was removed
            numItems--;
        }  
    }
    
    /**
     * Get the value of a node at a specified index.
     * @param index the position of the node to check.
     * @return the value of the node.
     */
    public int get(int index){
        Node n = head;
        for(int i = 0; i < index; i++){
            n = n.getNext();
        }
        return n.getNum();
    }
    
    /**
     * Get the total size of the list.
     * @return the number of nodes in the list.
     */
    public int size(){
        return numItems;
    }
    
    /**
     * Check if the list is empty or not.
     * @return whether or not the list has nodes in it.
     */
    public boolean isEmpty(){
        if(numItems == 0){
            return true;
        }else{
            return false;
        }
    }
}
