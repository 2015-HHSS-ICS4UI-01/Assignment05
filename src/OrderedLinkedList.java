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

    public void add(Node num) {
        //if there is nothing in the list
        if (items == 0) {
            num.setNext(first);
            num.setPrev(first);
            first = num;
            items++;
        } else {


            //if the list has stuff in it
            //
            
            //if the num is less than or equal to the first put the num at the front
            Node place = first;
            if (num.getNum() < first.getNum() || num.getNum() == first.getNum()) {
                num.setNext(first);
                first.setNext(place.getNext());
                first.setPrev(num);
                first = num;
                items++;
                
            } else {
                
                //sorting out the middle
                //
                
                boolean inserted = false;
                Node current = first;
                while (!inserted) {
                    
                    //if the very first number in the list is less than the number and there are only two numbers in the list 
                    if(first.getNum() < num.getNum() && items == 1){
                        num.setPrev(current);
                        num.setNext(null);
                        first.setNext(num);
                        items++;
                        inserted = true;
                    }else
                    
                    //if the next number in the list is bigger than my current number
                    if (current.getNext().getNum() > num.getNum() || current.getNext().getNum() == num.getNum()) {
                        num.setNext(current.getNext());
                        num.setPrev(current);
                        current.setNext(num);
                        items++;
                        inserted = true;
                        
                    } else 
                        
                    //continue if the the next number in the list is smaller than  my number
                    if (current.getNext().getNum() < num.getNum()) {
                        //if at the second last spot
                        if (current.getNext() == null) {
                            current.setPrev(current.getNext());
                            current.setNext(null);
                            items++;
                            inserted = true;
                            
                        } else {
                            current = current.getNext();
                            
                        }

                    }//if at the end
                    if (current.getNext() == null) {
                        num.setNext(null);
                        num.setPrev(current.getPrev());
                        current.setNext(num);
                        items++;
                        inserted = true;
                    }
                }
            }
        }
    }

    public void remove(int num) {
        Node spot = first;
        //searching for the thing to remove
        for(int i = 0; i < items; i++){
            if(num == spot.getNum()){
                if(spot.getPrev() == null){
                    spot.setNext(null);
                    break;
                }else if(spot.getNext() == null){
                    spot.setPrev(null);
                    break;
                }else
                spot.getPrev().setNext(spot.getNext());
                spot.getNext().setPrev(spot.getPrev());
                spot.setNext(null);
                spot.setPrev(null);
                break;
            }
            spot = spot.getNext();
        }
        
        //take away one from total things
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
            System.out.print(n.getNum() + ", ");
            n = n.getNext();
        }
    }
}
