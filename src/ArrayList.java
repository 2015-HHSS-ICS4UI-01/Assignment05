
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author janaj4926
 */
public class ArrayList {

    private int[] array = new int[10];
    private boolean empty = true;
    private int stuff;
    Scanner in = new Scanner(System.in);

    public ArrayList() {
        stuff = 0;
    }

    public void add(int index, int num) {
        stuff++;
        System.out.println(stuff + "@@@");
        
        while (index > stuff) {
            System.out.println("y u soi stoopid");
            System.out.println("I onwy hov " + stuff + " pleces fo u");
            System.out.println("try again: ");
            index = in.nextInt();
        }
        
        System.out.println("^^");
        
        //add a number at a spot that can be as big as there are things in the array or as small as 0
        int place = stuff;
        System.out.println(place + "####");
        System.out.println(array.length + "$$$");
        System.out.println(array[9] + "&&&");
        
        if(stuff == array.length-1){
            int[] arraw = new int[array.length*2];
            for(int i = 0; i < array.length; i++){
                arraw[i] = array[i];
            }
            array = arraw;
        }
        for (int i = stuff; i >= index; i--) {
            array[place + 1] = array[place];
            place--;
            System.out.println(i + "!!!!!");
        }
        System.out.println("$$$");
        System.out.println(array[index] + "===");
        array[index] = num;
        System.out.println("---" + array[index]);
        //if my things in the array get to 10, double the array size
        

    }

    public void remove(int index) {
        //remove the number at the index spot
    }

    public Boolean isEmpty() {
        return empty;
    }

    public int getSize() {
        return stuff;
    }

    public int getSpot(int index) {
        return array[index];
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
