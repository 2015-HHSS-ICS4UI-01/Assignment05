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
     * @return the number of letters in the Stack.
     */
    public int size(){
        return numChars;
    }
    
    /**
     * Get the first letter in the Stack.
     * @return the first letter of the Stack.
     */
    public char peek(){
        return word.charAt(0);
    }
    
    /**
     * Adds a letter to the top of the Stack.
     * @param c the letter that is being added.
     */
    public void push(char c){
        word = c + word;
        numChars++;
    }
    
    /**
     * Removes a letter from the top of the Stack.
     * @return the letter that was removed.
     */
    public char pop(){
        char temp = word.charAt(0);
        word = word.substring(1, word.length());
        numChars--;
        return temp;
    }
    
    /**
     * Check if the list is empty.
     * @return whether or not the list has letters in it.
     */
    public boolean isEmpty(){
        if(numChars == 0){
            return true;
        }else{
            return false;
        }
    }
}
