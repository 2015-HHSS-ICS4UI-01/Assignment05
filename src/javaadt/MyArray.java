/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author kampn2687
 */
public class MyArray {
    private int[] mainArray;
    private int numItems;
    
    
    public int Size(){
        return numItems;
    }
     public boolean isEmpty(){
         if( numItems > 0){
             return false;
         }
             return true;
     }
     public int get(int index){
         if(index >= numItems || index < 0){
             throw new IndexOutOfBoundsException(); 
         }else{
             return mainArray[index];
         }
     }
}
