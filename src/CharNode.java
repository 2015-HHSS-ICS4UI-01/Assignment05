/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A stack node containing a character value and a reference to its child node
 * @author kobed6328
 */
public class CharNode {
    
    // the character value
    private char value;
    // the child node
    private CharNode childNode;
    
    /**
     * Creates a CharNode with a character value but no set child node
     * @param value 
     */
    public CharNode(char value)
    {
        this.value = value;
        childNode = null;
    }
    
    /**
     * Replace the current child node with a new one
     * @param c a CharNode which is the new child node
     */
    public void setChildNode(CharNode c)
    {
        childNode = c;
    }
    
    /**
     * Returns the current child node
     * @return a CharNode object which is the current child node
     */
    public CharNode getChildNode()
    {
        return childNode;
    }
    
    /**
     * Returns the current values
     * @return a char which is the current value
     */
    public char getValue()
    {
        return value;
    }
    
}
