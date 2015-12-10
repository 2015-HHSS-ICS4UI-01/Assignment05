/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rayan4858
 */
public class OrderedList {

    private int itemNum;
    private Node head;

    /**
     * Creates an empty ordered list
     */
    public OrderedList() {
        head = null;
        itemNum = 0;
    }

    public void add(Node n) {
        boolean swap = false;

        if (itemNum == 0) {
            head = n;
            head.setNext(null);
            head.setPrev(null);
            itemNum++;
        } else {
            Node counter = head;

            while (counter != null && swap == false) {
                if (n.getNum() < counter.getNum()) {
                    n.setNext(counter);
                    head = n;
                    counter.setPrev(head);
                    swap = true;
                }
//                else if (n.getNum() > counter.getNum()) {
//                    n.setNext(counter.getNext());
//                    n.getNext().setPrev(n);
//                    
//                }
                
                counter = counter.getNext();
            }

//            for (int i = 0; i < itemNum + 1; i++) {
//                Node counter = head;
//
//                if (n.getNum() < counter.getNum()) {
//                    n.setNext(counter);
//                    head = n;
//                    counter.setPrev(head);
//                    head.setPrev(null);
//                    itemNum++;
//                } else if (counter.getNext() == null) {
//                    counter.setNext(n);
//                    n.setPrev(counter);
//                    n.setNext(null);
//                }else{
//                    counter = counter.getNext();     
//                }
//            }
        }
    }

    public void remove(Node n, int x) {

    }

    public int size() {
        return itemNum;
    }

    public void isEmpty() {
        if (itemNum == 0) {

        }
    }

    public void getInt(int x) {
        int counter = 0;
        Node n = head;
        if (itemNum == 1) {
            System.out.println(n.getNum());
        } else {
            do {
                n = n.getNext();
                counter++;
            } while (counter != x);
            System.out.println(n.getNum());
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }

}
