/*
 * Enter 8 numbers and later add another one in the position you prefer.
 */
package com.douglas.projects;

import java.util.Scanner;

public class Position {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[10];
        int newNumber, position;

        System.out.println("\nFill the array");
        
        //Filling the array, but just 8 numbers
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter number #" +(i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter a new number");
        newNumber = sc.nextInt();
        
        System.out.println("________________________");
        
        System.out.println("Enter the position\n");
        position = sc.nextInt();
        
        for(int i = 7; i>=position; i--){ 
            numbers[i+1] = numbers[i];
        }
        
        numbers[position] = newNumber;
        
        //shows new order
        System.out.println("\nThe new array is: ");
        for(int i = 0; i<9; i++){
            System.out.print(numbers[i]+ " ");
        }
    }
}
