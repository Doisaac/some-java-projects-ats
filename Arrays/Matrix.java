
package com.douglas.projects;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MrDoisaac
 */
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
         int matriz [][];
         int nrows, ncol;
         
         nrows = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows"));
         ncol = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns"));
         
         matriz = new int[nrows][ncol];
         
         for(int i = 0; i<nrows; i++){
             for(int j = 0; j<ncol; j++){
                 System.out.print("Matrix ["+i+"]["+j+"] :");
                 matriz[i][j] = sc.nextInt();
             }
         }
         
         System.out.println("\nThe matrix is: ");
         for(int i = 0; i < nrows; i++){
             for(int j = 0; j < ncol; j++){
                 System.out.print(matriz[i][j]);
                 
             }
             System.out.println("");
         }
    }
}
