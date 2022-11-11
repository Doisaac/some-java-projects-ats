/*
 Read a number, and show its square until the given number is negative
 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class SquareOfANumber {
    public static void main(String[] args) {
        
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));
        
        while(numero>= 0){
            cuadrado = (int) Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "The number squared is: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Type another number"));
        }
    }
}
