
package com.douglas.projects;

import java.util.Scanner;

public class YouCreateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nOfElements;
        
        System.out.println("Enter the number of elements");
        nOfElements = input.nextInt();
        
        char letter [] = new char[nOfElements];
        
        for(int i = 0; i<nOfElements; i++){
            System.out.print( (i+1) + " Enter the letter: ");
            letter[i] = input.next().charAt(0);
        }
        
        System.out.print("The array is: ");
        for(int i = 0; i < nOfElements; i++){
            System.out.print(letter[i]+ " ");
        }
        
    }
}
