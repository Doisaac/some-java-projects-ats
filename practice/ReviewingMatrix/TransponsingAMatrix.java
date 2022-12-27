package ReviewingMatrix;

import java.util.Scanner;

public class TransponsingAMatrix {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[][] matrix1 = createMatrix();
        
        showMatrix(matrix1);
        
        int[][] transponsedMatrix = converter(matrix1);
        showMatrix(transponsedMatrix);
                
    }
    
    public static int[][] converter(int [][] matrix){
        
        int row = 0, col;
        
        while(row < matrix.length){
            col = 0;
            while(col < row){
                int aux = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = aux;
                col++;
            }
            row++;
        }
        
        return matrix;
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
