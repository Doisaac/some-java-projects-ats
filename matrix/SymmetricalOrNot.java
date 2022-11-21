/*
 * Enter n of rows, and n of cols, and then it will determinate if the matix is symmetrical or not
 */
package com.douglas.projects;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SymmetricalOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][];
        int nrows, ncol;
        boolean symmetrical = true;

        nrows = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows"));
        ncol = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns"));

        matrix = new int[nrows][ncol];

        for (int i = 0; i < nrows; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.print("Matrix [" + i + "][" + j + "] :");
                matrix[i][j] = sc.nextInt();
            }
        }

        // determines if the matrix is symmetrical
        if (nrows == ncol) {
            int i = 0, j;
            while (i < nrows && symmetrical == true) {
                j = 0;
                while (j < i && symmetrical == true) {
                    if (matrix[i][j] != matrix[j][i]) {
                        symmetrical = false;
                    }
                    j++;
                }
                i++;

            }
            if (symmetrical == true) {
                JOptionPane.showMessageDialog(null, "The matrix is symmetrical");
            } else {
                JOptionPane.showMessageDialog(null, "The matrix is not symmetrical");
            }
        } else {
            JOptionPane.showMessageDialog(null, "The matrix is not symmetrical");
        }
    }
}
