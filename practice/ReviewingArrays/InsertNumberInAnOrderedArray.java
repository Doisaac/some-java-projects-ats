package ReviewingArrays;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class InsertNumberInAnOrderedArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbers = new int[10];
        boolean increasing = true;
        int newNumber, position = 0, j = 0;
        
        // insert numbers into array
        do {
            System.out.println("Please insert the numbers in an increasing order");

            for (int i = 0; i < (numbers.length-5); i++) {
                System.out.print("Insert number #" + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }
            
            // checks the order
            for (int i = 0; i < 4; i++) {
                
                if ( numbers[i] > numbers[i+1]){
                    increasing = false;
                    System.out.println("Please insert the numbers in an increaing order");
                    break;
                }
                
            }
            
            System.out.println("");
        } while (increasing == false);

        // show the original array
        System.out.println("\nOrignal Array");
        for (int e : numbers) {
            System.out.print(e + " ");
        }
        System.out.println("\n");
        
        // ask the new number
        System.out.print("Which number do  you want to insert?: ");
        newNumber = sc.nextInt();
        
        // get the position of where the new number has to be
        while ( numbers[j] < newNumber && j < 5){
            position++;
            j++;
        }
        
        // moves the numbers to create a space
        for (int i = (numbers.length-6); i >= position; i--){
            numbers[i] = numbers[i+1];
        }
        
        // insert new number
        numbers[position] = newNumber;
        
        // shows final array
        System.out.println("\nThe final array is");
        for (int e: numbers){
            System.out.print(e + " ");
        }
    }
}
