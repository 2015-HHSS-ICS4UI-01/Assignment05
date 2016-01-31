/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rainy
 */
public class A5Q2 {
    private int[] arrayList = new int[10];  
    private int numItems;
    private boolean empty;
    
    
    public void add(int index, int num){
        numItems++;
        if(numItems > arrayList.length){
            int[] temp = new int[arrayList.length*2];
            for (int i = 0; i < arrayList.length; i++) {
                temp[i] = arrayList[i];
            }
            arrayList = temp;
        }
        if(empty){
            arrayList[0] = num;
            empty = false;
        }else if(index < numItems){
            numItems++;
            int temp = index;
            for (int i = index+1; i < numItems; i++, temp++) {
                arrayList[i] = arrayList[temp]; 
            }
            arrayList[index] = num;
        }else if(index >= numItems){
            
        }
    }

    public void remove(int index){
        if(!empty && index < numItems){
            for (int i = index+1; i < numItems; i++,index++) {
                arrayList[index] = arrayList[i];
            }
            numItems--;
        }else if((!empty && index == numItems)||(!empty && index == 0)){
            arrayList[index] = 0;
            numItems--;
        }
    }
    
    public int size(){
        return numItems;
    }
    
    public boolean isEmpty(){
        if(numItems == 0)
            empty = true;
        else if(numItems > 0)
            empty = false;
        return empty;
    }
    
    public int getNum(int index){
        if(index <= numItems)
            return arrayList[index];
        else
            throw new IndexOutOfBoundsException();
    }
}
