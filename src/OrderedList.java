/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class OrderedList {

    private Node head;      //front of the list
    private int numItems;   //number of items in the list

    public OrderedList() {
        head = null;        //empty list
        numItems = 0;       //no items in list
    }
/**
 * add a number to the list
 * @param n number
 */
    public void add(Node n) {
        Node current = head;    //start at the front of the list
    if(numItems==0){            //if the list is empty
      head = n;
      n.setPrev(null);
      n.setNext(null);
      numItems++;
    }else{                      //if list is not empty
        
        int index = 0;
        while(index<numItems-1&&n.getNum()>current.getNum()){   //move through the list until the number being added is in the right place
         current = current.getNext();
         index++;
        }
        
       
        if(index==0&&numItems==1){              //if the number should be first, and there is one item currently in the list
            if(n.getNum()<head.getNum()){       //if the number is less than the number in the list
            head.setPrev(n);
            n.setNext(head);
            head = n;
            head.setPrev(null);
            numItems++;}
            else{                               //if the number is greater than the number in the list
             n.setPrev(head);
             n.setNext(null);
             head.setNext(n);
            }
            }
        else if(index==0){                      //if the number should be first
            if(n.getNum()<head.getNum()){       //if the number is less than the current number
            head.setPrev(n);
            n.setNext(head);
            head = n;
            head.setPrev(null);
            numItems++;}
            else{                               //if the number is greater than the current number
            n.setPrev(head);
            n.setNext(head.getNext());
            head.getNext().setPrev(n);
            head.setNext(n);
            numItems++;
            }
        }else if(index==numItems-1){            //if the number should go last in the list
            n.setPrev(current);
            n.setNext(null);
            current.setNext(n);
            numItems++;
        }else{                                  //if the number should be in the middle of the list somewhere
           if(n.getNum()>current.getNum()){     //if the number is greater than the current number
            n.setPrev(current); 
            n.setNext(current.getNext());
            current.setNext(n);
            n.getNext().setPrev(n);
            numItems++;
           }else{                               //if the number is than the current number
            n.setNext(current);
            n.setPrev(current.getPrev());
            n.getPrev().setNext(n);
            current.setPrev(n);
            numItems++;
           }
        }
    }

    }
/**
 * print the list 
 */
    public void printList() {
        Node n = head;      //start at the front of the list

        while (n != null) {     //print each number of the list 
            System.out.println(n.getNum());
            n = n.getNext();

        }
    }
/**
 * check if the list is empty 
 * @return list status
 */
    public boolean isEmpty() {
        if (numItems == 0) {    //check if there are any numbers in the list 
            return true;
        } else {
            return false;
        }
    }
/**
 * remove a number from the list 
 * @param n number to remove
 */
    public void remove(int n) {
        
        Node current = head;    //start at the beginning
        int i = 0;
        if(numItems==1){        //if there is one number in the list
          if(n==head.getNum()){
              head = null;      //list = null
          }  
        }else{                  //if there are multiple items in the list
        if(n==head.getNum()){   //if the number is the first number
           head = head.getNext();
           head.setPrev(null);
           numItems--;
            
        }else{                  //if the number is not the first number

        while (i < numItems   && current.getNum() != n) { //search for the number's position
            current = current.getNext();
            i++;
        }
        
        if (current.getNum() != n) { //if the number is not in the list
            System.out.println("Not in the list");
        } else if (i == 0) {         //if the number is first
            head = current.getNext();
            current.setNext(null);
            numItems--;
        } else if (i == numItems-1) {//if the number is last
            
            current.getPrev().setNext(null);
            current.setPrev(null);
            numItems--;
            
        } else {                    //if the number is in the middle somewhere
            
            current.getNext().setPrev(current.getPrev());
            current.getPrev().setNext(current.getNext());
            numItems--;
        }
        }
        }

    }
    /**
     * return value at a specific index
     * @param index
     * @return 
     */
    public int get(int index){
        index-=1;               //set the index from "1 to 0"
        if(numItems==0){        //if list is empty
            System.out.println("error");
            return 0;
        }else{                  //if list is not empty
            Node current = head;//start at the front
            for (int i = 0; i < index; i++) {//search for the index
                current = current.getNext();
            }
            return current.getNum();//return value at index
        }
    }
    /**
     * return size of the list
     * @return 
     */
    public int size(){
    return numItems; //return number of items in list
        
        
    }
    
    
    
    
    }

