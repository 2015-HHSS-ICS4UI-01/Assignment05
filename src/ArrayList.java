
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author branc2347
 */
public class ArrayList {

    private int[] arrList; //inital arraylist, having 10 spots
    private int tailIndex; // the index of the last number in the arrayList

    public ArrayList() {
        arrList = new int[10];
        tailIndex = -1;
    }

    /**
     * Adds a specified number at the specified index in the array list
     *
     * @param index index of array at which to be placed
     * @param num the number to be added
     */
    public void add(int index, int num) {
        //if the array is full, double the length of the array
        if (tailIndex == arrList.length - 1) {
            arrList = Arrays.copyOf(arrList, arrList.length * 2); //create a new array with double the length and copy the previous one into the first half of it
        }

        if ((tailIndex < 0 || tailIndex + 1 == index) && tailIndex + 1 >= index) { //if the list is empty or if adding to the end of the list
            arrList[tailIndex + 1] = num; //make the first number the num
            tailIndex++; // a number has been added
        } else if (tailIndex >= index && index >= 0) { // if the index is valid, meaning it is within the indexes of the filled array
            for (int i = tailIndex; i >= index; i--) {
                arrList[i + 1] = arrList[i]; //shuffle all the spots in the array from the index one to the right
            }
            arrList[index] = num; //make the spot specified by the index in the array the number specified (now that the others were shifted)
            tailIndex++; //a number has been added
        }
    }

    /**
     * Print the array list, not including the zeros placed by default
     */
    public void printList() {
        for (int i = 0; i <= tailIndex; i++) {
            System.out.println(arrList[i]);
        }
    }

    /**
     * Determine whether the list is empty or not
     *
     * @return true or false, depending on length of the array
     */
    public boolean isEmpty() {
        return tailIndex < 0;
    }

    /**
     * Removes the number at the index specified by the user
     *
     * @param index index from which the number is to be removed from
     */
    public void remove(int index) {
        if (index < arrList.length && index >= 0) { //if the index is valid (must have a number in that index to be valid)
            for (int i = index; i < arrList.length - 1; i++) {
                arrList[i] = arrList[i + 1];
            }
            tailIndex--;
        }
    }

    /**
     * Get the number at a certain point in the array
     *
     * @param index spot at which the number is in the array
     * @return the number in the array specified by the index
     */
    public int getInt(int index) throws Exception {
        if (tailIndex >= 0) {
            return arrList[index];
        } else {
            throw new Exception("Invalid index for an empty array");
        }
    }

    /**
     * Get the size of the arrayList
     *
     * @return the amount of items in the list
     */
    public int size() {
        return tailIndex + 1;
    }
}
