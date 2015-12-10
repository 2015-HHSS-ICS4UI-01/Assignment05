/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitin
 */
public class isValidWord {
    
        public static boolean validWord(String word) {
        
        //creats a stack 
        Stack stack = new Stack();
        int i = 0;
        
        while (i < word.indexOf("$")) {     //the word up until $ sign
            stack.push(new wordNode(word.charAt(i)));
            i++;
        }                                           
        String before$ = "";    //creats an empty string to store the word until $ backwards
                                                            
        while (i > 0) {     //gets the word from $ until word ends and puts it in reverese and then stores it in before$
            before$ += stack.pop();
            i--;
        }

        //stores word after $
        String after$ = word.substring(word.indexOf("$") + 1, word.length());

        //check if theyre the same
        if (before$.equals(after$)) {
            return true;
        } else { 
            return false;
        }

    }
}
