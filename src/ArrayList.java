/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class ArrayList {
  private int[] list;           //array for list
  private int arraySize;        //size variable
  private int numItems;         //number of items in array
  
  public ArrayList(){
      arraySize = 10;                       //default array size
      list = new int[arraySize];            //array 
      numItems = 0;                         //no items
      for (int i = 0; i < arraySize; i++) { //initialize array
          list[i] = 0;
      }
  }
  /**
   * add a character at a specific index
   * @param n charcter
   * @param index index
   */
  public void add(int n, int index){
      
      if(numItems==0){              //if array is empty 
          if(index==0){             //if the position is 0
          list[0]=n;
          numItems++;
          }
      }else if(index<=numItems){   //if index is within the array
          if(index==numItems){     //if the index is last
             list[index] = n;      //place the number last
             numItems++;
          }else{                   //if the index is in the middle
              
              for (int i = numItems; i >= index; i--) {//shuffle down the part of the array past the index
                  list[i+1]=list[i];
              }
              
              list[index]=n;       //place the number
              numItems++;
 
          }
      }else{
          //do nothing
      }
      
      if(numItems==arraySize-1){ //if needed increase the array size
        list = increase(list); 
      }
      
      
  }
  /**
   * print the array
   */
  public void printList(){
      for (int i = 0; i < numItems; i++) {
          System.out.println(list[i]);
      }
  }
  /**
   * double the size of an array
   * @param n array
   * @return new array
   */
  public int[] increase(int[] n){
   int[] temp = new int[arraySize*2];  //new array
   
      for (int i = 0; i < arraySize; i++) { //transfer values
          temp[i]=n[i];
      }
      
    arraySize*=2; //reset default array size
    
    return temp; //return new array
      
      
  }
  /**
   * remove number at an index
   * @param index 
   */
  public void remove(int index){
      if(index==numItems-1){ //if the index is last
          list[index]=0;
          numItems--;
      }else if(index>=0&&index<numItems){   //if the index is first or in the middle
         
          for (int i = index; i <= numItems; i++) { //shuffle the array back from the index
              list[i]=list[i+1];
          }
          numItems--;
      }else{
          
      }
  }
  /**
   * return number of items
   * @return 
   */
  public int size(){
      return numItems;
  }
  /**
   * return a value at a specific index
   * @param index
   * @return 
   */
  public int get(int index){
      return list[index];
  }
  /**
   * check if array is empty
   * @return 
   */
  public boolean isEmpty(){
      if(numItems==0){
          return true;
      }else{
          return false;
      }
  }
  
  
}
