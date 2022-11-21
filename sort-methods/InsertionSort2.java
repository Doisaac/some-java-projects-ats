/*
 * Insertion Sort second try 
 */
package com.douglas.projects;
import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class InsertionSort2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int array[], numOfArray;
        
        System.out.print("How many numbers do you want in your list? : ");
        numOfArray = sc.nextInt();
        
        array = new int[numOfArray];
        
        //insert the numbers into the array
        for (int i = 0; i < numOfArray; i++){
            System.out.print("Enter number #" + (i+1) +": ");
            array[i] = sc.nextInt();
        }
        
        //shows original array
        System.out.println("\nYour original list is");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        
        //Insertion sort
        for (int i = 1; i < array.length; i++) {
           int currentValue = array[i];
           int j = i - 1;
           
           while(j >= 0 && array[j] > currentValue){
               array[j+1] = array[j];
               j--;
           }
           array[j+1] = currentValue;
        }
        
        System.out.println("\n\nYour sorted list is");
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        
    }
}
