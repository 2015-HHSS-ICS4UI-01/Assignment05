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
        list2.add(1,1);
        list2.add(2,6);
        list2.add(3,56);
        list2.add(0,33);
//        list2.add(4,23);
//        list2.add(5,89);
//        list2.add(6,12);
//        list2.add(7,10);
//        list2.add(8,12);
//        list2.add(9,60); 
        //list2.add(10,12);
        list2.printList();
        
    }
}
