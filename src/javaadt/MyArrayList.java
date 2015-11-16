/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author simma1980
 */
public class MyArrayList {

    private int[] nums;
    private int numitems;

    public MyArrayList() {
        nums = new int[10];
        
    }
    
    public int size() {
        return numitems;
    }

    public boolean isEmpty() {
        if (numitems > 0) {
            return false;
        }
        return true;
    }
    
    public int get(int index) {
        if (index < numitems && index >= 0) {
          return nums[index];  
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}