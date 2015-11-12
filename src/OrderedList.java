/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class OrderedList {

    private Node head;
    private int numItems;

    public OrderedList() {
        head = null;
        numItems = 0;
    }

    public void add(Node n) {
        if (numItems == 0) {
            n.setNext(head);
            head = n;
            n.setPrev(null);
            numItems++;
           
        } else {
            Node current = head;
            int i = 0;
            int index = 0;
            if(numItems==1){
                if(n.getNum()>current.getNum()){
                index = 1;
                }else{   
                index = 0;    
                }
            }
            else{
            while (i < numItems - 1 && n.getNum() > current.getNum()) {
                current = current.getNext();
                i++;
                index++;
                

            }
               
            }
            
            if (index == 0 || n.getNum() == head.getNum()) {
                n.setNext(head);
                head.setPrev(n);
                head = n;
                n.setPrev(null);
                numItems++;
                
            } else if(index==1){
              n.setPrev(current.getPrev());
                n.setNext(current);
                current.getPrev().setNext(n);
                current.setPrev(n);
                numItems++;
            }
            else if (index >= numItems-1) {

                n.setPrev(current);
                current.setNext(n);
                n.setNext(null);
                numItems++;
                
            } else if(n.getNum()<current.getNum()) {
                
                n.setPrev(current.getPrev());
                n.setNext(current);
                current.getPrev().setNext(n);
                current.setPrev(n);
                numItems++;
                
            }else if(n.getNum()>current.getNum()){
              
              n.setPrev(current);
              n.setNext(current.getNext());
              current.getNext().setPrev(n);
              current.setNext(n);
              numItems++;
            }
            
        }
        


    }

    public void printList() {
        Node n = head;

        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();

        }
    }

    public boolean isEmpty() {
        if (numItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void remove(int n) {
        
        Node current = head;
        int i = 0;
        if(numItems==1){
          if(n==head.getNum()){
              head = null;
          }  
        }else{
        if(n==head.getNum()){
           head = head.getNext();
           head.setPrev(null);
           numItems--;
        }else{

        while (i < numItems   && current.getNum() != n) {
            current = current.getNext();
            i++;
        }
        
        if (current.getNum() != n) {
            
        } else if (i == 0) {
            head = current.getNext();
            current.setNext(null);
            numItems--;
        } else if (i == numItems-1) {
            
            current.getPrev().setNext(null);
            current.setPrev(null);
            numItems--;
            
        } else {
            
            current.getNext().setPrev(current.getPrev());
            current.getPrev().setNext(current.getNext());
            numItems--;
        }
        }
        }

    }
    
    public int get(int index){
        index-=1;
        if(numItems==0){
            System.out.println("error");
            return 0;
        }else{
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getNum();
        }
    }
    
    public int size(){
    return numItems;
        
        
    }
    
    
    
    
    }

