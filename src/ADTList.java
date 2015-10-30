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
    int limit = 0;
    
    public void add(int index, int num)
    {
        if (limit == array.length)
        {
            expandArray();
        }
        if (index > limit)
        {
            index = limit;
        }
        limit ++;
        
    }
    
    private void expandArray()
    {
        int[] newArray = new int[array.length*2];
        for (int i = 0; i < array.length; i ++)
        {
            newArray[i] = array[i];
        }
    }
    
    public void print()
    {
        for (int i = 0; i < limit; i ++)
        {
            System.out.print(array[i]);
        }
        System.out.println("");
    }
    
}
