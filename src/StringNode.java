/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Altered Node class to implement characters instead of integers
 * @author vonhn0812
 */
public class StringNode {
  private char num;
  private StringNode next;
  private StringNode prev;
  public StringNode(char n){
      this.num = n;
      next = null;
      prev = null;      
  }
  
  public StringNode(char n, StringNode next){
      this.num = n;
      this.next = next;
      prev = null;
  }
  
  /**
   * Get the node that is next in line
   * @return 
   */
  public StringNode getNext(){
      return this.next;
  }
  /**
   * Sets node this is pointing to 
   * @param n 
   */
  public void setNext(StringNode n){
      this.next = n;
  }
  /**
   * return number the node stores
   * @return 
   */
  public char getNum(){
      return this.num;
  }
  /**
   * if the node is connected to another
   * @return 
   */
  public boolean hasNext(){
      return next !=null;
  }
  
  public StringNode getPrev(){
      return this.prev;
  }
  
  public void setPrev(StringNode n){
      this.prev = n;
  }
}

