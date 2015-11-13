/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jafer
 */
public class ArrayList {

    private int[] array;
    private int numItems;

    /**
     * Constructor for the ArrayList; an ADT list composed entirely of arrays.
     */
    public ArrayList() {
        array = new int[10]; //initialize 10-item array
        numItems = 0; //0 items to begin with
    }

    /**
     * Doubles the size of the array
     */
    public void doubleArray() {
        int[] newArray = new int[array.length * 2]; //new array is twice the length of the previous one
        for (int x = 0; x < array.length; x++) {
            newArray[x] = array[x]; //iterate through the old array and move the numbers to the new array
        }
        array = newArray; //set the global array to the new doubled array
    }

    /**
     * adds a number at a specific index
     *
     * @param index the index to add the number at
     * @param num the number to add at the index
     */
    public void add(int index, int num) throws Exception {
        if (index < 0 || index > numItems) { //throw an exception if the index is inadmissable
            throw new Exception("Invalid Index");
        } else {
            for (int x = array.length - 1; x > index; x--) { //move all items from the position index forward one spot
                array[x] = array[x - 1];
            }
            array[index] = num; //set the spot at the given index equal to the number
            numItems++; //increase the number of items
        }
        if (numItems == array.length) { //if the array is full, double it
            doubleArray();
        }
    }

    /**
     * removes the number at a specific index
     *
     * @param index
     */
    public void remove(int index) throws Exception {
        if (index < 0 || index >= numItems) { //throw an exception if the index is invalid
            throw new Exception("Invalid Index");
        } else {
            for (int x = index; x < array.length - 2; x++) { //iterate from the index of the number removed to the second last number in the array
                array[x] = array[x + 1]; //shuffle the numbers forward
            }
            numItems--; //decrease the number of items
        }
    }

    /**
     * Method that returns the number of items within the list
     *
     * @return numItems; the number of items in the list
     */
    public int size() {
        return numItems;
    }

    /**
     * Method that returns whether the list is empty or not
     *
     * @return whether number of items is 0
     */
    public boolean isEmpty() {
        return numItems == 0;
    }

    /**
     * Getter for a number at a specific index
     *
     * @param index the index at which to get the number from
     * @return number at the index
     */
    public int get(int index) throws Exception {
        if (numItems != 0) {
            return array[index];
        }
        throw new Exception("Invalid Index"); //throw an exception if the index is invalid
    }

    /**
     * Prints the items in the list
     */
    public void printList() {
        for (int x = 0; x < numItems; x++) {
            System.out.println(array[x]);
        }
    }
}
