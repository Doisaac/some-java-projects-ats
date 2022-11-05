/*
 Program that determinates if a number is multiple of a number given by the user
*/
package com.douglas.projects;
import javax.swing.JOptionPane;
public class MultipleOfANumber {
    public static void main(String[] args) {
        
        int number, multipleOf;
        
        number = Integer.parseInt(JOptionPane.showInputDialog("Type the number"));
        multipleOf = Integer.parseInt(JOptionPane.showInputDialog("Type the divisor"));
        
        if(number%multipleOf == 0){
            JOptionPane.showMessageDialog(null, "The number " + number + " is multiple of " + multipleOf);
        }
        else{
            JOptionPane.showMessageDialog(null, "The number " + number + " is'nt multiple of " + multipleOf);
        }
    }
}
