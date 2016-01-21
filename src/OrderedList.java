/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class OrderedList {

    private Node head;
    private int numItems;

    public OrderedList() {
        head = null;
        numItems = 0;
    }

    public void Add(int num) {
        Node n = new Node(num);
        Node current = head;
        if (numItems == 0 || n.getNum() < head.getNum()) {
            head = n;
            head.setPrev(null);
            head.setNext(current);
            if (current != null) {
                current.setPrev(head);
            }
            

        } else {

            for (int i = 0; i < numItems; i++) {
                if (current.getNum() > n.getNum()) {
                    n.setNext(current);
                    n.setPrev(current.getPrev());
                    current.getPrev().setNext(n);
                    current.setPrev(n);
                    break;
                }else if(current.getNext() == null){
                    
                    current.setNext(n);
                    n.setPrev(current);
                    n.setNext(null);
                    break;
                }else{
                    current = current.getNext();
                }

            }
        }


        numItems++;
    }

    public void Remove(int num) {
        Node current = head;
        
        if(num == head.getNum()){
            head = head.getNext();
            head.setPrev(null);
        }else{
        for(int i = 0; i < numItems -1; i++){
          if(num == current.getNum()){
                current.getPrev().setNext(current.getNext());
                if(current.getNext()!= null){
                current.getNext().setPrev(current.getPrev());
                }
            }
            current = current.getNext();
        }   
    }
      numItems--;  
  }
    public int size() {
        return numItems;
    }

    public void isEmpty() {
        if (numItems == 0) {
            head = null;
        }
    }

    public int get(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n.getNext();
        }
        return n.getNum();
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
}