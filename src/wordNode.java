/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class wordNode {
  private char num;
  private wordNode next;
  private wordNode prev;
  public wordNode(char n){
      this.num = n;
      next = null;
      prev = null;      
  }
  
  public wordNode(char n, wordNode next){
      this.num = n;
      this.next = next;
      prev = null;
  }
  
  public wordNode getNext(){
      //returns next node after this one
      return this.next;
  }
  
  public void setNext(wordNode n){
      //makes this node point to next
      this.next = n;  
  }
      
  //MMAKES THE NODE POINT TO SOMETHING BEHIND IT
  public void setPrev(wordNode n){
      this.prev = n;
  }
 
  //returns the number the node stores
  public char getNum(){
      return this.num;
  }

  //if the node is connected to node in front of it
  public boolean hasNext(){
      return next != null;
  }
  
  //if the node is connected to a node behind it
  public wordNode getPrev(){
      return this.prev;
  }
  

}

