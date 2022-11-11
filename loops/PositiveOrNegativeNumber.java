/*
This program determines if a number is positive or negative.
it works until you type 0
 */
package com.douglas.projects;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        
        while(num != 0){
            if( (num > 0) ){
                JOptionPane.showMessageDialog(null, "The number is positive");
            }
            else{
                JOptionPane.showMessageDialog(null, "The number is negative");
            }
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter another number, or type 0 for exit"));
        }
        
    }
}
