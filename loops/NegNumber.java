/*
 * The software asks for 10 numbers and in the end it will show you 
   if  you introduced a negative number or not
 */
package com.douglas.projects;

import javax.swing.JOptionPane;


public class NegNumber {
    
    public static void main(String[] args) {
        
        int number;
        boolean negative = false;
        
        for(int i = 1; i <= 10; i++){
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter number #" + i));
            
            if(number < 0){
                negative = true;
            }
            
        }
        
        if(negative == true ){
                System.out.println("You introduced a negative number");
        } else System.out.println("You didn't introduce a negative number");
        
    }
    
}
