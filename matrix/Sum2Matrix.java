/*
 * This software allows you to enter 2 matrix [3][3] and shows you its sum.
 */
package com.douglas.projects;

import java.util.Scanner;

public class Sum2Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        int matrix3[][] = new int[3][3];

        //ask for the first matrix
        System.out.println("Enter matrix 1\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matrix ["+i+"]["+j+"] :");
                matrix1[i][j] = sc.nextInt();
            }
        }

        //ask for the second matrix
        System.out.println("\nEnter matrix 2\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matrix ["+i+"]["+j+"] :");
                matrix2[i][j] = sc.nextInt();
            }
        }

        int mr = 0, mc = 0;
        
        // Addition operation
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                matrix3[i][j] = matrix1[mr][mc] + matrix2[mr][mc];
                mc++;
            }
            mc = 0;
            mr++;
        }
        
        //shows the result
        System.out.println("\n***********************************");
        System.out.println("The result is: \n");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("\n***********************************");
    }
}

