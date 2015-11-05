/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class A5Q3 {

    public boolean isMirrored(String word) {
        Stack stack = new Stack();
        boolean mirrored = true;
        
        if (word.length() % 2 == 1) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == '$') {
                    String check = word.substring(i + 1);
                    break;
                } else {
                    Node temp = new Node(i);
                    stack.push(temp);
                }
            }
            for(int i = 0; i < word.length(); i ++){
                if()
            }

        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        A5Q3 test = new A5Q3();
        System.out.println(test.isMirrored("cat$tac"));
    }
}
