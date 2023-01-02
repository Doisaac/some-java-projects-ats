package ReviewingMatrix;
import java.util.Scanner;
/**
 *
 * @author MrDoisaac
 */
public class TransposingAMatrix5x9InANewMatrix {
    
    static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        int[][] matrix = createMatrix();
        int[][] transposeMatrix = transposeMatrix(matrix);
        showMatrix(matrix);
        showMatrix(transposeMatrix);
    }
    
    public static int[][] createMatrix() {
        
        int[][] matrix = new int[5][9];
        int numberToFill = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = numberToFill++;
            }
        }
        
        return matrix;
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        
        int newMatrix[][] = new int[9][5]; 
        
        for (int i = 0; i < newMatrix.length; i++) {   
            for (int j = 0; j < newMatrix[i].length; j++) {
                newMatrix[i][j] = matrix[j][i];
            }
        }
        
        return newMatrix;
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
