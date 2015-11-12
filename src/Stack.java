/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class Stack {
    private int numItems;
    private StringNode head;
    
    public Stack(){
       numItems = 0;
       head = null;
    }
    
    public void push(StringNode n){
      if(numItems==0){
       n.setNext(head);
            head = n;
            n.setPrev(null);
            numItems++;   
      } 
      else{
          n.setNext(head);
                head.setPrev(n);
                head = n;
                n.setPrev(null);
                numItems++;
      }
    }
    
    public char pop(){
        StringNode n = head;
        head = n.getNext();
        head.setPrev(null);
        numItems--;
        return n.getNum();
    }
    
    public void print(){
        StringNode n = head;
        for (int i = 0; i < numItems; i++) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
    
    public char peek(){
        
       return head.getNum();
    }
    
    public int size(){
        return numItems;
    }
    
    public boolean q3(Stack n){
        String p = "";
        
        if(n.size()%2!=0){
            while(this.peek()!='$'){
             p=this.pop()+p;
            }
            this.pop();
            
            
            
            if(p.length()!=numItems){
            return false;
            }else{
                int num = numItems;
                int temp = 0;
             for (int i = 0; i < num; i++) {
                 
                
                  if(p.charAt(i)==this.peek()) {
                      
                     if(numItems>1){
                         this.pop();
                     }
                         
                    
                      temp++;
                  } 
             }
                
               if(temp==num){
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
