/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaj4926
 */
public class StringStack {

    private Stack words;

    
    public StringStack() {
        words = new Stack();
    }
    
    public void word(String w){
        
        for(int i = 1; i < w.length(); i++){
             char b = w.charAt(0);
             words.push(b);
             
        }
    }
}
