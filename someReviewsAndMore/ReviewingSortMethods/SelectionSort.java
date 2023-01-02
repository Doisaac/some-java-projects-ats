/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReviewingSortMethods;

import static ReviewingSortMethods.InsertionSort.insertionSort;
import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class SelectionSort {

    static Scanner sc = new Scanner(System.in);

    // main method
    public static void main(String[] args) {

        int[] numbers = createArray();

        selectionSort(numbers);

    }

    /**
     *
     * @return Return the array entered by the user
     */
    public static int[] createArray() {

        int[] numbers;
        int numberOfElementsInTheArray;

        System.out.print("How many elements do you want in your array?: ");
        numberOfElementsInTheArray = sc.nextInt();

        // initialize the array 
        numbers = new int[numberOfElementsInTheArray];

        // fill the array by numbers given by the user
        System.out.println("\nPlease fill the list");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Insert #: " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        return numbers;
    }

    // Selection Sort
    public static void selectionSort(int[] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {

            int min = i;

            // finds the position of the min number
            for ( int j = i+1; j < inputArray.length; j++){
                if ( inputArray[j] < inputArray[min]){
                    min = j;
                }
            }

            int aux = inputArray[i];
            inputArray[i] = inputArray[min];
            inputArray[min] = aux;

        }

        System.out.println("\nSorted Array");
        for (int e : inputArray) {
            System.out.print(e + " ");
        }
    }
}
