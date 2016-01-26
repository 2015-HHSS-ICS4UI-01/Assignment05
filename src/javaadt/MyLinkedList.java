/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author kampn2687
 */
class MyLinkedList {
      private Node head;
    private int numItems = 0;

    public MyLinkedList() {
        head = null;
        numItems = 0;
    }

    /**
     *
     * @param num
     */
    public void add(int num) {
        Node node = new Node(numItems);
        int place =0;
        if (numItems == 0) {
            node.setNext(head);
            head = node;
            numItems++;
        } else {
            Node current = head;

            for (int i = 0; i < numItems - 1; i++) {
                Node nodeCheck = new Node(i);
                if (num < nodeCheck.getNum()) {    
                    break;
                }
                place++;
            }
            if(place == numItems){
                current.setNext(node);
                node.setPrev(current);
            }else if(place == 0){
                current.setPrev(node);
                node.setNext(current);
            }else{
            for (int i = 0; i < place; i++) {
                current = current.getNext();

                }
                node.setNext(current);
                node.setPrev(current.getPrev());
                current.getPrev().setNext(node);
                current.setPrev(node);
                

                //we've added a number
                numItems++;

            }
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

    public int getInt(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n.getNum();
    }
     public void printList(){
        Node n = head;
        while(n != null){
            System.out.println(n.getNum());
            n = n.getNext();
    }
    }
}
