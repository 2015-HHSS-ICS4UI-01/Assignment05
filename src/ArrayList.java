/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class ArrayList {
  private int[] list;
  private int arraySize;
  private int numItems;
  
  public ArrayList(){
      arraySize = 10;
      list = new int[arraySize];
      numItems = 0;
      for (int i = 0; i < arraySize; i++) {
          list[i] = 0;
      }
  }
  
  public void add(int n, int index){
      
      if(numItems==0){
          if(index==0){
          list[0]=n;
          numItems++;
          }
      }else if(index<=numItems){
          if(index==numItems){
             list[index] = n; 
             numItems++;
          }else{
              
              for (int i = numItems; i >= index; i--) {
                  list[i+1]=list[i];
              }
              
              list[index]=n;
              numItems++;
 
          }
      }else{
          //do nothing
      }
      
      if(numItems==arraySize-1){
        list = increase(list); 
      }
      
      
  }
  
  public void printList(){
      for (int i = 0; i < numItems; i++) {
          System.out.println(list[i]);
      }
  }
  
  public int[] increase(int[] n){
   int[] temp = new int[arraySize*2];  
   
      for (int i = 0; i < arraySize; i++) {
          temp[i]=n[i];
      }
      
    arraySize*=2;
    
    return temp;
      
      
  }
  
  public void remove(int index){
      if(index==numItems-1){
          list[index]=0;
          numItems--;
      }else if(index>=0&&index<numItems){
         
          for (int i = index; i <= numItems; i++) {
              list[i]=list[i+1];
          }
          numItems--;
      }else{
          
      }
  }
  
  public int size(){
      return numItems;
  }
  
  public int get(int index){
      return list[index];
  }
  
  public boolean isEmpty(){
      if(numItems==0){
          return true;
      }else{
          return false;
      }
  }
  
  
}
