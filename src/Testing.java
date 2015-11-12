/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author branc2347
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack stack = new Stack();
        String word = "cat$tac";
        String words[] = word.split("\\$");
        String reversedStr = "";
        for (int i = 0; i < words[0].length(); i++) {
            stack.push(new CharNode(words[0].charAt(i)));
        }
        for (int j = 0; j < stack.size(); j++) {
            reversedStr += stack.pop().getChar();
        }
        System.out.println(stack.size());
        System.out.println(reversedStr);
    }
}
