/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kampn2687
 */
public class Testing {

    public static void main(String[] args) throws IOException {
//        OrderedList list = new OrderedList();
//        list.add(5);
//        list.add(0);
//        list.add(-1);
//        list.add(8);
//       list.remove(8);
//       list.remove(5);
        
//        list.printList();
//        MyArray testL = new MyArray();
//        testL.add(0,8);
//        testL.add(1,9);
//        testL.add(2,3);
//        testL.remove(1);
//
//        System.out.println(testL.get(0));
//        System.out.println(testL.get(1));
//        System.out.println(testL.get(2));
        StringStack thing = new StringStack();
         Scanner in = new Scanner(System.in);
         boolean isPal;
           char[] check;
          check = new char[100];
         int midpoint;
         String testWord;
         while(in.nextLine() != "exit"){ 
        for(int i = 0; i <100; i ++ ){
            thing.push((char) System.in.read());
            if(in.nextLine() == "$" ){
                midpoint = i ;
            }
            if(thing.size() == (thing.size())/2 -1){
                isPal = true;
            }else{
                isPal = false;
            }
        }
         }
         
        
        
        
        
        
        
        

    }
}
