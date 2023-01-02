package ReviewingArrays;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class DeleteOneElementInArray {
    
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int positionToBeDeleted;
        
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
        
        do{
            System.out.print("Insert the position of the element to be deleted {0-9}: ");
            positionToBeDeleted = sc.nextInt();
        } while (positionToBeDeleted < 0 || positionToBeDeleted > 9 );
        
        for (int i = positionToBeDeleted; i < (numbers.length-1); i++){
            numbers[i] = numbers[i+1];
        }
        
        // show final array
        System.out.println("\nFinal Array");
        for (int i = 0; i < 9; i++) {
            System.out.print(numbers[i] + " ");
        }
        
    }
}
