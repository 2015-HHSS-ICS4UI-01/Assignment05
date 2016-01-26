/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author thomt9963
 */
public class ArrayList {
    
    private int[] List;
    private int[] temp;
    private int numItems;

    public ArrayList() {
        List = new int[10];
        numItems = 0;
    }
    
    
    /**
     * remove a integer from the array
     * @param i the spot in the array
     */
      public void remove(int i) {
        for (int j = i; j < numItems - 1; j++) {
            List[j] = List[j + 1];
        }
        numItems--;
    }
      
      
      /**
       * add a integer to the array
       * @param i spot in the array 
       * @param num integer
       */
    public void add(int i, int num) {
        numItems++;
         if (numItems > List.length) {
            temp = new int[2 * (List.length)];
            for (int j = 0; j > numItems; j++) {
                List[j] = temp[j];
                List[i] = num; 
            }


        } else if (i == 0) {
            for (int j = numItems; j >= 1; j--) {
                List[j] = List[j + 1];
            }
            List[i] = num;



        }else if(i > 0 && i < numItems ){
            for (int j = i; j <= numItems; j++) {
                List[i] = List[j + 1];
            }
            List[i] = num;
        }

    }
    
    
    /**
     * Check if the array is empty
     * @return if array is empty
     */
    public boolean isEmpty() {
        if (numItems > 0) {
            return false;
        }else{
        return true;
    }
    }
    
    
    
    /**
     * Get the integer at spot "i"
     * @param i location within the array holding the integer
     * @return the integer
     */
    public int get(int i) {
        if (i >= numItems || i < 0) {
            throw new IndexOutOfBoundsException("null");
        }else{
            return List[i];
        }
    }
}

