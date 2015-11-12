/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class ADTList {

    int[] arraySize = new int[10];
    int[] arrayTemp = new int[10];
    private int numItems;
    private boolean isEmpty;

    /**
     * Creates an Empty List
     */
    public ADTList() {

        numItems = 0;
    }

    /**
     * Adds a node at specific index
     *
     * @param index the position to place the node
     * @param n the node to add
     */
    public void add(int num) {
        //adding to an empty list


        if (numItems == 0) {
            arraySize[0] = num;
            numItems++;
        } else {
//            if(arraySize[arraySize + 1] !=null){
//                arraySize
//            }
            for (int i = 0; i < arraySize.length; i++) {
                if (arraySize[i] == null) {
                    arraySize[i] = num;
                    break;
                } else if (i = arraySize[i]) {

                    for (int i = 0; i < arraySize.length; i++) {
                        if (arraySize[i] == null) {
                            i++;
                        }
                        arraySize[i] == arrayTemp[i];
                    }
                    arraySize = new int [arraySize * 2];
                    or (int i = 0; i < arraySize.length; i++) {
                        if (arraySize[i] == null) {
                            i++;
                        }
                        arraySize[i] == arrayTemp[i];
                    }

                }
            }
            numItems++;
        }
    }

    public void remove(int num) {
        if (numItems == 0) {
            System.out.println("no number to give back");
        } else {
            for (int i = 0; i < arraySize.length; i++) {
                arraySize[i] == null;

                for (int i = 0; i < arraySize.length; i++) {
                    if (arraySize[i] == null) {
                        i++;
                    }
                    arraySize[i] == arrayTemp[i];
                }
                break;
            }
        }
    }

    public int getInt(int index) {
        return arraySize[index];
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        if (numItems == 0) {
            isEmpty = true;
            return isEmpty;
        } else {
            isEmpty = false;
        }
        return isEmpty;

    }
}
