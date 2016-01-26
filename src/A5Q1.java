/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rainy
 */
public class A5Q1 {
    private Node head;
    private int numItems = 0;
    private boolean empty;
    
    public A5Q1(){
        head = null;
        empty = false;
        numItems = 0;
    }
    
    public void add(int n){
        Node node = new Node(n);
        Node temp=head;
        if(numItems==0 || node.getNum()<temp.getNum()){
            node.setNext(temp);
            temp.setPrev(node);
            head=node;
            numItems++;
        }else{
            for (int i = 0; i <= numItems; i++) {
                if(node.getNum() == temp.getNum()){
                    temp.getPrev().setNext(node);
                    node.setPrev(temp.getPrev());
                    node.setNext(temp);
                    temp.setPrev(node);
                    numItems++;
                    break;
                }else if(node.getNum() <= temp.getNum() && temp.getNext() == null){
                    temp.setNext(node);
                    node.setPrev(temp);
                    node.setNext(null);
                    numItems++;
                    break;
                }else{
                    temp=temp.getNext();
                }    
            }
        }
    }
    
    public void remove(int n){
        Node node = new Node(n);
        Node temp = head;
        if(node.getNum() == temp.getNum()){
            temp.getNext().setPrev(null);
            head=temp.getNext();
            numItems--;
        }else{
            for (int i = 0; i < numItems; i++) {
                if(node.getNum() == temp.getNum()){
                    temp.getPrev().setNext(temp.getNext());
                    temp.getNext().setPrev(temp.getPrev());
                    numItems--;
                    break;
                }else if(node.getNum() == temp.getNum() && temp.getNext() == null){
                    temp.getPrev().setNext(null);
                    numItems--;
                    break;
                }else{
                    temp = temp.getNext();
                }
                    
            }
        }
    }
    
    public int size(){
        return numItems;
    }
    
    public boolean isEmpty(){
        if(numItems==0)
            empty = true;
        else
            empty = false;
        return empty;
    }
    
    public int get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getNum();
    }
    
    public void printList(){
        Node node = head;
        while(node != null){
            System.out.println(node.getNum());
            node = node.getNext();
        }
    }    
}
