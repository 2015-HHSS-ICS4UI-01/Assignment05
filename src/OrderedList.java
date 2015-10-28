/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class OrderedList {
    
    private Node head;
    private int length;
    
    public OrderedList()
    {
        head = null;
        length = 0;
    }
    
    public void add(int num)
    {
        Node newNode = new Node(num);
        if (!isEmpty())
        {
            if (head.getValue() > num)
            {
                newNode.setChildNode(head);
                head = newNode;
            }
            else
            {
                Node curNode = head;
                for (int i = 0; i < length-1 && curNode.getChildNode().getValue() < num; i ++)
                {
                    curNode = curNode.getChildNode();
                }
                newNode.setChildNode(curNode.getChildNode());
                curNode.setChildNode(newNode);
            }
        }
        else
        {
            head = newNode;
            newNode.setChildNode(null);
        }
        length ++;
    }
    
    public boolean isEmpty()
    {
        return length == 0;
    }
    
    public void print()
    {
        Node curNode = head;
        for (int i = 0; i < length; i ++)
        {
            System.out.println(curNode.getValue());
            curNode = curNode.getChildNode();
        }
    }
    
}
