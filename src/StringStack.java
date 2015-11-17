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

    public void word(String w) {

        for (int i = 0; i < w.length(); i++) {
            char b = w.charAt(i);
            words.push(b);
        }

        for (int i = 0; i < w.length(); i++) {
            char place = words.peek();
            for (int j = 0; j < w.length() - 1; j++) {
                char b = w.charAt(i);
                words.pop();
            }
        }
    }
}
