/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaj4926
 */
public class StringStack {

    private NodeChar first;
    private Stack words;

    public StringStack() {
        words = new Stack();
        first = null;
    }

    public boolean word(String w) {

        for (int i = 0; i < w.length(); i++) {
            char b = w.charAt(i);
            words.push(b);
        }

        for (int i = 0; i < w.length(); i++) {
            
            if (w.charAt(i) != words.pop()) {
                return false;
            }
        }
        return true;
    }
}
