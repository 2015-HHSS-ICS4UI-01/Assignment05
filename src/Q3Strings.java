/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Q3Strings {
    private final Stack word;
    private char c;
    
    /**
     * Empty stack
     */
    public Q3Strings(){
        word = new Stack();
    }
    
    
    /**
     *  Checks if the string entered is of the type w$w
     * @param s the string that is entered
     * @return true if the word is the type w$w and false if not
     */
    public boolean word(String s){
        //The characters are added to the stack
        for (int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            word.push(c);
        }  
        //both sides of the $ is checked to see if the characters are equal
        for (int i = 0; i< s.length(); i++){
            //bottom of stack is checked with top and so on to see if the characters are equal
            if (s.charAt(i) != word.pop()){
                //if the characters are not equal, false is returned
                return false;
            }

    }
        //if the characters are equal, true is returned
        return true;
}
    
    
    
    
}
