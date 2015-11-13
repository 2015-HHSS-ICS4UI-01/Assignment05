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
    public static void main(String[] args) throws Exception {
        OrderedList list = new OrderedList();
        list.add(3);
        list.printList();
//        //stacks
//        String word = "apple$racecar";
//        isValidString(word);
    }
/**
 * Check if the word inputted is of the language w$w
 * @param word string/word to be analyzed
 */
    public static void isValidString(String word) {

        Stack stack = new Stack();
        String words[] = word.split("\\$", 2); // split the two parts around the dollar sign
        String reversedStr = ""; //reversed string

        for (int i = 0; i < words[0].length(); i++) {
            stack.push(new CharNode(words[0].charAt(i))); //push the first word into a stack
        }
        while (!stack.isEmpty()) {
            reversedStr += stack.pop().getChar(); //reverse the word that was pushed by popping the stack
        }
        System.out.println(reversedStr.equals(words[1])); //if the reversed string of word one equals word 2 (words[1])
    }
}
