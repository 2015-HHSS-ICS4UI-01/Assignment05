
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

    private int[] arrList = new int[10];
    private int tailIndex;

    /**
     * Creates an Empty List
     */
    public ArrayList() {
    }

    /**
     * Adds a node with a specific number in an ordered list
     *
     * @param num
     */
    public void add(int num) {

        if (arrList.length == 0) { //if the list is empty
            arrList[0] = num;
            tailIndex = 0;
        } else if (arrList[0] > num) { //if the number to be added is smaller than the first number in the ordered list
            arrList[1] = arrList[0];
            arrList[0] = num;
            tailIndex = 1;
        } else {
            if (tailIndex == arrList.length - 1) {
                arrList = Arrays.copyOf(arrList, arrList.length * 2);
            } else {
                if (arrList[tailIndex] <= num) {
                    arrList[tailIndex + 1] = num;
                } else {
                    for (int j = 0; j < arrList.length - 1; j++) { //for each spot in the list except the last one(becuase the second last Node.getNext = the last node)
                        if (arrList[j] > num) {
                            for (int i = arrList.length; i >= j; i--) {
                                arrList[i + 1] = arrList[i];
                                tailIndex = i + 1;
                            }
                        }
                    }
                }
            }
        }
    }

    public void printList() {
        for (int i = 0; i < arrList.length; i++) {
            System.out.println(arrList[i]);
        }
    }
//    /**
//     * Determine whether the list is empty or not
//     *
//     * @return true or false, depending on numItems
//     */
//    public boolean isEmpty() {
//        //if empty return true, else return false
//        if (numItems == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    /**
//     * Removes a node that contains the number the user wants to remove
//     *
//     * @param num the number to remove
//     */
//    public void remove(int num) {
//        Node n = arrList[0];
//        for (int i = 0; i < numItems - 1 && n.getNext() != null; i++) {
//            if (num == arrList[0].getNum()) {
//                arrList[0] = arrList[0].getNext();
//                break;
//            } else if (n.getNext().getNum() == num) {
//                n.setNext(n.getNext().getNext());
//                break;
//            }
//            n = n.getNext();
//        }
//    }
//
//    /**
//     * Get the number at a certain point in the array
//     *
//     * @param index spot at which the number is in the list of nodes
//     * @return the number of the node specified by the index
//     */
//    public int getInt(int index) {
//        Node n = arrList[0];
//        for (int i = 0; i < index; i++) {
//            n = n.getNext();
//        }
//        return n.getNum();
//    }
//
//    /**
//     * Get the size of the list of nodes
//     *
//     * @return the amount of items in the list
//     */
//    public int size() {
//        return numItems;
//    }
}
