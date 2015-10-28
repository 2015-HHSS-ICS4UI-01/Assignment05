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
    
    /**
     * Creates the orderedlist with a null head and length of 0
     */
    public OrderedList()
    {
        head = null;
        length = 0;
    }
    
    /**
     * Adds an integer to the list
     * @param num the integer to be added
     */
    public void add(int num)
    {
        // create a node with the integer value
        Node newNode = new Node(num);
        // There are two distinct cases: the list is empty and an integer is added, or the list is not empty and an integer is added
        // if the list is not empty, several checks need to be made
        if (!isEmpty())
        {
            // If the number to be added is less than the first item in the list, then set it as the head
            if (num < head.getValue())
            {
                newNode.setChildNode(head);
                head = newNode;
            }
            // otherwise, iterate through the list until the right index is found
            else
            {
                Node curNode = head;
                // loop until the last valid node is reached (length-1) since the actual last element is null
                    // and loop until the next node is not smaller than the number
                        // If this condition is met, curNode will be the node right before the node we want to insert (newNode)
                for (int i = 0; i < length-1 && curNode.getChildNode().getValue() < num; i ++)
                {
                    curNode = curNode.getChildNode();
                }
                // set the new node's child node as the child node of the element directly before it in the list
                newNode.setChildNode(curNode.getChildNode());
                // insert newNode right after the element directly before it int he list
                curNode.setChildNode(newNode);
            }
        }
        // If the list is empty, then the head can simply be replaced by the node, regardless of value
        else
        {
            head = newNode;
            // The node is now the first AND last element of the list
            newNode.setChildNode(null);
        }
        // Increase the length since one node has been added to the list
        length ++;
    }
    
    /**
     * Removes an integer from the list
     * @param num the integer to be removed
     */
    public void remove(int num)
    {
        // while the number to be removed is the head, make the next element the head and decrease the length by one
        while (head != null && head.getValue() == num)
        {
            head = head.getChildNode();
            length --;
        }
        
        Node curNode = head;
        // we want to iterate through the initial length of the list, even when it's changed, so this is the length which will be modified
        int tempLength = length;
        // loop until the last valid node is reached (length-1) since the actual last element is null
        for (int i = 0; i < length-1; i ++)
        {
            // the children of the removed node must be appended to the previous node, but we can only know if a node is to be removed when it is the curNode. However, since the head has already been checked, we can start with it but check the next node in the list
            Node nextNode = curNode.getChildNode();
            // if the next node doesn't match the number to be removed, advance the current node
            if (nextNode.getValue() != num)
            {
                curNode = curNode.getChildNode();
            }
            // otherwise, maintain the current node, and remove the next node
            else
            {
                // set the current node's children to the next node's children (thereby removing the nextNode)
                curNode.setChildNode(nextNode.getChildNode());
                // decrease the tempLength instead of the length variable, since decreasing the length variable will prematurely exit the loop, as we want to maintain the current node
                tempLength --;
            }
        }
        // update the length to the length that was shortened
        length = tempLength;
    }
    
    /**
     * Returns the length of the list
     * @return the length of the list
     */
    public int size()
    {
        return length;
    }
    
    /**
     * Returns whether or not the list is empty
     * @return true if the list is empty; otherwise, return false
     */
    public boolean isEmpty()
    {
        return length == 0;
    }
    
}
