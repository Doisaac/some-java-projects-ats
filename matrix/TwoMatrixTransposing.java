/*
 * The software automatically fill a matrix and then shows you a new transposing matrix
 */
package com.douglas.projects;
import java.util.Scanner;

public class TwoMatrixTransposing {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[5][9];
        int matrix2[][] = new int[9][5];
        int number = 1;
        System.out.println("Enter the matrix\n");
        for(int i = 0; i < 5; i++) {
            number = 0;
            for(int j = 0; j<9; j++){
                matrix[i][j] = number;
                number++;
            }
            System.out.println("");
        }
        
        System.out.println("\nThe original matrix is");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j<9; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        
        //  transposing
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j<9; j++){
                matrix2[j][i] = matrix[i][j];
            }
        }
        
        //shows result
        System.out.println("\nYour transposing matrix is");
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j<5; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
