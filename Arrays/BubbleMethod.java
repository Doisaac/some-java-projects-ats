/*
 * This software orders an array of "n" numbers given by the user, using 
   Bubble method.
 */
package com.douglas.projects;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BubbleMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numbers[], nElements, aux;
        
        nElements = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of elements you want"));
        
        numbers = new int[nElements];
        
        // fill the array
        System.out.println("Please enter the numbers\n");
        for(int i = 0; i < nElements; i++){
            System.out.print((i+1) + ".Enter a number: ");
            numbers[i] = sc.nextInt();
        }
        
        //Bubble method
        for(int i = 0; (i<nElements-1); i++){
            for(int j = 0; (j<nElements-1); j++){
                if(numbers[j] > numbers[j+1]){
                    aux = numbers[j]; // save the actual number in a variable 
                    numbers[j] = numbers[j+1]; // you move the smaller number 
                    numbers[j+1] = aux; // you move the number saved to the position next to the actual
                }
            }
        }
        
        //shows array increasing
        System.out.println("\n_____________________");
        System.out.println("Array increasing");
        for(int e : numbers){
            System.out.print( e + " - ");
        }
        System.out.println("\n_____________________");
        
        //shows array decreasing
        System.out.println("\n_____________________");
        System.out.println("Array decreasing");
        for(int i = (nElements-1); i >= 0; i--){
            System.out.print(numbers[i] + " - ");
        }
        System.out.println("\n_____________________");
    }
}
