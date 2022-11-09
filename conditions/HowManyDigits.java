/*
This program determines how many digits a number has until 999999

Este programa determina cuantas cifras tiene un numero hasta 99999
*/
package com.douglas.projects;

import javax.swing.JOptionPane;

public class HowManyDigits {
    public static void main(String[] args) {
        
        float num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));
        
        if(num < 10){
            JOptionPane.showMessageDialog(null, "The number has 1 digits");
        }
        else if(num >= 10 && num < 100){
            JOptionPane.showMessageDialog(null, "The number has 2 digits");
        }
        else if(num >= 100 && num < 1000){
            JOptionPane.showMessageDialog(null, "The number has 3 digits");
        }
        else if(num >= 1000 && num < 10000){
            JOptionPane.showMessageDialog(null, "The number has 4 digits");
        }
        else if(num >= 10000){
            JOptionPane.showMessageDialog(null, "The number has 5 digits");
        }
        else if (num > 99999) {
            JOptionPane.showMessageDialog(null, "Please type a lower number");
        }
        
    }
}
