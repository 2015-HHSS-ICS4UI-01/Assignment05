/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author janaj4926
 */
public class OrderedLinkedList {

    private Node first;
    private int items;

    public OrderedLinkedList() {
        first = null;
        items = 0;
    }
    boolean empty = true;
    private Node place;

    public void add(Node num) {
        //if there is nothing in the list
        if (items == 0) {
            num.setNext(first);
            first = num;
            items++;

            //if the list has stuff in it
            //
            //if the num is less than or equal to the first put the num at the front
        } else if (num.getNum() < first.getNum() || num.getNum() == first.getNum()) {
            num.setNext(first);
            first = num;
            items++;

            //sorting out the middle
        } else {
            Node current = first;
            for (int i = 0; i < items; i++) {
                //continue if the the next number in the list is smaller than  my number
                if (current.getNext().getNum() < current.getNum() || current.getNext() == null) {
                    if (current.getNext() == null) {
                        current.setPrev(current.getNext());
                        current.setNext(null);
                        items++;
                    } else {
                        current.setNext(current.getNext().getNext());
                        current.setPrev(current.getNext());
                    }

                    //if the next number in the list is bigger than my current number
                } else if (current.getNext().getNum() > current.getNum() || current.getNext().getNum() == current.getNum()) {
                    num.setNext(current.getNext());
                    num.setPrev(current.getPrev());
                    items++;

                    //if at the end
                } else if (current.getNext() == null) {
                    num.setNext(null);
                    num.setPrev(current.getPrev());
                    items++;
                }
            }
        }
    }

    public void remove(int num) {


        items--;
    }

    public int getSize() {
        return items;
    }

    public Boolean isEmpty() {
        if (items == 0) {
            empty = true;
        } else {
            empty = false;
        }
        return empty;
    }

    public void printList() {
        Node n = first;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
}
