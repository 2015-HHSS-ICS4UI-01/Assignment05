


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rainy
 */
public class StringStack {
    
    private Stack words;
    
    public StringStack(){
        words = new Stack();
    }
    
    public boolean word(String w){
    //fills the stack
        
        for (int i = 0; i < w.length(); i++) {
            char b = w.charAt(i);
            words.push(b);
        }
        
        //checks if the word is equal on both sides of the $
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) !=words.pop()){
               return false;
            }
        }
        return true;
    }
    
}
