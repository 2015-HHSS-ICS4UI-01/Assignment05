/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ADTList list = new ADTList();
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(2,0);
        list.print();
        
    }
}
