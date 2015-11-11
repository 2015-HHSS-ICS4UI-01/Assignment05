/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class A5Q2 {

    private int[] list = new int[10];
    private int numItems;

    /**
     * Creates an empty list
     */
    public A5Q2() {
        numItems = 0;
    }

    /**
     * Adds the number to the specified position
     *
     * @param index the position to add the number
     * @param num the number to add to the list
     */
    public void add(int index, int num) {
        //adds the number to empty list
        if (numItems == 0 && index == 0) {
            list[0] = num;
            //increase the list size
            numItems++;
            //adding the number
        } else if (index <= numItems) {
            //shuffle the contents forward you reach the index
            for (int i = numItems; i > index; i--) {
                list[i] = list[i - 1];
            }
            //add the number
            list[index] = num;
            //increase the list size
            numItems++;
        }
        //doubling the array size
        if (numItems == list.length) {
            //create new array
            int[] temp = new int[list.length * 2];
            //copy contents of original array to new array
            for (int i = 0; i < list.length; i++) {
                temp[i] = list[i];
            }
            //point towards the new array
            list = temp;
        }
    }

    /**
     * Removes a number from the array
     *
     * @param index the position of the number to remove
     */
    public void remove(int index) {
        //make sure you can remove it
        if (numItems > 0 && index < numItems) {
            //shuffle the items backward until you reach the index
            for (int i = index; i < numItems; i++) {
                list[i] = list[i + 1];
            }
            //decrease the list size
            numItems--;
        }
    }

    /**
     * Getter for the size of the list
     *
     * @return size of the list
     */
    public int size() {
        return numItems;
    }

    /**
     * Getter for the lists state of emptiness
     *
     * @return if the list is empty or not
     */
    public boolean isEmpty() {
        //the list is empty
        if (numItems == 0) {
            return true;
            //the list is not empty
        } else {
            return false;
        }
    }

    /**
     * Getter for the stored number in the array
     *
     * @param index the position of the number to return
     * @return the number in the array at the index's position
     */
    public int get(int index) {
        return list[index];
    }

    /**
     * For use with Testing class
     */
    public void printList() {
        for (int i = 0; i < numItems; i++) {
            System.out.println(list[i]);
        }
    }
}
