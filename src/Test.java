/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyOrderedList list = new MyOrderedList();
        list.add(7);
        list.add(10);
        list.add(12);
        list.add(4);
        list.add(6);
        list.add(11);
        list.add(20);
        list.add(11);
        list.add(9);
        
        list.printList();
        
        System.out.println("List Size: " + list.size());
        System.out.println("Empty? " + list.isEmpty());
        System.out.println("Value of Node at index 5: " + list.get(5));
        
    }
}
