/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Stack {
    
    private String word;
    private int numChars;
    
    /**
     * Constructor for the Stacks.
     */
    public Stack(){
        word = "";
        numChars = 0;
    }
    
    /**
     * Get the size of the Stack.
     * @return the number of items in the Stack.
     */
    public int size(){
        return numChars;
    }
    
    /**
     * Get the first node in the Stack.
     * @return the head Node of the Stack.
     */
    public char peek(){
        return word.charAt(0);
    }
    
    /**
     * Adds a character to the top of the Stack.
     * @param n the value of the Node being added.
     */
    public void push(char n){
        word = n + word;
        numChars++;
    }
    
    /**
     * Removes a Node from the top of the Stack.
     * @return the Node that was removed.
     */
    public char pop(){
        char temp = word.charAt(0);
        word = word.substring(1, word.length());
        numChars--;
        return temp;
    }
    
    public boolean isEmpty(){
        if(numChars == 0){
            return true;
        }else{
            return false;
        }
    }
}
