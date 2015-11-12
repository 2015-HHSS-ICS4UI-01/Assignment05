/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ADTList list = new ADTList();
        list.add(0,0);
        list.add(2,1);
        list.remove(-1);
        list.print();
    }
    
    /**
     * Returns whether or not a string is in the form of "[char]$[char]"
     * @param str the string to be checked
     * @return true if the string is in the proper format; otherwise, return false
     */
    public static boolean isValidString(String str)
    {
        // a stack is going to be used to compare the part before the $ and the part after
         ADTStack stack = new ADTStack();
         
         // the dollar sign has not yet been reached
         boolean doneAdding = false;
         
         for (int i = 0; i < str.length(); i ++)
         {
             // if the dollar sign has been reached, doneAdding is set to true, and the loop goes to the next iteration
             if (str.charAt(i) == '$')
             {
                 doneAdding = true;
             }
             // if the dollar sign has not yet been reached
             else if (!doneAdding)
             {
                 // add the current element to the stack (this reverses the order of the part 
                    //before the dollar sign, making it comparable to the part after
                 stack.add(new CharNode(str.charAt(i)));
             }
             // if everything has been added, compare the last added character in the 
                // stack to the next character in the string
             else
             {
                 /* if the stack is empty but the end of the string has not yet been reached,
                  *     the last part is longer than the first part and the string is not valid
                  * 
                  * otherwise, if the two characters do not match, the string is invalid
                  */  
                 if (stack.isEmpty() || stack.pop().getValue() != str.charAt(i))
                 {
                     return false;
                 }
             }
         }
         
         /*
          * if the end of the string has been reached but the stack is not yet empty,
          *     then the fist part is longer than the last part, and the string is invalid
          */
         if (!stack.isEmpty())
         {
             return false;
         }
         
         // at this point, the string is definitely valid
         return true;
    }
}
