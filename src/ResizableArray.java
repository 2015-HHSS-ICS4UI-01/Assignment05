/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class ResizableArray {
     private int[] startArray;
    private int[] tempArray;
    private int numItems;

    public ResizableArray() {
        startArray = new int[10];
        numItems = 0;
    }

    public void Add(int index, int num) {
        numItems++;
        if (index < 0 || index >= numItems) {
            throw new IndexOutOfBoundsException();
        } else if (numItems > startArray.length) {
            tempArray = new int[2 * (startArray.length)];
            for (int i = 0; i > numItems; i++) {
                startArray[i] = tempArray[i];
                startArray[index] = num; 
            }


        } else if (index == 0) {
            for (int i = numItems; i >= 1; i--) {
                startArray[i] = startArray[i + 1];
            }
            startArray[index] = num;



        }else if(index > 0 && index < numItems ){
            for (int i = index; i <= numItems; i++) {
                startArray[i] = startArray[i + 1];
            }
            startArray[index] = num;
        }

    }

    public void Remove(int index) {
        for (int i = index; i < numItems - 1; i++) {
            startArray[i] = startArray[i + 1];
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
            return startArray[index];
        }
    }
    
    
    
    

}
