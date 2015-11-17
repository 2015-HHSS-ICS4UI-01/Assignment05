/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaj4926
 */
public class A5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        list.add(0, 1);
        
        list.add(1, 2);
        
        list.add(2, 3);
        
        list.add(3, 4);
        
        list.add(4, 5);
        
        list.add(5, 6);
        
        list.add(4, 7);
        
        list.add(3, 8);
        
        list.add(2, 9);
        
        list.add(1, 10);
        list.printArray();
        
        list.remove(0);
        list.printArray();
    }
}
