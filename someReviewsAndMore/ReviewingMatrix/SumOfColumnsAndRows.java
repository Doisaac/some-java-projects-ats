/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReviewingMatrix;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class SumOfColumnsAndRows {
    public static void main(String[] args) {
        int matrix[][] = createArray();
        showArray(matrix);
        sumOfMatrix(matrix);
    }
    
    public static int[][] createArray(){
        Scanner sc = new Scanner(System.in);
        int matrix[][];
        int numOfRows;
        int numOfColumns;
        
        System.out.print("How many rows do you want in your matrix?: ");
        numOfRows = sc.nextInt();
        
        System.out.print("How many columns do you want in your matrix?: ");
        numOfColumns = sc.nextInt();
        
        matrix = new int[numOfRows][numOfColumns];
        
        System.out.println("\nPlease fill the matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Fill position (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        return matrix;
    }
    
    public static void sumOfMatrix(int[][] matrix){
        
        int sumOfRows, sumOfColumns;
        
        // does the sum of the rows
        for (int i = 0; i < matrix.length; i++) {
            
            // reset the value of the rows for the new operation
            sumOfRows = 0;
            
            for (int j = 0; j < matrix[i].length; j++) {
                sumOfRows += matrix[i][j];
            }
            
            System.out.println("");
            System.out.println("The sum of the row #" + i + " is: " + sumOfRows);
        }
        
        // does the sum of the columns
        for (int j = 0; j < matrix[0].length; j++) {
            
            // reset the value of the columns for the new operation
            sumOfColumns = 0;
            
            for (int i = 0; i < matrix.length; i++) {
                sumOfColumns += matrix[i][j];
            }
            
            System.out.println("");
            System.out.println("The sum of the column #" + j + " is: " + sumOfColumns);
        }
    }
    
    public static void showArray(int[][] matrix){
        System.out.println("\nMatrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
    
}
