
package ReviewingSortMethods;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class InsertionSort {
    // Scanner
    static Scanner sc = new Scanner(System.in);
    
    // main method
    public static void main(String[] args) {
        
        int[] numbers = createArray();
        
        insertionSort(numbers);
        
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
    
    // insertion sort
    public static void insertionSort(int[] inputArray){
        
        for ( int i = 1; i < inputArray.length; i++){
            
            int aux = inputArray[i];
            int pos = i;
            
            while ( pos > 0 && inputArray[pos-1] > aux){
                inputArray[pos] = inputArray[pos-1];
                pos--;
            }
            
            inputArray[pos] = aux;
        }
        
        System.out.println("\nNew Sorted Array");
            for( int e: inputArray){
                System.out.print(e + " ");
            }
       
    }
}
