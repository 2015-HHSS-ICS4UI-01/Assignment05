/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class Queue {
    
    private Node start;
    private Node end;
    private int numItems;
    
    public Queue(){
        start = null;
        end = null;
        numItems = 0;
    }
    
    public void enqueue(Node n){
        if(numItems == 0){
            start = n;
            end = n;
        }else{
            end.setPrev(n);
            n.setNext(end);
            end = n;
        }
        numItems++;
    }
    
    public Node dequeue(){
        // temperary grab the guy at the start
        Node n = start;
        // change the start
        start = n.getPrev();
        // sever all links
        start.setNext(null);
        n.setPrev(null);
        
        return n;   
    }
    
    public int size(){
        return this.numItems;
    }
    
    public Node peek(){
        return this.start;
    }
}
