/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alimu
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //OrderedList
        MyOrderedList list = new MyOrderedList();
        list.add(new Node(4));
        list.add(new Node(10));
        list.add(new Node(5));
        list.add(new Node(2));
        list.printList();
        System.out.println("");
        list.remove(4);
        list.printList();
        System.out.println("");
//        
        //ArrayList
//        ArrayList list = new ArrayList();
//        list.add(3,0);
//        list.add(2,1);
//        list.add(1,2);
//        list.add(7,3);
//        list.add(9,4);
//        list.remove(2);
//        list.printList();
//        System.out.println("");
        
        //stack
//        Stack stack = new Stack();
//        stack.push(new CharNode('a'));
//        stack.push(new CharNode('l'));
//        stack.push(new CharNode('i'));
//        stack.push(new CharNode('$'));
//        stack.push(new CharNode('i'));
//        stack.push(new CharNode('l'));
//        stack.push(new CharNode('a'));
//        System.out.println(stack.reverse(stack));
    }

}
