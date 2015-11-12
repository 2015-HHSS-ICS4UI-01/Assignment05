/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A stack of CharNodes
 * @author kobed6328
 */
public class ADTStack {
    
    // the last added element
    private CharNode head;
    // stack starts out with no elements
    private int length;
    
    /**
     * Creates a stack with length 0
     */
    public ADTStack()
    {
        // set the head to null, but since length is 0, this is inaccessible
        head = null;
        length = 0;
    }
    
    /**
     * Adds a CharNode object to top of the stack
     * @param c the CharNode to be added
     */
    public void add(CharNode c)
    {
        // sets child of the CharNode as the head object, and sets the head as this new charnode
        c.setChildNode(head);
        head = c;
        // increase the length because a new item has been added
        length ++;
    }
    
    /**
     * Returns and removes the last added element of the stack
     * @return head, if length is greater than 0; otherwise, return null
     */
    public CharNode pop()
    {
        if (!isEmpty())
        {
            CharNode poppedNode = head;
            // set the new head as the childNode of the previous head
            head = head.getChildNode();
            // decrease the length since an element was removed
            length --;
            return poppedNode;
        }
        return null;
    }
    
    /**
     * Return whether or not the stack has no added elements
     * @return true if the length is 0; otherwise, return false
     */
    public boolean isEmpty() 
    {
        return length == 0;
    }
            
}
