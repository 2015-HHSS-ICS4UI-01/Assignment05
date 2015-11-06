/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rayan4858
 */
public class OrderedList {
    
    private int itemNum;
    private Node head;
    
    /**
     * Creates an empty ordered list
     */
    public OrderedList(){
        head = null;
        itemNum = 0;
    }
    
    public void add(Node n){
        n = head;
        
//        if (head.getNum() > n.getNum() ) {
//            n.setNext(head);
//            n = head;
//            itemNum ++;
//        }
    }
    
    public void remove(Node n, int x){
        
    }
    
    public int size(){
        return itemNum;
    }
    
    public void isEmpty(){
        if (itemNum == 0) {
            
        }
    }
    
    public void getInt(int x){
        int counter = 0;
        Node n = head;
        do{
            n = n.getNext();
            counter ++;
        }while (counter != x); 
           System.out.println(n); 
    }
    
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
    
    
    
    
    
    
    
    
}
