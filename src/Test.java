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
        //tests the Ordered List
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
        
        // list.printList();

        // System.out.println("List Size: " + list.size());
        // System.out.println("Empty? " + list.isEmpty());
        // System.out.println("Value of Node at index 3: " + list.get(3));
         
        //tests the Array List
        
        MyArrayList list2 = new MyArrayList();
        
        list2.add(0,2);
        list2.add(0,1);
        list2.add(0,6);
        list2.add(0,56);
        list2.add(0,33);
        list2.add(0,23);
        list2.add(0,12);
        list2.add(0,75);
        list2.add(0,54);
        list2.add(0,123);
        list2.add(0,14);
        list2.remove(3);
        
        list2.printList();
        
        System.out.println("List Size: " + list2.size());
        System.out.println("Empty? " + list.isEmpty());
        System.out.println("Value of number at index 3: " + list2.get(3));
        
        //tests the String stack
        
        
    }
}
