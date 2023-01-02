package ReviewingArrays;

import java.util.Scanner;


/**
 *
 * @author MrDoisaac
 */
public class MoveNNumbersInArray {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] numbers = new int[10];

        int numToMov, lastElement;
        
        System.out.println("Please insert the numbers");

        // insert numbers into array
        for (int i = 0; i < (numbers.length); i++) {
            System.out.print("Insert number #" + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        // show the original array
        System.out.println("\nOrignal Array");
        for ( int e: numbers){
            System.out.print(e + " ");
        }
        System.out.println("\n");
        
        // ask for the number of spaces to move
        System.out.println("How many positions do you want to displace?");
        numToMov = sc.nextInt();
        
        //move that number of times
        
        for(int i = 0; i < numToMov; i++){
            lastElement = numbers[9];
            
            for (int j = 8; j >= 0; j--){
                numbers[j+1] = numbers[j];
            }
            
            numbers[0] = lastElement;
        }
        
        //shows final string
        System.out.println("\nFinal Array");
        for (int e: numbers){
            System.out.print(e + " ");
        }
    }
}
