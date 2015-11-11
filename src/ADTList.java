/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class ADTList {
    private int[] array = new int[10];
    int lastValidIndex = 0;
    
    /**
     * Removes an element in the array at a specified index
     * @param index the index to clear
     */
    public void remove(int index)
    {
        // now that it's valid again, if the user inputs an index too large, make it the last valid one
        if (index > lastValidIndex)
        {
            index = lastValidIndex;
        }
        // if the index is less than 0, set it to 0
        else if (index < 0)
        {
            index = 0;
        }
        // Start at the index to remove and set it to the value of the index ahead of it
        //      the limit is decreased by one because we're looking one ahead
        for (int i = index; i < lastValidIndex-1; i ++)
        {
            array[i] = array[i+1];
        }
        // decrease the lastValidIndex because there's now one less element in the array
        lastValidIndex --;
    }
    
    /**
     * Adds an integer to a specified index in the array
     * @param index the location in the array to which the integer is added
     * @param num the integer to be added
     */
    public void add(int index, int num)
    {
        // if the lastValidIndex is not valid anymore, the array size is doubled
        if (lastValidIndex == array.length)
        {
            doubleArray();
        }
        // now that it's valid again, if the user inputs an index too large, make it the last valid one
        if (index > lastValidIndex)
        {
            index = lastValidIndex;
        }
        // if the index is less than 0, set it to 0
        else if (index < 0)
        {
            index = 0;
        }
        // if the index is not the last valid index, all of the elements are shuffled down
        for (int i = lastValidIndex; i > index; i --)
        {
            array[i] = array[i-1];
        }
        // the array slot the user specified is set to num
        array[index] = num;
        
        // now that we have added to the array, we can increment the last valid index
        lastValidIndex ++;
    }
    
    /**
     * Doubles the array size
     */
    private void doubleArray()
    {
        // create a new array which is twice as large as the original one, and simply add to it all of the elements in the old array
        int[] newArray = new int[array.length*2];
        for (int i = 0; i < array.length; i ++)
        {
            newArray[i] = array[i];
        }
        // set the current array as this new doubled and repopulated array
        array = newArray;
    }
    
    /**
     * Returns whether or not the array has any added elements
     * @return true if the array is empty; otherwise, return false
     */
    public boolean isEmpty()
    {
        // if the lastValidIndex is 0, no elements have yet been added
        return lastValidIndex == 0;
    }
    
    /**
     * Returns the number added elements in the array
     * @return the number of added elements in the array
     */
    public int size()
    {
        // return lastValidIndex because it is one ahead of the last filled index, whose sequence starts at 0
        return lastValidIndex;
    }
    
    /**
     * Gets an element from the array
     * @param index the index of the element
     * @return the element
     */
    public int get(int index)
    {
        return array[index];
    }
    
    public void print()
    {
        for (int i = 0; i < lastValidIndex; i ++)
        {
            System.out.print(array[i]);
        }
        System.out.println("");
    }
    
}
