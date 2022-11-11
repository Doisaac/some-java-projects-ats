/*
 This program determines how many numbers did the user type
 until the user types a negative number.
 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class EnteredNumbers {
    
    public static void main(String[] args) {
        
        int num, numCounter = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        
        while(num >= 0){
            numCounter++;
            
            num = Integer.parseInt(JOptionPane.showInputDialog(
                    "Enter a positive number to continue \n" +
                    " Enter a negative for exit"
            ));
        }
        
        JOptionPane.showMessageDialog(null, "Your entered " + numCounter  + " positive numbers");
    }
}
