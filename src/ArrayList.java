/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alimu
 */
public class ArrayList {

    private int[] list;
    private int size;
    private int numItems;

    public ArrayList() {
        numItems = 0;
        size = 10;
        //declare the array of a size of 10
        list = new int[size];
        //make the array empty
        for (int i = 0; i < numItems; i++) {
            list[i] = 0;
        }
    }

    public void add(int n, int index) {
        //if theres nothing in the array to start with
        if (numItems == 0 && index == 0) {
            //add the number to the first position
            list[0] = n;
            //add to the number of items in the list
            numItems++;
        } else if (index <= numItems) {
            //if the index is at the end or less than the number of items in the list
            if (index == numItems) {
                //if the index is at the end of the list add the number
                list[index] = n;
                numItems++;
            } else {
                //shuffle the numbers down as a result of adding the number
                for (int i = index; i < numItems; i++) {
                    list[i + 1] = list[i];
                }
                //add to the list
                numItems++;
                //add the number in
                list[index] = n;
            }
        }
        //if all the numbers no longer fit in the array
        if (numItems > size - 1) {
            //make a temporary array
            int[] temp = new int[size * 2];
            for (int i = 0; i < size; i++) {
                //move everything over
                temp[i] = list[i];
            }
            //multiply the size by two
            size *= 2;
        }
    }

    public void remove(int index) {
        if (index == numItems) {
            //if the number is at the end of the list
            list[index] = 0;
            //make the numbber of items in the list one less
            numItems--;
        } else if (index >= 0 && index < numItems) {
            //shuffle everything down
            for (int i = index; i <= numItems; i++) {
                list[i] = list[i + 1];
            }
            //the number of items in the list is one less
            numItems--;
        }

    }

    public void printList() {
        //print the list
        for (int i = 0; i < numItems; i++) {
            System.out.println(list[i]);
        }
    }

    public int size() {
        //return the number of items in the list
        return numItems;
    }

    public void get(int index) {
        //the number at the index the user requested
        System.out.println(list[index]);
    }

    public void isEmpty() {
        //if the list is empty
        if (numItems == 0) {
            System.out.println("List is empty");
        } else {
            System.out.println("There are items in the list");
        }
    }

}
