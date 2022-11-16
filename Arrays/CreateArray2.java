/*
 * This program creates an Array from 5 elements. Than you add each element,
   and at the end it will you the complete array in the same order you created it.
 */
package com.douglas.projects;

import java.util.Scanner;

public class CreateArray2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] numbers = new float[5];

        //adding number
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            numbers[i] = sc.nextFloat();
        }

        //showing array 
        System.out.println("\nYour Array is: ");
        for (float i : numbers) {
            System.out.print(i + " ");
        }
    }
}
