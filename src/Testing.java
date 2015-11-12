/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           OrderedList list = new OrderedList();
           list.add(new Node(7));
           list.add(new Node(2));
           list.add(new Node(2));
           list.add(new Node(10));
           list.add(new Node(8));
           list.add(new Node(3));
           
           list.printList();
          System.out.println("");
          list.remove(2);
//          list.get(3);
//           list.isEmpty();
//           list.size();
          list.printList();
//           list.add(new Node(3));
//           
//        
//           
           
           
    
        
    }
}
