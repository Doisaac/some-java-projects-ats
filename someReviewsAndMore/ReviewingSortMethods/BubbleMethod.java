package ReviewingSortMethods;

import java.util.Scanner;
// 13.75
/**
 *
 * @author MrDoisaac
 */

public class BubbleMethod {
    
    // Scanner
    static Scanner sc = new Scanner(System.in);
    
    // main method
    public static void main(String[] args) {
        
        int[] numbers = createArray();
        bubbleMethod(numbers);
        
        
    }
    
    /**
     * 
     * @return Return the array entered by the user
     */
    public static int[] createArray(){
        
        int[] numbers;
        int numberOfElementsInTheArray;
        
        System.out.print("How many elements do you want in your array?: ");
        numberOfElementsInTheArray = sc.nextInt();
        
        // initialize the array 
        numbers = new int[numberOfElementsInTheArray];
        
        // fill the array by numbers given by the user
        System.out.println("\nPlease fill the list");
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Insert #: " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        return numbers;
    }
    
    // BUBBLE METHOD
    public static void bubbleMethod (int[] numbers){
        
        // save the current value of the array
        int currentValue;
        
        // starts bubble method using a normal loop "for" which tours the array and a nested "for" to sort the array. 
        for(int i = 0; i < (numbers.length-1); i++ ){
            
            boolean swapped = true; // if it is an exchange of number it becomes false, each iteration it changes to true
            
            for (int j = 0; j < (numbers.length-1); j++){
                
               if ( numbers[j] > numbers[j+1]){ // if the current number > than the next one 
                   currentValue = numbers[j]; // save the current number
                   numbers[j] = numbers[j+1]; // set the new value for the current number
                   numbers[j+1] = currentValue; // set the new value "current value"
                   swapped = false;
               }
               
            }
            
            if ( swapped == true){ // if swapped is true that means the array is sorted
                break;
            }
        }
        
        System.out.println("\nSorted Array");
        // Shows final sorted array
        for ( int e: numbers){
            System.out.print(e + " ");
        }
        
        System.out.println("\ndecreasing Array");
        // Shows final sorted array
        for ( int i = (numbers.length-1); i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
        
        
    }
            
}

