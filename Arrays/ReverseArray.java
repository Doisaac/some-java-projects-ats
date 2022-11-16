/*
 * * This program creates an Array from 5 elements. Than you add each element,
   and at the end it will you the complete array but inverted.
 */
package com.douglas.projects;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numbers [] = new int[5];
        
        for(int i = 0; i < numbers.length; i++){
            System.out.print((i+1) + ". Enter the number: ");
            numbers[i] = sc.nextInt();
        }
        
        //show the array
        System.out.println("\nThe inverted array is: ");
        for(int i = 4; i >= 0; i--){
            System.out.print(numbers[i] + ",");
            if(i == 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
