/*
 * Complete the array, and enter a number to search it
 */
package com.douglas.projects;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class SequentialSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,2,3,4,5};
        int nToFind;
        int i = 0;
        boolean band = false;
        
        nToFind = Integer.parseInt(JOptionPane.showInputDialog("Enter the number to search it"));
        
        //sequential search
        while( (i<5) && band == false){
            if(numbers[i] == nToFind){
                band = true;
            }
            else i++;
        }
        
        if (band == true) {
            JOptionPane.showMessageDialog(null, "Number found in position: " + i);
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry, that number is not in the list");
        }
    }
}
