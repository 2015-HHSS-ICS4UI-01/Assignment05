/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class MyArrayList {
    private Node head;
    private int numItems;
    private int[] nums;
    
    /**
     * Creates an empty list.
     */
    public MyArrayList(){
        numItems = 0;
        nums = new int[10];
        for(int i = 0; i < nums.length; i++){
            nums[i] = 0;
        }
    }
    
    /**
     * Adds a number at a specific index of an array.
     * @param index the position to place the number.
     * @param n the number to add.
     */
    public void add(int index, int num){
        //if the total amount of numbers in the array is equal to its length
        //make an array twice the size of the current one
        if(numItems == nums.length){
            int[] newNums = new int[nums.length*2];
            for(int i = 0; i < newNums.length; i++){
                //add all numbers from the old array to the new one
                if(i < nums.length){
                    newNums[i] = nums[i];
                }
                //fill the array's new empty spaces with zeros
                else if(i >= nums.length){
                    newNums[i] = 0;
                }
            }
            //make the new array the array to add numbers to
            nums = newNums;
        }
        //if user tries to add a number at a spot not in the array, or a 0
        if(index > nums.length || num == 0){
            //do nothing
        }
        //adding to an empty spot or an empty list
        else if(nums[index] == 0 || numItems == 0){
            nums[index] = num;
            numItems++;
        }
        //adding to a spot that is occupied by another number
        else{
            for(int i = nums.length - 1; i >= index; i--){
                //if there is no room to move the last number of the array
                //make an array twice the size of the current one
                if(i == nums.length - 1 && nums[nums.length - 1] != 0){
                    int[] newNums = new int[nums.length*2];
                    for(int j = 0; j < newNums.length; j++){
                        //add the numbers of the old list to the new list
                        if(j < nums.length){
                            newNums[j] = nums[j];
                        }
                        //initialize the rest of the new list
                        else if(j >= nums.length){
                            newNums[j] = 0;
                        }
                        
                    }
                    //set the new list as the list to add numbers to
                    nums = newNums;
                    nums[i+1] = nums[i];
                    
                }
                //if there is room to move a number to the last part of the array
                else if(i == nums.length - 1 && nums[nums.length - 1] == 0){
                    //do nothing
                }
                //if number is not at the end of the array
                else{
                    //shift the number to the right
                    nums[i+1] = nums[i];
                }
            }
            //add the number into the specified location
            nums[index] = num;
            //a number has been added
            numItems++; 
            
        }
    }
    
    /**
     * Print out the list of numbers.
     */
    public void printList(){
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    
    /**
     * Removes a number from a specific index.
     * @param index the position to remove a number from.
     */
    public void remove(int index){
        //make sure it is in our list
        //if it isn't, return nothing
        if(index >= numItems || index < 0){
            return;
        }
        
        for(int i = index + 1; i < nums.length; i++){
            nums[i-1] = nums[i];
        }
        
        //if not already 0, set the end of the list to 0
        if(nums[nums.length - 1] != 0){
            nums[nums.length - 1] = 0;
        }
        
        //a number has been removed
        numItems--;
    }
    
    /**
     * Get the value of a number at a specified index.
     * @param index the position of the number to check.
     * @return the number at the specific position
     */
    public int get(int index){
        return nums[index];
    }
    
    /**
     * Get the total size of the List.
     * @return the total amount of numbers in the List.
     */
    public int size(){
        return numItems;
    }
    
    /**
     * Check if the list is empty or not.
     * @return whether or not the list has numbers in it.
     */
    public boolean isEmpty(){
        if(numItems <= 0){
            return true;
        }else{
            return false;
        }
    }
}
