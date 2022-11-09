/*
This program is a arithmetic calculator, giving it only integer numbers.
Users must enter just a character to choose which operation they need.

- a or A = Addition 
- s or S = Subtraction
- m or M  = Multiplication
- d od D = Division
 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class ArithmeticCalc {
    public static void main(String[] args) {
        
        int num1, num2, addition, subtraction, multiplication, division;
        char operation;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Type number 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Type number 2"));
        
        operation = JOptionPane.showInputDialog("Type which operation you want").charAt(0);
        
        switch(operation){
            case 'A':
            case 'a':
                addition = num1 + num2;
                JOptionPane.showMessageDialog(null, "The Sum is " + addition);
                break;
            case 's':
            case 'S':
                subtraction = num1 - num2;
                JOptionPane.showMessageDialog(null, "The Subtraction is " + subtraction);
                break;
            case 'm':
            case 'M':
                multiplication = num1 * num2;
                JOptionPane.showMessageDialog(null, "The Multiplication is " + multiplication);
                break;
            case 'D':
            case 'd':
                division = num1 / num2;
                JOptionPane.showMessageDialog(null, "The Division is " + division);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Maybe you typed a wrong letter, try again please");
                break;
        }
    }
}
