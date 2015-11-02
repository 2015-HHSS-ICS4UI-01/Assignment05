/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class ADTList {
    private int[] array = new int[1];
    int lastValidIndex = 0;
    
    public void add(int index, int num)
    {
        // lastValidIndex is not a valid index anymore
        if (lastValidIndex == array.length)
        {
            expandArray();
        }
        // now that it's valid again, if the user inputs an index too large, make it the last valid one
        if (index > lastValidIndex)
        {
            index = lastValidIndex;
        }
        // If we're adding to the end, no point in suffling anything down
        if (index == lastValidIndex)
        {
            array[index] = num;
        }
        else
        {
            int current = array[index];
            int next = array[index+1];
            for (int i = index+1; i < lastValidIndex; i++)
            {
                array[i] = current;
                current = next;
                next = array[i+1];
            }
            array[index] = num;
        }
        
        // now that we have added to the array, we can increment the last valid index
        lastValidIndex ++;
    }
    
    private void expandArray()
    {
        int[] newArray = new int[array.length*2];
        for (int i = 0; i < array.length; i ++)
        {
            newArray[i] = array[i];
        }
        array = newArray;
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
