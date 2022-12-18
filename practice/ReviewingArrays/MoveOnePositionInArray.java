// move array one position, the last number becomes the first one
package ReviewingArrays;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class MoveOnePositionInArray {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] numbers = new int[10];

        int lastElement;
        
        System.out.println("Please insert the numbers");

        // insert numbers into array
        for (int i = 0; i < (numbers.length); i++) {
            System.out.print("Insert number #" + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        // show the original array
        for ( int e: numbers){
            System.out.print(e + " ");
        }
        System.out.println("\n");
        
        // save the last element
        lastElement = numbers[9];
        
        // move one position
        for (int i = 8; i >= 0; i--){
            numbers[i+1] = numbers[i];
        }
        
        numbers[0] = lastElement;
        
        // shows the final array
        System.out.println("\nFinal Array");
        for (int e: numbers){
            System.out.print(e + " ");
        }
        
        
    }
}
