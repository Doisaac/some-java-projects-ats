/*
 * A matrix is symmetric if the number of rows are the same of the numbe of columns
 * Also it is symmetric when you got the same matrix when you change its rows to columns
 */
package ReviewingMatrix;

import java.util.Scanner;

public class TestingIfAMatrixIsSymmetric {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int matrix[][] = createMatrix();
        showMatrix(matrix);
        checkIfItIsSymmetric(matrix);
    }

    public static int[][] createMatrix() {
        int[][] matrix;

        System.out.print("How many rows do you want?: ");
        int numOfRows = sc.nextInt();

        System.out.print("How many columns do you want?: ");
        int numOfColumns = sc.nextInt();

        // initialized the matrix
        matrix = new int[numOfRows][numOfColumns];

        System.out.println("\nPlease fill the matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Position (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    public static void showMatrix(int[][] matrix) {

        System.out.println("\nMatrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void checkIfItIsSymmetric(int[][] matrix) {

        int numOfRows = 0;
        int numOfColumns = 0;
        boolean symmetric = true;
        
        // looks up how many cols and rows the matix has
        for (int i = 0; i < matrix.length; i++) {
            numOfRows++;
            for (int j = 0; j < matrix[i].length; j++) {
                if ( i == 0){
                    numOfColumns++;
                }
            }
            
        }
        
        if (numOfColumns == numOfRows){
            int row = 0, col;
            
            while( row < numOfRows && symmetric == true){
                col = 0;
                
                while(col < numOfColumns && symmetric == true){
                    if ( matrix[row][col] != matrix[col][row]){
                        symmetric =  false;
                    }
                    col++;
                }
                row++;
            }
            
            if ( symmetric == true){
                System.out.println("The matrix is symmetric");
            } else {
                System.out.println("The matrix is not symmetric");
            }
            
        } else {
            System.out.println("\nThe matrix is not symmetric");
        }

    }
   
}
