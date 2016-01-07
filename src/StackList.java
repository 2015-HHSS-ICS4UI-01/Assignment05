/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Walter
 */
public class StackList {

    private int numItems;
    private StringNode head;

    public StackList() {
        numItems = 0;
        head = null;
    }

    public void push(StringNode n) {
        if (numItems == 0) {
            n.setNext(head);
            head = n;
            n.setPrev(null);
            numItems++;
        } else {
            n.setNext(head);
            head.setPrev(n);
            head = n;
            n.setPrev(null);
            numItems++;
        }
    }

    public char pop() {
        StringNode n = head;
        head = n.getNext();
        head.setPrev(null);
        numItems--;
        return n.getNum();
    }

    public void print() {
        StringNode n = head;
        for (int i = 0; i < numItems; i++) {
            System.out.println(n.getNum());
            n = n.getNext();
        }

    }

    public char peek() {
        return head.getNum();
    }

    public int size() {
        return numItems;
    }

    /**
     *
     * @param n is the stack list being analyzed
     * @return if the list is of the form w$w
     */
    public boolean isTrue(StackList n) {
        String p = "";
        //if the size of the list is an even number
        if (n.size() % 2 != 0) {
            //while the item being searched for hasnt reached $
            while (this.peek() != '$') {
                p = this.pop() + p;
                //move on to the next one
            }
            this.pop();

            if (p.length() != numItems) {
                System.out.println("This string is not of the type w$w");
                return false;
            } else {
                int num = numItems;
                int temp = 0;
                for (int i = 0; i < num; i++) {

                    if (p.charAt(i) == this.peek()) {

                        if (numItems > 1) {
                            this.pop();
                        }

                        temp++;
                    }
                }
                //if it is of the form w$w
                if (temp == num) {
                    System.out.println("This string is of the type w$w");
                    return true;
                } else {
                    System.out.println("This string is not of the type w$w");
                    return false;
                }

            }

        } else {
            System.out.println("This string is not of the type w$w");
            return false;
        }

    }
}
