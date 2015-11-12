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
     * @param index
     * @param num
     */
    public void add(int index, int num) {
        if (index == 0) { //add the number to the start if its at the start
            array[0] = num;
            numItems++;
        } else if (index < 0) { //set the index to the beginning if its less than 0
            index = 0;
        } else if (index >= array.length) { //set the index to the end if its greater than the length
            index = array.length - 1;
        }
        for (int x = array.length - 1; x > index; x--) { //move all items from the position index forward one spot
            array[x] = array[x - 1];
        }
        array[index] = num; //set the spot at the given index equal to the number
        numItems++; //increase the number of items

        if (numItems == array.length) { //if the array is full, double it
            doubleArray();
        }
    }

    public void remove(int index) {
        if (index < 0) { //set the index to the beginning if its less than 0
            index = 0;
        } else if (index >= array.length) { //set the index to the end if its greater than the length
            index = array.length - 1;
        }
        for (int x = index; x < array.length - 2; x++) {
            array[x] = array[x + 1];
        }
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int get(int index) {
        return array[index];
    }

    public void printList() {
        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
        }
    }
}
