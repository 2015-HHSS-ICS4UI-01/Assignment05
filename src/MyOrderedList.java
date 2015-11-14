/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alimu
 */
public class MyOrderedList {

    private Node head;
    private int numItems = 0;

    public MyOrderedList() {
        head = null;
        numItems = 0;
    }

    public void add(Node n) {
        //create a boolean 
        boolean swap = false;
        //if there are no items in the list, insert the first number in the first spot
        if (numItems == 0) {
            n.setNext(head);
            head = n;
            n.setPrev(null);
            //increse the amount of items in the list
            numItems++;

        } else {
            //declare current as head
            Node current = head;
            //if there is something and if nothing has been swapped
            while (current != null && swap == false) {
                //if the number is less than the number in the current spot
                if (n.getNum() < current.getNum()) {
                    n.setNext(current);
                    head = n;
                    current.setPrev(n);
                    numItems++;
                    swap = true;
                    //if there is nothing after the current node and the number is greater than the node in that position
                } else if (n.getNum() > current.getNum() && !current.hasNext() && swap == false) {
                    //add number
                    current.setNext(n);
                    n.setPrev(current);
                    //increase amount of items in the list
                    numItems++;
                    swap = true;
                    //iif there is something after the current node, and its greater than the number
                } else if (current.hasNext() && n.getNum() < current.getNext().getNum() && swap == false) {
                    //swap
                    n.setNext(current.getNext());
                    current.setNext(n);
                    n.setPrev(current);
                    current.getNext().setPrev(n);
                    //increase amount of items in the list
                    numItems++;
                    swap = true;
                } else {
                    //the current node is the next number
                    current = current.getNext();
                }
            }
        }
    }

    public void remove(int num) {
        Node current = head;
        int counter = 0;

        //if the current node doesnt equal the number and the counter is less than the amount of items in the list
        while (counter < numItems && current.getNum() != num) {
            //the current node is the next number
            current = current.getNext();
            counter++;
        }
        if (current.getNum() != num) {
            //do nothing
        } else if (counter == 0) {
            //if the counter is zero
            head = current.getNext();
            current.setNext(null);
            numItems--;
        } else if (counter >= numItems) {
            //at the end of the list
            current.getPrev().setNext(null);
            current.setPrev(null);
            numItems--;
        } else {
            //move everything down
            current.getNext().setPrev(current.getPrev());
            current.getPrev().setNext(current.getNext());
            numItems--;
        }
    }

    public void get(int index) {
        Node n = head;
        //go through and get the numbers
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        System.out.println(n.getNum());
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }

    public void size() {
        System.out.println("You have " + numItems + " in the list");
    }
}
