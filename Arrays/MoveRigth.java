/*
Exercise: Create a program that reads for
keyboard a table of 10 integers and the
move one position down: the first
becomes the second, the second becomes the
third and so on. The last one becomes the
first.
 */
package com.douglas.projects;

import java.util.Scanner;

public class MoveRigth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        
        System.out.println("Please insert the numbers into the array");
        
        for(int i= 0; i<10; i++){
            System.out.print("Enter number #" + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        
        int last = array[9]; //save the last element
        
        for(int i=8; i>= 0; i--){ // pass to the other position
            array[i+1] = array[i];
        }
        
        array[0] = last;
        
        //shows new array
        System.out.println("New array: ");
        for(int i = 0; i<10; i++){
            System.out.print(array[i] + " ");
        }
        
    }
}
