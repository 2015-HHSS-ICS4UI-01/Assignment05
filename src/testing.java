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
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, 1);
        arrayList.add(1, 5);
        arrayList.add(2, 3);
        arrayList.add(1, 2);
        arrayList.printList();
        System.out.println(isValidWord("$"));
    }
    
    public static boolean isValidWord(String word)
    {
        Stack stack = new Stack();
        String[] words = word.split("\\$", 2);
        for (int x = 0; x < words[0].length(); x++) {
            {
                stack.push(new CharNode(words[0].charAt(x)));
            }
        }
        String reverseStr = "";
        for (int x = words[0].length() - 1; x >= 0 ; x--)
        {
            reverseStr += stack.pop().getChar();
        }
        
        return(reverseStr.equals(words[1]));
    }
}
