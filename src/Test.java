/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OrderedList list = new OrderedList();
        list.add(new Node(10));
        list.add(new Node(100));
        list.add(new Node(50));
        list.add(new Node(70));
        list.add(new Node(60));
        list.add(new Node(700));
        list.add(new Node(20));
        list.add(new Node(1));  
        list.printList();
        System.out.println("");
        list.remove(1);
        System.out.println("");
        list.printList();
        
        //arraylist
        

    }
    
}
