/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author isles3536
 */
public class JavaADTs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderedList list = new OrderedList();
        ResizableArray list1 = new ResizableArray();
//        list.Add(7);
//        list.Add(9);
//        list.Add(5);
//        list.Add(2);
//        list.Add(4);
//        list.Add(15);
//        list.Add(8);
//        list.Add(8);
//        
//        
//        list.printList();
//        System.out.println("");
//        list.Remove(8);
//        list.Remove(15);
//        list.printList();
        
        
        list1.Add(0, 3);
        list1.Add(1, 5);
        list1.Add(2, 4);
        list1.Remove(2);
        
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        
        
    }
}
