/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SomeExercises;

import javax.swing.JOptionPane;

/**
 *
 * @author MrDoisaac
 */

public class TernaryOperator {

    public static void main(String[] args) {
        int number;
        String message;

        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Insert a number"));

            message = (number % 2 == 0) ? "The number is even" : "The number is odd";
            
            if (number != 0){
               JOptionPane.showMessageDialog(null, message); 
            }
            
        } while (number != 0);
    }
}
