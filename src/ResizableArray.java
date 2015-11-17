/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class ResizableArray {

    private int numItems = 0;
    int[] array = new int[10];
    
    public ResizableArray() {
       
        numItems = 0;
        
    }
    

    
    public void add(int index, int num) {
        if(numItems == array.length){
            int[] temp = new int[array.length*2];
            for(int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
            array = temp;
        }
        if(numItems == 0&&index == 0){
          
            array[0]=num;
        }
        else if(index == numItems){
            array[index] = num;
        }else{
         for(int i = numItems; i >= index ; i--){
            array[i+1] = array[i];
        }
         
        array[index] = num;
        
            //add
            
        }
        numItems++;
    }
    
    public void remove(int index) {
        if(numItems==1){
            array[0] = 0;
        }
        else{
            for(int i = index; i < numItems ; i++){
                array[i] = array[i+1];
            }
        }
        
        
        numItems--;
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        if(numItems == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int get(int index) {
        return array[index];
    }
    public void printList(){
        
        for(int i = 0; i < numItems; i++){
            System.out.println(array[i]);
        }
    }
}
