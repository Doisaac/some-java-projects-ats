package ReviewingArrays;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */

public class SearchElementInArray {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] numbers = new int[10];
        
        boolean increasing = true;

        do {
            // fills  the array numbers1
            System.out.println("Please fill the list in an increasing order");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number #" + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }   

            //checks if it is increasing
            for (int i = 0; i < (numbers.length - 1); i++) {
                if (numbers[i] > numbers[i + 1]) {
                    increasing = false;
                    break;
                }
                else {
                    increasing = true;
                }
            }
            System.out.println("");
        } while (increasing == false);
        
        // asks for the number to be found
        System.out.print("Enter the number you want to search in the list: ");
        int numToBeFound = sc.nextInt();
        
        // search
        int i = 0;
        while( i < numbers.length && numbers[i] < numToBeFound){
            i++;
        }
        
        if (i == 10){
            System.out.println("The number is not in the list");
        }
        else if ( numbers[i] == numToBeFound){
            System.out.println("The number is in the position #" + i);
        }
        else {
            System.out.println("The number is not in the list");
        }
        
        
       
    }
}
