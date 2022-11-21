/*
 * Enter 10 numbers in an array and then the software will you if they are
   decreasing,increasing or they are the same. 
 */
package com.douglas.projects;

import java.util.Scanner;

public class IncreasingOrDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arreglo[] = new int[10];
        boolean creciente = false, decreciente =false;
        
        System.out.println("Complete the array");
        for(int i = 0; i<10 ; i++){
            System.out.print((i +1) + ".Enter a numer: ");
            arreglo[i] = sc.nextInt();
        }
        
        for(int i = 0; i<9; i++){
            
            if(arreglo[i] < arreglo[i+1]){
                creciente = true;
            }
            
            if(arreglo[i] > arreglo[i+1]){
                decreciente = false;
            }
        }
        
        if(creciente == true && decreciente == false){
            System.out.println("\nThe array is increasing");
        }
        else if(creciente == false && decreciente == true){
            System.out.println("\nThe array is decreasing");
        }
        else if(creciente == true && decreciente == true){
            System.out.println("\nThe array is messy");
        }
        else if(creciente == false && decreciente == false){
            System.out.println("\nAll numbers are the same");
        }
        
    }
}
