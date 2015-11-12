/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Node {
    private final int value;
    private Node childNode;
    
    public Node(int value)
    {
        this.value = value;
    }
    
    public void setChildNode(Node node)
    {
        this.childNode = node;
    }
    public Node getChildNode()
    {
        return childNode;
    }
    public int getValue()
    {
        return value;
    }
}
