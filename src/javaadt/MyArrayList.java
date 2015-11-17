/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author simma1980
 */
public class MyArrayList {

    private int[] nums;
    private int numitems;

    public MyArrayList() {
        nums = new int[10];
        numitems = 0;
    }

    public void add(int index, int num) {
        if (index > numitems) {
            index = numitems;
        }
        if (numitems == nums.length) {
            int[] temp = new int[nums.length * 2];
            System.arraycopy(nums, 0, temp, 0, nums.length);
            nums = temp;
        }
        for (int i = numitems; i > index; i--) {
            nums[i] = nums[i - 1];
        }
        nums[index] = num;
        numitems++;
    }

    public void remove(int index) {
        for (int i = index; i < numitems - 1; i++) {
            nums[i] = nums[i + 1];
        }
        numitems--;
    }

    public int size() {
        return nums.length;
    }

    public boolean isEmpty() {
        if (numitems > 0) {
            return false;
        }
        return true;
    }

    public int get(int index) {
        if (index < numitems) {
            return nums[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
