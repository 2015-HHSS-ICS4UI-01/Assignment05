/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class Node {
  private int num;
  private Node next;
  private Node prev;
  public Node(int n){
      this.num = n;
      next = null;
      prev = null;      
  }
  
  public Node(int n, Node next){
      this.num = n;
      this.next = next;
      prev = null;
  }
  
  /**
   * Get the node that is next in line
   * @return 
   */
  public Node getNext(){
      return this.next;
  }
  /**
   * Sets node this is pointing to 
   * @param n 
   */
  public void setNext(Node n){
      this.next = n;
  }
  /**
   * return number the node stores
   * @return 
   */
  public int getNum(){
      return this.num;
  }
  /**
   * if the node is connected to another
   * @return 
   */
  public boolean hasNext(){
      return next !=null;
  }
  
  public Node getPrev(){
      return this.prev;
  }
  
  public void setPrev(Node n){
      this.prev = n;
  }
}
