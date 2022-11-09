/*
The company makes a 20% disscount if the client buys more than $300.
*/

package com.douglas.projects;

import javax.swing.JOptionPane;

public class ClientDiscount {
    public static void main(String[] args) {
        
        String clientName;
        float amount, discount = 0.20f, finalAmount;
        
        clientName = JOptionPane.showInputDialog("Type your name please: ");
        amount = Integer.parseInt(JOptionPane.showInputDialog("Type the total of your purchased"));
        
        if(amount > 300){
            finalAmount = amount - discount;
            JOptionPane.showMessageDialog(null, "Congrats, your final total is: " + finalAmount);
        }
        else{
            JOptionPane.showMessageDialog(null, "Your final total is: " + amount);
        }
        
    }
}
