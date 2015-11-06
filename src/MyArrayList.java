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
        head = null;
        numItems = 0;
        nums = new int[10];
        for(int i = 0; i < nums.length; i++){
            nums[i] = 0;
        }
    }
    
    /**
     * Adds a number at a specific index of an array.
     * @param index the position to place the node
     * @param n the node to add
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
                else if(i > nums.length){
                    newNums[i] = 0;
                }
            }
            //make the new array the array to add numbers to
            nums = newNums;
        }
        //adding to an empty list
        if(numItems == 0){
            nums[index] = num;
            numItems++;
        }
        //adding to an empty spot
        else if(nums[index] == 0){
            nums[index] = num;
            numItems++;
        }
        //adding to a spot that is occupied by another number
        else{
            for(int i = nums.length; i >= index; i--){
                //if there is no room to move the last number of the array
                //make an array twice the size of the current one
                if(nums[nums.length - 1] != 0){
                    int[] newNums = new int[nums.length*2];
                    for(int j = 0; j < newNums.length; j++){
                        if(j < nums.length){
                            newNums[j] = nums[j];
                        }else if(j > nums.length){
                            newNums[j] = 0;
                        }
                    }
                }
                //if there is room to move a number to the last part of the array
                else if(nums[nums.length - 1] == 0){
                    //do nothing
                }
                nums[i] = nums[i+1];
            }
            
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
     * Removes a node from a specific index.
     * @param index the position to remove a node from.
     */
    public void remove(int index){
        //make sure it is in our list
        if(index >= numItems || index < 0){
            return;
        }
        //delete first item
        if(index == 0){
            head = head.getNext();
        //deleting end item
        }else if(index == numItems - 1){
            //go to the second last node
            Node n = head;
            for(int i = 0; i < index - 1; i++){
                n = n.getNext();
            }
            //make it point nowhere
            n.setNext(null);
        //remove from the middle
        }else{
            Node n = head;
            for(int i = 0; i < index - 1; i++){
                n = n.getNext();
            }
            //ask the node for its next next node
            n.setNext(n.getNext().getNext());
        }
        numItems--;
    }
    
    /**
     * Get the value of a Node at a specified index.
     * @param index the position of the Node to check.
     * @return the value of the Node.
     */
    public int getInt(int index){
        return nums[index];
    }
    
    /**
     * Get the total size of the List.
     * @return the number of Nodes in the List.
     */
    public int size(){
        return numItems;
    }
    
    /**
     * Check if the list is empty or not.
     * @return whether or not the list has Nodes in it.
     */
    public boolean isEmpty(){
        if(numItems <= 0){
            return true;
        }else{
            return false;
        }
    }
}
