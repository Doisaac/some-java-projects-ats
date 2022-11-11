/*
*This program gives the mean of the total of numbers you entered.
* You stopped it with a negative number
*/
package com.douglas.projects;

import javax.swing.JOptionPane;

public class NumberMean {
    
    public static void main(String[] args) {
        
        int number, totalOfNumbers = 0, sumOfNumbers = 0;
        double totalMean;
        
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1: "));
        
        while( (number > 0) ){
            sumOfNumbers += number;
            totalOfNumbers++;
            
            
            number = Integer.parseInt(JOptionPane.showInputDialog(
                    "Enter another number: "  +
                    "\n\nOr enter a negative number to exit"));
        }
        
        if(totalOfNumbers == 0){
            JOptionPane.showMessageDialog(null, "The division of 0 doesn't exist");
        }
        else{
            totalMean = (double) sumOfNumbers/totalOfNumbers;
            JOptionPane.showMessageDialog(null,"The mean is: " + totalMean);
        }
          
    }
    
}
