/*
 This program rank a grade given by the user. 
 
- 0-5 Insufficient
- 6-7 Enough 
- 8-9 Good
- 10 Excellent

 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class RankingAGrade {

    public static void main(String[] args) {
        
        int grade;
        
        grade =Math.round(Float.parseFloat(JOptionPane.showInputDialog("Type your grade")));
        
        if( (grade >= 0) && (grade <=10) ){
            
            if( (grade >= 0) && (grade <= 5) ){
                JOptionPane.showMessageDialog(null, "Your grade is Insufficient");
            }
            else if ( (grade >= 6) && (grade <= 7) ){
                JOptionPane.showMessageDialog(null, "Your grade is Enough");
            }
            else if ( (grade >= 8) && (grade <= 9) ){
                JOptionPane.showMessageDialog(null, "Your grade is Good");
            }
            else if ( (grade >= 9) && (grade <= 10) ){
                JOptionPane.showMessageDialog(null, "Your grade is Excellent");
            }
          
        }
        else{
            JOptionPane.showMessageDialog(null, "Type a real grade, between 0 and 10");
        }
    }
}
