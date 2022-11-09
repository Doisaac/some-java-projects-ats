/*
 This program validates if a date is correct. Giving a:
1- day
2- month
4- year
supossing that every month has 30 days.
 */
package com.douglas.projects;

import javax.swing.JOptionPane;


public class ValidationDate {
    public static void main(String[] args) {
        
        int day, month, year;
        
        day = Integer.parseInt(JOptionPane.showInputDialog("Type the day: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Type the month: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Type the year: "));
        
        if( (day >= 1) && (day <= 30)) {
            
            if( (month > 0) && (month <= 12)){
                if( (year != 0) ){
                    JOptionPane.showMessageDialog(null, "The Date is correct!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "The Month isn't correct");
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "The day isn't correct");
        }
    }
    
}
