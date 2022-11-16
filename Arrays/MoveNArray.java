/*
 * This program allows you to enter 10 numbers and then you choose a "n" spaces
   to move the array.
*/
package com.douglas.projects;

import java.util.Scanner;

public class MoveNArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10], nPosition, last;
        
        System.out.println("Please insert the numbers into the array");
        
        for(int i= 0; i<10; i++){
            System.out.print("Enter number #" + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number of positions you want to move");
        nPosition = sc.nextInt();
        
        for(int vuelta = 1; vuelta<=nPosition; vuelta++){
            last = array[9];
            for(int i = 8; i>=0; i--){
                array[i+1] = array[i];
            }
            array[0] = last;
        }
       
        
        //shows new array
        System.out.println("New array: ");
        for(int i = 0; i<10; i++){
            System.out.print(array[i] + " ");
        }
        
        
    }
}
