/*
 This program determines if a number is an even or odd number.

 El programa determina si el numero es par o impar.
 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        
        short number;
        
        number = Short.parseShort(JOptionPane.showInputDialog("Type a number"));
        
        if (number%2 == 0){
            JOptionPane.showMessageDialog(null, "The number " + "'" +  number + "' "   + ", is an even number");
        }
        else{
            JOptionPane.showMessageDialog(null, "The number " + "'" +  number + "' "   + ", is an odd number");
        }
    }
}
