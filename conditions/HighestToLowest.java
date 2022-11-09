/*
This program orders the numbers given by the user, from highest to lowest
 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class HighestToLowest {
    public static void main(String[] args) {
        
        int num1, num2, num3;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Type number 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Type number 2: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Type number 3: "));
        
        if(num1 > num2 && num2 > num3){
            JOptionPane.showMessageDialog(null, "Ordered: " + num1 + " - " + num2 + " - " + num3);
        }
        else if (num1 > num3 && num3 > num2){
            JOptionPane.showMessageDialog(null, "Ordered: " + num1 + " - " + num3 + " - " + num2);
        }
        else if(num2 > num1 && num1 > num3){
            JOptionPane.showMessageDialog(null, "Ordered: " + num2 + " - " + num1 + " - " + num3);
        }
        else if(num2 > num3 && num3 > num1){
            JOptionPane.showMessageDialog(null, "Ordered: " + num2 + " - " + num3 + " - " + num1);
        }
        else if(num3 > num1 && num1 > num2){
            JOptionPane.showMessageDialog(null, "Ordered: " + num3 + " - " + num1 + " - " + num2);
        }
        else if (num3 > num2 && num2 > num1){
            JOptionPane.showMessageDialog(null, "Ordered: " + num3 + " - " + num2 + " - " + num1);
        }
        else if(num1 == 0 && num2 == 0){
            JOptionPane.showMessageDialog(null, "Ordered: " + num3 + " - " + num1 + " - " + num2 );
        }
        else if(num1 == 0 && num3 == 0){
            JOptionPane.showMessageDialog(null, "Ordered: " + num2 + " - " + num1 + " - " + num3);
        }
        else if(num2 == 0 && num1 == 0){
            JOptionPane.showMessageDialog(null, "Ordered: " + num3 + " - " + num1 + " - " + num2);
        }
        else if(num2 == 0 && num3 == 0){
            JOptionPane.showMessageDialog(null, "Ordered: " + num1 + " - " + num3 + " - " + num2);
        }
        else if (num3 == 0 && num1 == 0){
            JOptionPane.showMessageDialog(null, "Ordered: " + num2 + " - " + num3 + " - " + num1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ordered: " + num1 + " - " + num3 + " - " + num2);
        }
    }
}
