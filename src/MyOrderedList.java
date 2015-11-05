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
     * Adds a Node with a specified value to the list, in increasing numerical order.
     * @param num the number to add.
     */
    public void add(int num){
        //adding to an empty list
        if(numItems == 0){
            //make the number's Node the first in the list
            
            head = new Node(num);
            //a number was added
            numItems++;
        //adding to a list with one Node
        }else if(numItems == 1){
            //if the Node's value is greater than the number to be added
            //make the number's Node the first Node in the list
            if(head.getNum() > num){
                Node temp = head;
                head = new Node(num);
                head.setNext(temp);
                temp.setPrev(head);
            }
            //if the Node's value is less than the number to be added
            //set the number's Node after the first Node
            else if(head.getNum() < num){
                Node n = new Node(num);
                head.setNext(n);
                n.setPrev(head);
            }
            
            //a number was added
            numItems++;
        }else{
            //Node that will be used to compare values with the number
            Node current = head;
            //counter variable
            int i = 0;

            //if the head Node's number is greater than user's number
            //number's Node becomes the first Node in the list
            //and the original first Node becomes the second Node
            if(head.getNum() > num){
                Node temp = head;
                head = new Node(num);
                head.setNext(temp);
                temp.setPrev(head);
            }//if the head Node's number is less than the user's number
            //find the Node with a number that is greater than user's number
            else{
                //search the list of Nodes until the end is reached
                while(i < numItems){
                    current = current.getNext();
                    i++;
                    
                    //if the current Node's next Node is null
                    //or if the current Node's number is equal to user's number
                    //stop checking the list
                    if(current.getNext() == null || current.getNum() > num){
                        break;
                    }
            }
                //the Node to be added to the list
                Node n = new Node(num);
            
                //if the list's last Node has a value less than user's number
                //add number's Node to the end of the list
                if(current.getNext() == null && current.getNum() < num){
                    current.setNext(n);
                    n.setPrev(current);
                }//if a Node in the middle of the list was stopped on
                //add the number's Node before that Node
                else{
                    n.setPrev(current.getPrev());
                    n.setNext(current);
                    current.getPrev().setNext(n);
                    current.setPrev(n);
                }
                
            } 

            //a number was added
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
     * Removes a Node with a specified value.
     * @param num the number to remove from the list.
     */
    public void remove(int num){
        
        //if there are no Nodes in the list
        //nothing can be removed; do nothing
        if(numItems == 0){
            
        }
        //if the number to be removed is at the beginning of the list
        //remove the first Node
        else if(head.getNum() == num){
            head.getNext().setPrev(null);
            head = head.getNext();
        }//if the number to be removed is not the first Node
        //find the Node to remove in the list
        else{
            Node check = head;
            int i = 0;

            while(i < numItems && check.getNum() < num){
                check = check.getNext();
                i++;
                if(check.getNum() >= num || check.getNext() == null){
                    break;
                }
            }

            //if the number was not in the list
            //do nothing
            if(check.getNum() != num){

            }
            //if the number was at the end of the list
            //remove the last Node
            else if(check.getNext() == null && check.getNum() == num){
                check.getPrev().setNext(null);
                check.setPrev(null);
            }
            //if the number was in the middle of the list
            //remove the corresponding Node
            else{
                check.getPrev().setNext(check.getNext());
                check.getNext().setPrev(check.getPrev());
            }
        }
        
        //a number was removed
        numItems--;
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
    
    /**
     * Check if the list is empty or not.
     * @return whether or not the list has Nodes in it.
     */
    public boolean isEmpty(){
        if(numItems == 0){
            return true;
        }else{
            return false;
        }
    }
}
