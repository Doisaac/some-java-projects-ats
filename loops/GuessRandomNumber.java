/*
In this mini-game you have to guess a random number that was created by the
software, the game is going to tell you if you are close or not. When you
guess it, it will show you how many attempts you did.
*/
package com.douglas.projects;

import javax.swing.JOptionPane;

public class GuessRandomNumber {
    
    public static void main(String[] args) {
        
        int num, random, attempts = 0;

        random = (int) (Math.random()*100); //this one generates a random num.
        
        System.out.println(random);
        
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            
            if( (num < random) ){
                JOptionPane.showMessageDialog(null,"Enter a higher one");
            }
            else if (num > random){
                JOptionPane.showMessageDialog(null,"Enter a smaller one");
            }
            
            attempts++;
            
            
        } while(num != random);
        
        
        JOptionPane.showMessageDialog(null,"Congrats! You guessed it in the " + attempts + " attempt");
            
    }
}
