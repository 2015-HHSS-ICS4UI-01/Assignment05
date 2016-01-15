/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class ADTListResizable {
    private int numItems;
    int [] array = new int[10];
    
    /**
     * Empty list
     */
    public ADTListResizable(){
        numItems = 0;
    }
    
    /**
     * Add a number to the list
     * @param index the position to place the number
     * @param num the number thats being added
     */
    public void add(int index, int num){
        //if there's no items in the list and index is zero, first item in the list placed at index 0
        if (numItems == 0 && index == 0){
            array[0] = num;
        }
        //number of items in the list reaches array capactity, size of the array is doubled
        if (numItems == array.length){
            int [] NewArray = new int[array.length*2]; //a temporary array that is double the size of original array is made
            for (int i = 0; i < array.length;i++){
                NewArray[i] = array[i]; //numbers in first array are moved to temporary array
            }
            array = NewArray; //old array is now equal in size to temporary array
        }
        
        if (numItems == index){
            array[index] = num;
        }
        else {
            //number added to array
        for (int i = numItems; i >= index; i--){
            array[i+1] = array[i];
        }
        array[index] = num;
    }
        numItems++;
    }
    
    /**
     * Remove a number from the list
     * @param index the position of the number that's being removed
     */
    public void remove(int index){
        //if there's only 1 item in list, it is removed at it's position
        if (numItems == 1){
            array[index] = 0;
            
    }
        else {   
            //number removed from array
        for (int i = index; i < numItems; i++){
        array[i] = array[i+1];
           }
        }
        numItems--;
    }
    
    /**
     * Checks the size of the list
     * @return the size of the list
     */
    public int size(){
        return numItems;
    }
    
    /**
     * Checks if the list is empty or not
     */
    public void isEmpty(){
         if (numItems == 0){
            System.out.println("The list is empty."); 
        }
        else if (numItems > 0){
            System.out.println("The list has items in it.");
        }
    }
    
    /**
     * Finds the number at a specific index
     * @param index the position of the number
     * @return the number at the specific position
     */
    public int get(int index){
        return array[index];
    }
    
    /**
     * Prints the list
     */
    public void printList(){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
