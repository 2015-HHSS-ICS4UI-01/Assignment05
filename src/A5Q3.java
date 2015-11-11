/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class A5Q3 {

    /**
     * Checks if a word is in the right language
     *
     * @param word the String to check
     * @return if it is mirrored or not (true or false)
     */
    public boolean isMirrored(String word) {
        Stack stack = new Stack();
        //initialize variables for use later
        String storedWord = new String();
        int storedLength = 1;

        //the number is an odd number
        if (word.length() % 2 == 1) {
            //run until the word's length
            for (int i = 0; i < word.length(); i++) {
                //the current char is "$"
                if (word.charAt(i) == '$') {
                    //create a substring with the remaining letters
                    storedWord = word.substring(i + 1);
                    //store the substring's length
                    storedLength = storedWord.length();
                    break;
                    //the current char is NOT "$"
                } else {
                    //create a node that stores the current char
                    StringNode temp = new StringNode(word.charAt(i));
                    //push this node into the stack
                    stack.push(temp);
                }
            }
            //run until the substring's length
            for (int i = 0; i < storedWord.length(); i++) {
                //create a node that stores the popped char from the stack
                StringNode stackWord = stack.pop();
                //the popped char matches the current char in the substring
                if (stackWord.getString() == storedWord.charAt(i)) {
                    //decrease the length of the substring
                    storedLength--;
                    //the popped char does NOT match the current char in the substring
                } else {
                    return false;
                }
            }

            //the number is an even number
        } else {
            return false;
        }

        //there are no more remaining char's in both the stack and substring
        if (stack.size() == 0 && storedLength == 0) {
            return true;
            //there are remaining char's in either the stack or substring
        } else {
            return false;
        }

    }

    /**
     * The Testing method for this Class
     *
     * @param args
     */
    public static void main(String[] args) {
        A5Q3 test = new A5Q3();
        //output if the entered word is in the right language
        System.out.println(test.isMirrored("feel$leef"));

    }
}
