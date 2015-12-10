
/**
 *
 * @author rayan4858
 */
public class Stack {

    private wordNode head;
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

    public void push(wordNode n) {
        //whatevers after n is now n
        n.setNext(head);
        head = n;
        //increase amount of numbers in the list
        numItems++;
    }

    public char pop() {
        //n is the head
        wordNode n = head;
        //the head is whatevers after n
        head = head.getNext();
        //whatevers before the head is nothing
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

}
