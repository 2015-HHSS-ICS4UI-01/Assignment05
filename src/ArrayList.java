/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Walter
 */
public class ArrayList {

    int[] array;
    int x;

    public ArrayList(int size) {
        x = size;
        array = new int[x];
    }

    public void add(int index, int num) {
        int counter = index;
        // if the index is less than the array size and the number at that index is 0
        if (index < array.length && array[index] == 0) {
            //the number at that index becomes the new number
            array[index] = num;
        } else {
            while (counter < array.length && array[counter] != 0) {
                counter++;
            }
            if (counter == array.length) {
                //make x double the size of the array 
                x = (array.length) * 2;
                //make a second array thats double the size of the old array
                int[] array2 = new int[x];
                for (int i = counter; i > index - 1; i--) {
                    if (i != 0) {
                        //i cannot be a negative number
                        array2[i] = array[i - 1];
                    }
                }
                array2[index] = num;
                //keep repeating until n is 0
                for (int n = index - 1; n > -1; n--) {
                    array2[n] = array[n];
                }
                array = array2;
            }
            if (counter != array.length && array[counter] == 0) {
                for (int x = counter; x < index; x--) {
                    array[x] = array[x - 1];
                }
                array[index] = num;
            }
        }
    }

    public void printList() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
