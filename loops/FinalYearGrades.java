/*
  *Write 6 grades between "0-10" , And it will show you how many students
   approved, failed, and are conditioned.
 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class FinalYearGrades {
    
    public static void main(String[] args) {
        
        float grade; 
        int  approved = 0, failed = 0, contioned = 0;
        
        for(int i = 1; i<= 6; i++){
            do{
                grade = Float.parseFloat(JOptionPane.showInputDialog("Enter a grade between 0-10"));
            } while( grade < 0 || grade > 10);
            
            if(grade > 5){
                approved++;
            }
            else if(grade >= 4 && grade <= 5){
                contioned++;
            }
            else{
                failed++;
            }
        }
        
        JOptionPane.showMessageDialog(
                null, "Approved: " + approved
                + "\nFailed: " + failed
                + "\nContioned: " + contioned);
    }
    
}
