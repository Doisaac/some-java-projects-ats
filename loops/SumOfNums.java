/*
 * This program, show you a total sum of the numbers you type in. 
   for stop it press 0
 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class SumOfNums {
    
    public static void main(String[] args) {
        
        short number, sumOfNumbers = 0;
        
        number = Short.parseShort(JOptionPane.showInputDialog("Enter a number"));
        
        while(number != 0){
            
            sumOfNumbers += number;
            
            number = Short.parseShort(JOptionPane.showInputDialog(
                    "Enter another number \n" +
                    "Press 0 to exit"
            ));
        }
        
        JOptionPane.showMessageDialog(null, "The sum of the numbers is: " + sumOfNumbers);
        
    }
}
