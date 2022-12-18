// insert 8 numbers into the array, then select a position and it will show you the new array
package ReviewingArrays;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class InsertNumberIntoAPosition {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbers = new int[10];

        int newNumberToBeInserted, positionSelected;
        
        System.out.println("Please insert the numbers");

        // insert numbers into array
        for (int i = 0; i < (numbers.length-2); i++) {
            System.out.print("Insert number #" + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        // show the original array
        for ( int e: numbers){
            System.out.print(e + " ");
        }
        System.out.println("\n");

        // asks for the new number
        System.out.print("Please insert new number to be insert: ");
        newNumberToBeInserted = sc.nextInt();
        
        System.out.print("Please insert its position {0-9}: ");
        positionSelected = sc.nextInt();
        
        // creating a space for the new number
        for ( int i = (numbers.length-3); i >= positionSelected; i--){
            numbers[i+1] = numbers[i]; 
        }
        
        // set the new value
        numbers[positionSelected] = newNumberToBeInserted;
        
        // show the final array
        System.out.println("\nFinal Array");
        for ( int e: numbers){
            System.out.print(e + " ");
        }
    }

}
