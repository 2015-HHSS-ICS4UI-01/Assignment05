/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alimu
 */
public class Stack {

    private CharNode head;
    private int numItems;

    public Stack() {
        head = null;
        numItems = 0;
    }

    /**
     *
     * @return the head
     */
    public char peek() {
        return head.getNum();
    }

    public void push(CharNode n) {
        //whatevers after n is now n
        n.setNext(head);
        head = n;
        //increase amount of numbers in the list
        numItems++;
    }

    public char pop() {
        //n is the head
        CharNode n = head;
        //the head is whatevers after n
        head = n.getNext();
        //whatevers before the head is nothing
        head.setPrev(null);
        //remove an item from the list
        numItems--;
        return n.getNum();
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public boolean reverse(Stack n) {
        String reverse = "";

        //if theres something in the stack
        if (n.size() % 2 != 0) {
            //loop through until it reaches $
            while (this.peek() != '$') {
                //get the chars back in reverse
                reverse = this.pop() + reverse;
            }
            this.pop();

            //if the amount of numbers reversed is not equal to the amount of numbers in the stack
            if (reverse.length() != numItems) {
                return false;
            } else {
                //declare a temp variable to later know how many numbers in a stack
                int num = numItems;
                int temp = 0;
                //go through the amount of numbers
                for (int i = 0; i < num; i++) {
                    //ifthe reverse is equal to the normal one
                    if (reverse.charAt(i) == this.peek()) {
                        if (numItems > 1) {
                            this.pop();
                        }
                        temp++;
                    }
                }
                //if there are the same amount of chars
                if (temp == num) {
                    //the string is of language w$w
                    return true;
                } else {
                    //the string is not of language w$w
                    return false;
                }
            }
        } else {
            //the string is not of language w$w
            return false;
        }

    }

}
