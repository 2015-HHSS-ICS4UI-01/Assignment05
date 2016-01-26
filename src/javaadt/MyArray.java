/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author kampn2687
 */
public class MyArray {

    private int[] mainArray;
    private int[] temp;
    private int numItems;

    public MyArray() {
        mainArray = new int[10];
        numItems = 0;
    }

    public void add(int index, int num) {
        numItems++;
        if (index < 0 || index >= numItems) {
            throw new IndexOutOfBoundsException();
        } else if (numItems > mainArray.length) {
            temp = new int[2 * (mainArray.length)];
            for (int i = 0; i > numItems; i++) {
                mainArray[i] = temp[i];
                mainArray[index] = num; 
            }


        } else if (index == 0) {
            for (int i = numItems; i >= 1; i--) {
                mainArray[i] = mainArray[i + 1];
            }
            mainArray[index] = num;



        }else if(index > 0 && index < numItems ){
            for (int i = index; i <= numItems; i++) {
                mainArray[i] = mainArray[i + 1];
            }
            mainArray[index] = num;
        }

    }

    public void remove(int index) {
        for (int i = index; i < numItems - 1; i++) {
            mainArray[i] = mainArray[i + 1];
        }
        numItems--;
    }

    public boolean isEmpty() {
        if (numItems > 0) {
            return false;
        }
        return true;
    }

    public int get(int index) {
        if (index >= numItems || index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            return mainArray[index];
        }
    }
}
