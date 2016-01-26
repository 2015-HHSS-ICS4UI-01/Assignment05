/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author kampn2687
 */
public class OrderedList {

    private Node head;
    private int numItems = 0;

    public OrderedList() {
        head = null;
        numItems = 0;
    }

    /**
     *
     * @param num
     */
    public void add(int num) {
        Node node = new Node(num);
        int place = 1;
        if (numItems == 0 || node.getNum() < head.getNum()) {
            node.setNext(head);
            head = node;
        } else {
            Node next = head.getNext();
            Node prev = head;
            for (int i = 0; i < numItems; i++) {
                if (next == null || num <= next.getNum() && num >= prev.getNum()) {
                    break;
                }
                prev = prev.getNext();
                next = next.getNext();
                place++;
            }
            if (place == numItems) {
                prev.setNext(node);
                node.setPrev(prev);
            } else {
                node.setNext(next);
                next.setPrev(node);
                prev.setNext(node);
                node.setPrev(prev);
            }
        }
        numItems++;
    }
    public void remove(int num){
        Node remo = head;
        int place = 0;
        for (int i = 0; i < numItems; i++) {
            if (num == remo.getNum()) {
                break;
            }
            place++;
            remo = remo.getNext();
        }
        if(place != numItems){
            if(numItems == 1){
                head = null;
            }else if(place == 0){
                head = head.getNext();
            }else if( place ==numItems - 1){
                remo = head; 
                for( int i = 0; i < place -1; i++){
                    remo = remo.getNext();
                }
                remo.setNext(null);
            }else{
                remo = head;
                for(int i = 0; i < place -1; i++ ){
                    remo = remo.getNext();
                }
                remo.setNext(remo.getNext().getNext());
            }
         numItems --;   
        }
        
    }
    

    public int Size() {
        return numItems;


    }

    public boolean IsEmpty() {


        if (numItems > 0) {
            return false;
        }
        return true;

    }

    public int get(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n.getNum();
    }

    public void printList() {
        Node item = head;
        while (item != null) {
            System.out.println(item.getNum());
            item = item.getNext();
        }
    }
}
