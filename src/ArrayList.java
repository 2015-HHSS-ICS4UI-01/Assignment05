
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
        
        //if they try to put something where they can not put something
        while (index > stuff) {
            System.out.println("try again: ");
            index = in.nextInt();
        }

        //add a number at a spot that can be as big as there are things in the array or as small as 0
        int place = stuff;
        
        //if my things in the array get to 10, double the array size
        if(stuff == array.length-1){
            int[] arraw = new int[array.length*2];
            for(int i = 0; i < array.length; i++){
                arraw[i] = array[i];
            }
            array = arraw;
        }
        
        //shuffle all the numbers down
        for (int i = stuff; i >= index; i--) {
            array[place + 1] = array[place];
            place--;
        }
        
        //put the number in the array
        array[index] = num;
    }

    public void remove(int index) {
        int place = index;
        //remove the number at the index spot
        for (int i = index; i <= stuff; i++) {
            array[place] = array[place + 1];
            place++;
        }
        //take one away from total ammount of things
        stuff--;
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
