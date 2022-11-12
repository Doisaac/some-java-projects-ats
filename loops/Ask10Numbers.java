/*
 *This program asks for n numbers typed by the user and finally shows you the sum of them. 
*/
package com.douglas.projects;

import javax.swing.JOptionPane;

public class Ask10Numbers {
    
    public static void main(String[] args) {
        
        int amount, number, total = 0;
        
        amount = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want to enter?"));
        
        if(amount != 0)
        {
            for(int i = 1; i<=amount; i++){
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number " + "#" + i));
            total += number;
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "So what are you doing here? HAHA just kidding");
        }
        
        
        JOptionPane.showMessageDialog(null, "The sum of those numbers is: " + total);
    }
    
}
