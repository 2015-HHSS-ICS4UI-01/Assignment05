/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author branc2347
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderedList list = new OrderedList();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(22);
        list.add(123);
        list.add(1);
        list.printList();
        list.remove(2);
        list.remove(122);
        list.remove(1);
        System.out.println("----");
        list.printList();
    }
}
