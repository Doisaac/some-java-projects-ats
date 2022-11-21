/*
 * Create an array with N numbers given by you, and it will automatically order it for you
 */
package com.douglas.projects;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class InsertionOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[], nOfElements;
        
        // ask for n
        nOfElements = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want?"));
        
        // initialized array
        numbers = new int[nOfElements];
        
        //creates array
        for(int i = 0; i<nOfElements; i++){
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1) + ".Enter a number"));
        }
        
        int pos, aux;
        
        // sorting array
        for(int i = 0; i <nOfElements; i++){
            pos  = i;
            aux = numbers[pos];
            
            while(pos > 0 && numbers[pos-1] > aux){
                numbers[pos] = numbers[pos-1];
                pos--;
            }
            numbers[pos] = aux;
        }
        
        //show increasing array
        System.out.println("The array in an increasing order is: ");
        for(int i = 0; i < (nOfElements-1); i++){
            System.out.print(numbers[i] + " - ");
        }
        
        //show decreasing array
        System.out.println("\n\nThe array in a decreasing order is: ");
        for(int i = (nOfElements-1); i >= 0; i--){
            System.out.print(numbers[i] + " - ");
        }
        
        System.out.println(" ");
    }
}
