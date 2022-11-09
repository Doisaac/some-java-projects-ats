/*
Defines if a letter given by the user is Upper or lower Case
*/ 
package com.douglas.projects;

import javax.swing.JOptionPane;

public class UpperOrLowerCase {
    public static void main(String[] args) {
        
        char letter;
        
        letter = JOptionPane.showInputDialog("Type a letter: ").charAt(0);
        
        if(Character.isUpperCase(letter)){
            JOptionPane.showMessageDialog(null, "The letter " + letter + " is Uppercase!");
        }
        else{
            JOptionPane.showMessageDialog(null, "The letter " + letter + " is Lowercase!");
        }
        
    }
}
