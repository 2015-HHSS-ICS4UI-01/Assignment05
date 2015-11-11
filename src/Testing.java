/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A5Q2 list = new A5Q2();
        
        list.add(0,8);
        list.add(0,4);
        list.add(1,10);
        list.add(2,2);
        list.add(9,1);
        list.add(4,5);
        list.add(3,7);
        list.add(5,3); 
        list.add(5,2);
        list.add(0,9);
        list.add(2,0);
        list.add(4,13);
        
        list.remove(3);
        
        
        list.printList();
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
        
    }
}
