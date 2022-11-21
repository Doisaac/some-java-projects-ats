/*
 * enter a sorted array and enter a new number
 */
package com.douglas.projects;
import java.util.Scanner;

public class InsertNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[6];
        int numberToInsert, position = 0;
        
        //fill the array
        System.out.println("Please complete the list");
        for ( int i = 0; i < (array.length-1); i++){
            System.out.print("Enter number #" + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("");
        
        //shows original array
        System.out.println("Your original array is");
        for (int i = 0; i < (array.length-1); i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        
        //ask the number to insert
        System.out.println("\nEnter the number to insert");
        numberToInsert = sc.nextInt();
        
        // find the position of the number to insert
        for( int i = 0; i < (array.length-1); i++ ){
            if ( numberToInsert > array[i]){
                position++;
            }
        }
        
        // move the numbers to insert the new value
        for( int i = (array.length-2); i >= position; i--){
            array[i+1] = array[i];
        }
        
        //insert new value
        array[position] = numberToInsert;
        
        // shows new array
        System.out.println("\nThe new array is");
        
        for ( int i = 0; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
        
    }
}
