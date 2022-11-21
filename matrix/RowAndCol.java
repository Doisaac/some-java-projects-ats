/*
 * Create a matrix size n x m given by the user, the software will show you
   the sum of each row and col
 */
package com.douglas.projects;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class RowAndCol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][], nrow, ncol, sumRow = 0, sumCol = 0;

        nrow = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows"));
        ncol = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns"));

        matrix = new int[nrow][ncol];

        // ask for matrix
        System.out.println("Digite la matriz\n");;
        for (int i = 0; i < nrow; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.print("Matrix [" + i + "] [" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // show the original matrix
        System.out.println("\nYour original matrix is");
        for (int i = 0; i < nrow; i++) {
            for(int j = 0; j < ncol; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("\n");
        
        // operation for rows
        for(int i = 0; i < nrow; i++){
            sumRow = 0;
            for(int j = 0; j < ncol; j++){
                sumRow += matrix[i][j];
            }
            System.out.println("The sum of the row #" + i + " is: " + sumRow);
        }
        System.out.println("");
        
        //operation for cols
        for(int i = 0; i<ncol; i++){
            sumCol = 0;
            for(int j = 0; j<nrow; j++){
                sumCol += matrix[j][i];
            }
            System.out.println("The sum of the col #" + i + " is: " + sumCol);
        }
    }
}
