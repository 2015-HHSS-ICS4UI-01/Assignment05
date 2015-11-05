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
     * Adds a node at a specific index
     *
     * @param index the position to place the node
     * @param n the node to add
     */
    public void add(int index, int num) {

        //adding the number to empty list
        if (numItems == 0 && index == 0) {
            list[0] = num;
            numItems++;
        } else if (index <= numItems) {
            for (int i = numItems; i > index; i--) {
                list[i] = list[i - 1];
            }
            list[index] = num;
            numItems++;
        }
        if (numItems == list.length) {
            int[] temp = new int[list.length * 2];
            for(int i = 0; i < list.length; i++){
                temp[i] = list[i];
            }
            list = temp;
        }
    }

    public void remove(int index) {
        if(numItems > 0 && index < numItems ){
            for(int i = index; i < numItems; i++){
                list[i] = list[i + 1];
            }
            numItems--;
        }
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        if (numItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int get(int index) {
        return list[index];
    }

    public void printList() {
        for (int i = 0; i < numItems; i++) {
            System.out.println(list[i]);
        }
    }
}
