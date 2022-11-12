/*
 The software wants to know the sum of 10 salaries and how many are higher 
 than a $1000
*/
package com.douglas.projects;

import javax.swing.JOptionPane;

public class Problem {
    
    public static void main(String[] args) {
       
        float salary, salarySum = 0, higherThan = 0;
        
        for(int i = 1; i <= 10; i++){
            salary = Float.parseFloat(JOptionPane.showInputDialog("Enter Salary #" + i));
            salarySum += salary;
            
            if(salary > 1000){
                higherThan++;
            }
        }
        
        JOptionPane.showMessageDialog(
                null, "The sum of the salaries is: " + salarySum
                + "\nJust " + (int) higherThan + " are higher than a $1000"
        );
        
    }
}
