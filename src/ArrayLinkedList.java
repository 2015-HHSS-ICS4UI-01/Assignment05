/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaj4926
 */
public class ArrayLinkedList {
    
    private Node first;
    private int[] array = new int[10];
    private boolean empty = true;
    
    public ArrayLinkedList() {
        first = null;
    }
    
    public void add(int index, int num) {
        empty = false;
        //add a number at a spot that can be as big as there are things in the array or as small as 0
        //if my things in the array get to 10, double the array size
    }
    
    public void remove(int index) {
        //add a number at a spot that can be as big as there are things in the array or as small as 0
        //if my things in the array get to 10, double the array size
    }
    
    public Boolean isEmpty() {
        return empty;
    }
    
    public int getSize() {
        return array.length;
    }
    
    public int getSpot(int index){
        
    }
}
