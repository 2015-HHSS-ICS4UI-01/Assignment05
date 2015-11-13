
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author haidj9901
 */
public class testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        OrderedList orderedList = new OrderedList();
        
        orderedList.add(3);
        orderedList.add(2);
        orderedList.add(1);
        orderedList.add(0);
        System.out.println(orderedList.isEmpty());
        System.out.println(orderedList.size());
        
        System.out.println();

        Random rand = new Random();
        ArrayList arrayList = new ArrayList();
        for (int x = 0; x < rand.nextInt(10) + 10; x++)
        {
            arrayList.add(x, rand.nextInt(10));
        }
        arrayList.printList();
        
        System.out.println();
        
        String[] testCases = {"test$tset", "hello$olleh", "hi$ih", "racecar$racecar", "red$blue"};
        for (int x = 0; x < testCases.length; x++)
        {
            System.out.println(isValidWord(testCases[x]));
        }
    }

    /**
     * Checks if a string is given in the form "w$w" (if the characters before
     * the '$' are the in the reverse order of the characters after the '$'
     *
     * @param word the string/word that is going to be checked
     * @return true if the word is in the language or false if it is not in the
     * language
     */
    public static boolean isValidWord(String word) {
        Stack stack = new Stack(); //initialize stack
        String[] words = word.split("\\$", 2); //split the string into two strings based on the '$'
        for (int x = 0; x < words[0].length(); x++) {
            {
                stack.push(new CharNode(words[0].charAt(x))); //push each individual character from the first part of the string to the stack
            }
        }
        
        String reverseStr = ""; //initialize string used to hold the reverse order of the first part of the string
        for (int x = words[0].length() - 1; x >= 0; x--) {
            reverseStr += stack.pop().getChar(); //add the characters of the first word in reverse order
        }
        return (reverseStr.equals(words[1])); //return whether the first part reversed is the same as the second part.
    }
}
