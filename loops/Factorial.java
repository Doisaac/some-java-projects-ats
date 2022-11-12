/*
 * Enter a number and the program will show you the factorial of it. 
*/
package com.douglas.projects;

import javax.swing.JOptionPane;

public class Factorial {
    
    public static void main(String[] args) {
        
        long number, factorial = 1;
        
        
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number to be calculated"));
        
        for(int i = 1; i<=number; i++ ){
            factorial *= i;
        }
        
        JOptionPane.showMessageDialog(null, "The factorial is: " + factorial);
    }
    
}
