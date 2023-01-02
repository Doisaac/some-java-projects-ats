// input an array, then it displays if it is in increasing or decreasing order

package ReviewingArrays;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class IncreasingOrdecreasing {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int[] numbers = new int[6];
        
        System.out.println("Please insert the numbers");
        
        // insert numbers into array
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Insert number #" + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        // check the array order
        boolean increasing = false;
        boolean decreasing = false;
        
        for(int i = 0; i < (numbers.length-1); i++){
            
            if ( numbers[i] < numbers[i+1]){
                increasing = true;
            } 
            else if ( numbers[i] > numbers[i+1]){
                decreasing = true;
            }
            
        }
        
        System.out.println("\n");
        if (increasing == true && decreasing == false){
            System.out.println("Your List is increasing");
        }
        else if( increasing == false && decreasing == true){
            System.out.println("Your List is decreasing");
        }
        else if ( increasing == true && decreasing == true){
            System.out.println("Your List is not ordered");
        }
        else if ( increasing == false && decreasing == false){
            System.out.println("All the numbers are the same");
        }
        
    }
}
