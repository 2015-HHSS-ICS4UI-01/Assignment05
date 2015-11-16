/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alimu
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //OrderedList
        MyOrderedList list = new MyOrderedList();
        list.add(new Node(4));
        list.add(new Node(10));
        list.add(new Node(5));
        list.add(new Node(2));
        list.printList();
        System.out.println("");
        list.remove(4);
        list.printList();
        System.out.println("");
//        
        //ArrayList
//        ArrayList list = new ArrayList();
//        list.add(3,0);
//        list.add(2,1);
//        list.add(1,2);
//        list.add(7,3);
//        list.add(9,4);
//        list.remove(2);
//        list.printList();
//        System.out.println("");
        
        //stack
        String word ="test$tset";
        System.out.println(isValid(word));
        
    }
    
    public static boolean isValid(String word)
    {
        Stack stack = new Stack();
        int i = 0;
        //push all of the charcters up to the $ to the stack
        while (i < word.indexOf("$"))
        {
            stack.push(new CharNode(word.charAt(i)));
            i++;
        }
        
        //new empty string to hold the reversed word
        String reverse = "";
        
        //get all the characters up to the $ in reverse
        while (i > 0)
        {
            reverse += stack.pop();
            i--;
        }
        
        //make the second part as a string
        String secondPart = word.substring(word.indexOf("$") +1, word.length() );

        //check if theyre the same
        if(reverse.equals(secondPart)){
            //the reverse of the first part is equal to the second part
            return true;
        }else{
            //the reverse of the first part is not equal to the second part
            return false;
        }
        
    }
    
}
