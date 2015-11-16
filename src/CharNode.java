/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alimu
 */
public class CharNode {

    private char num;
    private CharNode next;
    private CharNode prev;

    public CharNode(char n) {
        next = null;
        prev = null;
        this.num = n;
    }

    public void setNext(CharNode n) {
        this.next = n;
    }

    public void setPrev(CharNode n) {
        this.prev = n;
    }

    /**
     *
     * @return the number
     */
    public char getNum() {
        return this.num;
    }

    /**
     *
     * @return the next node
     */
    public CharNode getNext() {
        return this.next;
    }

    /**
     *
     * @return the previous node
     */
    public CharNode getPrev() {
        return this.prev;
    }

    public boolean hasNext() {
        return next != null;
    }

}
