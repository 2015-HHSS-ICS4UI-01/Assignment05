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
        ADTListResizable list = new ADTListResizable();
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(3, 4);
        list.add(4, 5);
        list.add(5, 6);
        list.add(6, 7);
        list.add(7, 8);
        list.add(8, 9);
        list.add(9, 10);
        list.add(10, 11);
        list.add(11, 1);
        list.add(12, 2);
        list.add(13, 3);
        list.add(14, 4);
        list.add(15, 5);
        list.add(16, 6);
        list.add(17, 7);
        list.add(18, 8);
        list.add(19, 9);
        list.add(20, 10);
        list.printList();
        
        System.out.println("");
        System.out.println(list.get(20));
        
        

    }
}

    

