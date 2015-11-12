/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caius
 */
public class CharNode {

    private char character;
    private CharNode next;

    public CharNode(char character) {
        this.character = character;
        next = null;
    }

    /**
     * Get the node that is next in line
     *
     * @return the next node
     */
    public CharNode getNext() {
        return this.next;
    }

    /**
     * Sets the node this is pointing to
     *
     * @param n the new node to point to
     */
    public void setNext(CharNode n) {
        this.next = n;
    }

    /**
     * Return the number the node stores
     *
     * @return the integer the node is storing
     */
    public char getChar() {
        return this.character;
    }
}
