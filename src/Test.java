/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderedList list = new OrderedList();
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(10);
        list.add(23);
        list.printList();
        System.out.println("");
        
        list.remove(5); 
        list.printList();

    }
}

    

