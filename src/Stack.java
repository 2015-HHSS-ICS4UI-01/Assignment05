/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class Stack {
    private int numItems; //number of items
    private StringNode head; //first character
    
    public Stack(){
       numItems = 0; //no items
       head = null; //no list
    }
 
    /**
     * add a character to the top of the stack
     * @param n character
     */
    public void push(StringNode n){
      if(numItems==0){          //if stack is empty
       n.setNext(head);
            head = n;
            n.setPrev(null);
            numItems++;   
      } 
      else{                     //if stack is not empty
          n.setNext(head);
                head.setPrev(n);
                head = n;
                n.setPrev(null);
                numItems++;
      }
    }
    /**
     * remove character at top of stack
     * @return character 
     */
    public char pop(){
        StringNode n = head;
        head = n.getNext();
        head.setPrev(null);
        numItems--;
        return n.getNum(); //return character
    }
    /**
     * print the stack
     */
    public void print(){
        StringNode n = head;
        for (int i = 0; i < numItems; i++) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
    /**
     * return character at top of stack
     * @return character
     */
    public char peek(){
        
       return head.getNum();
    }
    /**
     * return size of stack 
     * @return 
     */
    public int size(){
        return numItems;
    }
    /**
     * check for palindrome separated by "$"
     * @param n stack 
     * @return 
     */
    public boolean q3(Stack n){
        String p = ""; //string for word
        
        if(n.size()%2!=0){  //if the stack size is not an even number
            while(this.peek()!='$'){ 
             p=this.pop()+p;            //add each character to the new word until the $ is reached
            }
            this.pop();     //remove $
            
            
            
            if(p.length()!=numItems){ //if the size of the word is not the same as the characters left in the stack
            return false;
            }else{
                int num = numItems;
                int temp = 0;
             for (int i = 0; i < num; i++) {
                 
                
                  if(p.charAt(i)==this.peek()) { //compare characters in word to characters in stack in order
                      
                     if(numItems>1){
                         this.pop(); //remove numbers of stack
                     }
                         
                    
                      temp++;
                  } 
             }
                
               if(temp==num){ //if the word matches the characters in the stack
                   return true;
               } else{
                   return false;
               } 
                  
                 
             
            }
                
        }else{
            return false;
        }
        
    }
}
