package ReviewingMatrix;

import java.util.Scanner;
/**
 *
 * @author MrDoisaac
 */
public class MatrixWithMargin1 {
    
    static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        int[][] matrix = createMatrix();
        showMatrix(matrix);
    }
    
    public static int[][] createMatrix() {
        
        int[][] matrix = new int[5][5];
        int numberToFill = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ( i == 0 || i == (matrix.length-1) ){
                    matrix[i][j] = 1;
                }
                else if ( j == 0 || j == (matrix[i].length-1)){
                    matrix[i][j] = 1;
                }
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

