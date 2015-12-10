/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitin
 */
public class arrayList {

    private int[] array;
    private int size;
    private int itemNum;

    /**
     * Makes an empty array of size 10.
     */
    public arrayList() {
        size = 10;
        itemNum = 0;
        array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = 0;
        }
    }

    public void add(int n, int index) {
        //i the number being added is the first one than place it in the first position of the array
        if (itemNum == 0 && index == 0) {
            array[0] = n;
            itemNum++;
        } else if (index <= itemNum) {
            /*if the position where the number is added is less than 
             or equal to the number of items being added in the list 
             then go through the following conditions
             */

            //if the index is at the end of the array add the number to the array
            if (index == itemNum) {
                array[index] = n;
                itemNum++;
            } else {
                //shuffles numbers over 1 position
                for (int i = itemNum; i >= index; i--) {
                    array[i + 1] = array[i];
                }
                //increase the item number & add the number to the specified index
                array[index] = n;
                itemNum++;

            }
        }

        //if the array is filled than double it
        if (itemNum == size - 1) {
            doubleSize();
        }

    }

    public void doubleSize() {
        //creat a new array
        int[] doubledArray = new int[size* 2]; 
        
        //cop numbers from main array to the new doubled array
        for (int i = 0; i < size; i++) {
            doubledArray[i] = array[i];
        }
        array = doubledArray; //make the main array the new array with double the size
    }

    public void remove(int index) {
        //if the index is at the end then clear that position and decrease the item number by 1
        if (index == itemNum - 1) {
            array[index] = 0;
            itemNum--;
        } else if (index >= 0 && index < itemNum) {
            //other times, dhuffle everything down by 1 and decrease the item number by 1
            for (int i = index; i <= itemNum; i++) {
                array[i] = array[i + 1];
            }
            itemNum--;
        }
    }

    //return the size of the array
    public int size() {
        return itemNum;
    }
    
    //return true of false if the array is empty 
    public boolean isEmpty() {
        if (itemNum == 0) {
            return true;
        } else {
            return false;
        }
    }

    //get the number at a certain position in the array 
    public int get(int index) {
        return array[index];
    }

    //prints the array
    public void printList() {
        for (int i = 0; i < itemNum; i++) {
            System.out.println(array[i]);
        }
    }

}
