/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Test {

    /**
     * Checks a string to see if it is of the type w$w (e.g. cat$tac)
     * @param word the word to check
     */
    static boolean isW$W(String word){
        Stack check = new Stack();
        
        //reverses the word by adding it to the stack
        for(int i = 0; i < word.length(); i++){
            check.push(word.charAt(i));
        }
        
        //String to hold the reversed word
        String reversed = "";
        
        //removes the word from the stack
        for(int i = 0; i < word.length(); i++){
            reversed = reversed + check.pop();
        }
        
        //if the word does not contain a dollar sign
        //the word is not of the type W$W
        if(!reversed.contains("$")){
            return false;
        }
        //if the word is the same as itself reversed
        //the word is of the type W$W
        else if(word.equals(reversed)){
            return true;
        }
        //if the word is not the same as itself reversed
        //the word is not of the type W$W
        else{
            return false;
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tests the Ordered List
        MyOrderedList list = new MyOrderedList();
        list.add(7);
        list.add(10);
        list.add(12);
        list.add(4);
        list.add(6);
        list.add(11);
        list.add(20);
        list.add(11);
        list.add(9);
        
        // list.printList();

        // System.out.println("List Size: " + list.size());
        // System.out.println("Empty? " + list.isEmpty());
        // System.out.println("Value of Node at index 3: " + list.get(3));
         
        //tests the Array List
        
        MyArrayList list2 = new MyArrayList();
        
        list2.add(0,2);
        list2.add(0,1);
        list2.add(0,6);
        list2.add(0,56);
        list2.add(0,33);
        list2.add(0,23);
        list2.add(0,12);
        list2.add(0,75);
        list2.add(0,54);
        list2.add(0,123);
        list2.add(0,14);
        list2.remove(3);
        
        list2.printList();
        
        System.out.println("List Size: " + list2.size());
        System.out.println("Empty? " + list.isEmpty());
        System.out.println("Value of number at index 3: " + list2.get(3));
        
        //tests the String stack
        System.out.println(isW$W("cat$tac"));
        
        
    }
}
