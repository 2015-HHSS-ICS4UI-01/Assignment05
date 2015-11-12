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
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, 1);
        arrayList.add(5, 5);
        arrayList.add(3, 1);
        
        arrayList.printList();

        //stacks
//        String word = "cat$cat";
//        isValidString(word);
    }

    public static void isValidString(String word) {
        Stack stack = new Stack();
        String words[] = word.split("\\$", 2);
        String reversedStr = "";
        for (int i = 0; i < words[0].length(); i++) {
            stack.push(new CharNode(words[0].charAt(i)));
        }
        while (!stack.isEmpty()) {
            reversedStr += stack.pop().getChar();
        }
        System.out.println(reversedStr.equals(words[1]));
    }
}
