

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaj4926
 */
public class Stack {
    
    private NodeChar head;
    private int numItems;
    
    public Stack(){
        head = null;
        numItems = 0;
    }
    
    public int size(){
        return numItems;
    }
    
    public char peek(){
        return head.getchar();
    }
    
    public void push(char c){
        NodeChar n = new NodeChar(c);
        n.setNext(head);
        head = n;
        numItems++;
    }
    
    public char pop(){
        NodeChar temp = head;
        head = head.getNext();
        numItems--;
        return temp.getchar();
    }
}
