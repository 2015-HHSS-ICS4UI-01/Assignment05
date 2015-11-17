/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class OrderedList {

    Node head;
    private int numItems;

    public OrderedList() {
        head = null;
        numItems = 0;
    }

    
    

    
    public void add(Node n) {
        if (numItems == 0) {
            n.setNext(head);
            head = n;
            n.getPrev();
                 
            System.out.println("first");
        } else {
            Node current = head;

            for (int i = 0; i < numItems-1; i++) {
                
                if(current.getNum()>n.getNum()){
                    break;
                }
                current = current.getNext();
                

            }
            //set the node i'm adding's next node
            
            if(current.getNext()==null&&current.getNum() < n.getNum()){
                
                n.setPrev(current);
                n.setNext(null);
                current.setNext(n);
                System.out.println("end");
                
            }
            else if(current.getPrev()==null){
                
                n.setNext(current);
                n.setPrev(null);
                current.setPrev(n);
                head = n;
                System.out.println("start");
                
                
            }
            else{
                
                n.setPrev(current.getPrev());
                current.getPrev().setNext(n);
                n.setNext(current);
                current.setPrev(n);
                System.out.println("mid");
                
                
                
                
                
                
            }

            //add
            
        }
        numItems++;
    }

    public void remove(int num) {
        Node current = head;
        for(int i = 0; i < numItems-1; i++){
            
            if(current.getNum()==num){
                break;
            }
            current=current.getNext();
        }
        
        
        if(current.getNext()==null){
                
                current.getPrev().setNext(null);
                
                
            }
            else if(current.getPrev()==null){
                
                current.getNext().setPrev(null);
                
                head = current.getNext();
                System.out.println("start");
                
                
            }
            else{
                
                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());
                
                System.out.println("mid");
                
                
                
                
                
                
            }
        
        
        
        numItems--;
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        if(size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int get(int index) {
        Node n = head;
        for(int i = 0; i < index; i++){
            n = n.getNext();
        }
        return n.getNum();
    }
    public void printList(){
        Node n = head;
        while(n != null){
            System.out.println(n.getNum());
            n = n.getNext();
        }

    }
}
