/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yaol9270
 */
public class Testing {
    
    public static void main(String[] args){
        ResizableArray list = new ResizableArray();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);
        list.add(5,5);
        list.add(6,5);
        list.add(7,5);
        list.add(8,5);
        list.add(9,5);
        list.add(10,7);
        list.add(2,99);
        list.remove(3);


        
        
        list.printList();
        System.out.println("");

        list.printList();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.get(3));
    }
}
