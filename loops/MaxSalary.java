/*
 This software ask for "n" number of salaries and gives you the highest salary
 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class MaxSalary {

    public static void main(String[] args) {

        int n;
        float salary, highestSalary = 0f;

        n = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter the number of salaries you want to add"));

        for (int i = 1 ; i <= n; i++) {
            salary = Float.parseFloat(JOptionPane.showInputDialog("Enter salary #" + i));

            if (salary > highestSalary) {
                 highestSalary = salary;
            }
           
        }
        
        JOptionPane.showMessageDialog(null, "The highest salary is: " + highestSalary);

      

    }
}
