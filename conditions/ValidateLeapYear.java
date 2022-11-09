/*
 This program validates if a date is correct. Giving a:
1- day
2- month
4- year

Considerating leap-years are not a correct date. 
 */
package com.douglas.projects;

import javax.swing.JOptionPane;


public class ValidateLeapYear {
    public static void main(String[] args) {
        
        int day, month, year;
        
        day = Integer.parseInt(JOptionPane.showInputDialog("Type a Day"));
        month = Integer.parseInt(JOptionPane.showInputDialog("Type a Month"));
        year = Integer.parseInt(JOptionPane.showInputDialog("Type a Year"));
        
        if ( (day > 0) && (day <=31) ){
            
            if( (month > 0) && (month <= 12) ){
                
                if ( (year%4 != 0) ) {
                    JOptionPane.showMessageDialog(null, "The Date is correct!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "The Year is a leap-year");
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null, "The Month isn't correct");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "The Day isn't correct");
        }
    }
}
