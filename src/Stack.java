/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author donet6376
 */
public class Stack {
    
    private Node head;
    private int numItems;
    
    
    public Stack(){
        head = null;
        numItems = 0;
    }
    
    public int size(){
        return numItems;
    }
    
    public Node peek(){
        return head;
    }
    
    public void push(Node n){
        n.setNext(head);
        head = n;
        numItems++;
    }
    
    public Node pop(){
        Node temp = head;
        head = head.getNext();
        numItems--;
        return temp;
    }
    
}
