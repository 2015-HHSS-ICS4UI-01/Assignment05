/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yaol9270
 */
public class Testing {
    
    public static void main(String[] args){
        ResizableArray list = new ResizableArray();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);
        list.add(5,5);
        list.add(6,5);
        list.add(7,5);
        list.add(8,5);
        list.add(9,5);
        list.add(10,7);
        list.add(2,99);
        list.remove(3);


        
        
        list.printList();
        System.out.println("");

        list.printList();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.get(3));
        String word ="georgethelegend$dnegelehtegroeg";
        System.out.println(isValidString(word));
    }
    
    
    public static boolean isValidString(String word){
        Stack stack = new Stack();
        int i = 0;
        //push all until a $ appears in the stack
        while (i < word.indexOf("$"))
        {
            stack.push(new CharNode(word.charAt(i)));
            i++;
        }
        
        //new string (nothing inside) to hold the reverse of the word
        String reverse = "";
        
        //push all up to $ in the reverse string
        while (i > 0)
        {
            reverse += stack.pop();
            i--;
        }
        //make the second part a string
        String mirror = word.substring(word.indexOf("$")+1, word.length());
        //compare them, is the first part the same as the second part
        if(reverse.equals(mirror)){
            //if yes, return true
            return true;
        }else{
            //if no, return false
            return false;
        }
        }
    }
    

