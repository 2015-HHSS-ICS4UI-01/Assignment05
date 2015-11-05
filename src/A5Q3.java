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
        String storedWord = new String();
        int storedLength = 1;
        
        if (word.length() % 2 == 1) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == '$') {
                    storedWord = word.substring(i + 1);
                    storedLength = storedWord.length();
                    break;
                } else {
                    Node temp = new Node(word.charAt(i));
                    stack.push(temp);
                }
            }
            for(int i = 0; i < word.length(); i ++){
                Node stackWord = stack.pop();
                
                
                if(stackWord.getNum() == storedWord.charAt(i)){
                    storedLength--;
                    
                }else {
                    return false;
                }
            }

        } else {
            return false;
        }
        
        if(stack.size() == 0 && storedLength == 0){
           return true; 
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        A5Q3 test = new A5Q3();
        System.out.println(test.isMirrored("cat$tac"));
    }
}
