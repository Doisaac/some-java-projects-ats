/*
 * This software creates a matrix 5x5 with 1 in all the borders and all the rest 
   with 0
 */
package com.douglas.projects;

public class JustBordersWith1 {
    public static void main(String[] args) {
        
        int matrix[][] = new int[5][5];
        
        //fill the matrix
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                
                if( i == 0 || i == 4 ){ // condition for fill the margin rows
                    matrix[i][j] = 1;
                }
                else if( j == 0 ||  j == 4){ // condition for fill the columns;
                    matrix[i][j] = 1;
                }
                else {
                    matrix[i][j] = 0;
                }
                
            }
        }
        
        // shows matrix
        System.out.println("The matrix is: \n");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
