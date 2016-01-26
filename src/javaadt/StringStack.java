/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author kampn2687
 */
public class StringStack {
    int numItems;
    private char [] mainArray;
    int num;
    
    public StringStack() {
        mainArray = new char[100];
        numItems = 0;
    }
   
    public boolean IsEmpty() {


        if (numItems > 0) {
            return false;
        }
        return true;

    }
    public int size(){
        return numItems;
    }
    public char peek(){
        
        return mainArray[0];
        
    }
    public char pop(){
        
        
        for(int i = 0; i >= 0; i--){
            mainArray[i]= mainArray[i - 1];
        }
        numItems--;
        return mainArray[0];
        
        
    }
    public void push(char letter){
       if(numItems == 0){
        mainArray[0]= letter;
        numItems ++;
       }else {
           
           for(int i = 0; i < numItems +1; i++){
               mainArray[i] = mainArray[i+1];
           }
           mainArray[0]= letter;
        numItems ++;
       }
        
    }
}
