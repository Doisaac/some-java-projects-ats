package ReviewingMatrix;

import java.util.Scanner;


public class SumTwo3x3Matrix {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[][] matrix1 = createMatrix();
        int[][] matrix2 = createMatrix();
        showMatrix(SumMatrix(matrix1, matrix2));
    }
    
    public static int[][] createMatrix() {
        int[][] matrix;
        
        // initialized the matrix
        matrix = new int[3][3];

        System.out.println("\nPlease fill the matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Position (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }
    
    public static int[][] SumMatrix(int[][] matrix1, int[][] matrix2){
        
        int[][] addition = new int[3][3];
        
        for (int i = 0; i < addition.length; i++){
            for ( int j = 0; j < addition[i].length; j++){
                addition[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        return addition;
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
    
    
}
