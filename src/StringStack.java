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

    public boolean word(String w) {

        //fills my stack
        for (int i = 0; i < w.length(); i++) {
            char b = w.charAt(i);
            words.push(b);
        }

        //checks if the word is equal on both sides of the $
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) != words.pop()) {
                return false;
            }
        }
        return true;
    }
}
