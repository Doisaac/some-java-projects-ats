/*
 * The program accepts 12 numeric elements in each array. Then it creates 
   a new array with 3 elements of the first array and 3 of the other one, etc.
 */
package com.douglas.projects;

import java.util.Scanner;

public class ThreeByArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[], b[], c[];

        a = new int[12];
        b = new int[12];
        c = new int[24];

        System.out.println("Enter array #1: ");
        //Asks for array 1
        for (int i = 0; i <12; i++) {
            System.out.print((i + 1) + ".Enter a number: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter array #2: ");
        //Asks for array 2
        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + ".Enter a number: ");
            b[i] = sc.nextInt();
        }

        // fill array c
        int end = 0, fc = 0;
        
        while(end < 12){ //end is the position of where the array ends.
            for(int i  = 0; i < 3; i++){ 
                c[fc] = a[end+i]; 
                fc++;
            }
            
            for(int i = 0; i<3; i++){ 
                c[fc] = b[end+i]; 
                fc++;
            }
            end +=3;
        }
        

        //Show final array
        System.out.println("\nYour final array is: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
