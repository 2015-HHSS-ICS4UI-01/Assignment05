/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ADTList list = new ADTList();
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(1, 4);
        list.remove(0);
        list.printList();
    }
}
