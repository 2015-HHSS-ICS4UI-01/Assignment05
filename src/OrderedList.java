/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rainy
 */
public class OrderedList {
    private Node head;
    private int numItems = 0;
    private boolean empty;
    
    public OrderedList(){
        head = null;
        empty = false;
        numItems = 0;
    }
    
    public void add(int n){
        Node node = new Node(n);
        Node temp;
        if(numItems==0){
            head=node;
            numItems++;
        }else{
            
        }
    }
    
    public void remove(int n){
        
    }
    
    public int size(){
        return numItems;
    }
    
    public boolean isEmpty(){
        if(numItems==0)
            empty = true;
        else
            empty = false;
        return empty;
    }
    
    public void get(int index){
        
    }
}
