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
            //the new Node is the first Node in the list
            head = new Node(num);
            //a Node was added
            numItems++;
        //adding to a list with one Node
        }else if(numItems == 1){
            //if the Node in the list is larger than the new Node
            //the new Node becomes the first Node in the list
            //and the original first Node becomes the second Node
            if(head.getNum() > num){
                Node temp = head;
                head = new Node(num);
                head.setNext(temp);
                temp.setPrev(head);
            }
            //if the Node in the list is less than the new Node
            //the new Node becomes the second Node in the list
            else if(head.getNum() < num){
                Node n = new Node(num);
                head.setNext(n);
                n.setPrev(head);
            }
            
            //a Node was added
            numItems++;
        }
        //adding to a list with more than one Node
        else{
            Node current = head;
            int i = 0;

            //if the first Node is larger than the new Node
            //the new Node becomes the first Node in the list
            //and the original first Node becomes the second Node
            if(head.getNum() > num){
                Node temp = head;
                head = new Node(num);
                head.setNext(temp);
                temp.setPrev(head);
            }//if the first Node is less than the new Node
            //find the Node that is larger than the new Node
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
                //add the new Node before that Node
                else{
                    n.setPrev(current.getPrev());
                    n.setNext(current);
                    current.getPrev().setNext(n);
                    current.setPrev(n);
                }
                
            } 
            //a Node was added
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
        if(numItems == 0){
            //nothing can be removed; do nothing
        }
        //if the Node to be removed is at the beginning of the list
        //remove the first Node
        else if(head.getNum() == num){
            head.getNext().setPrev(null);
            head = head.getNext(); 
            //a Node was removed
            numItems--;
        }
        //if the Node to be removed is not the first Node
        //find the Node to remove in the list
        else{
            Node check = head;
            int i = 0;

            //search through the list of Nodes until the end is reached
            while(i < numItems){
                check = check.getNext();
                i++;
                
                //if the Node being checked is larger than the Node to remove
                //or if there is no Node after the current Node
                //stop checking the list
                if(check.getNum() >= num || check.getNext() == null){
                    break;
                }
            }

            //if the Node was not in the list
            if(check.getNum() != num){
                //do nothing
            }
            //if the Node was at the end of the list
            //remove the last Node
            else if(check.getNext() == null && check.getNum() == num){
                check.getPrev().setNext(null);
                check.setPrev(null);
            }
            //if the Node was in the middle of the list
            //remove that Node
            else{
                check.getPrev().setNext(check.getNext());
                check.getNext().setPrev(check.getPrev());
            }
            
            //a Node was removed
            numItems--;
        }  
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
