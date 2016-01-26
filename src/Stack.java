/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Stack {
    //Same as the stack example made in class, except using char
    
    
    private int numItems;
    private Nodechar head;
    
    
    public Stack(){
    head = null;
    numItems = 0;
    }
    
    public int size(){
        return numItems;
    }
    
    public char peek(){
        return head.getChar();
    }
    
    public void push(char c){
        Nodechar n = new Nodechar(c);
        n.setNext(head);
        head = n;
        numItems++;
    }
    
    public char pop(){
        Nodechar temp = head;
        head = head.getNext();
        numItems--;
        return temp.getChar();
    }

   
    
}
