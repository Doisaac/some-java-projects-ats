package ReviewingMatrix;

/**
 *
 * @author MrDoisaac
 */
public class Matrix7x7With1InDiagonals {
    public static void main(String[] args) {
        int matrix[][] = createArray();
        showMatrix(matrix);
    }
    
    public static int[][] createArray(){
        int[][] matrix  = new int[7][7];
        
        for (int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix[i].length; j++){
                if ( i  == j){
                    matrix[i][j] = 1;
                }
                else {
                    matrix[i][j] = 0;
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
