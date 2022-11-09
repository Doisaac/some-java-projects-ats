/*

 This program simulates an ATM, with 1000$ by default. 

 Be aware, you can:

1. Add money to the account
2. Withdraw money from the ATM
3. Exit

 */
package com.douglas.projects;

import javax.swing.JOptionPane;

public class AutomaticATM {
    public static void main(String[] args) {
        
        final double INITIAL_MONEY = 1000;
        int option;
        double addMoney, currentMoney = INITIAL_MONEY, withDrawMoney;
        
        option = Integer.parseInt(JOptionPane.showInputDialog(
                "Welcome to the ATM, Your current Money is :" + currentMoney + "\n"
                        
                + "Your options are:\n"
                        
                + "1. Add money to the account \n"
                        
                + "2. Withdraw money from the ATM \n"
                        
                + "3. Exit"
        ));
        
        
        switch(option){
            case 1:
                addMoney = Double.parseDouble(JOptionPane.showInputDialog("Amount of money to add: "));
                currentMoney = INITIAL_MONEY + addMoney;
                JOptionPane.showMessageDialog(null, "Your Current Money in the account is: " + currentMoney);
                break;
                
            case 2: 
                withDrawMoney = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of money, you want to withdraw"));
                
                if(withDrawMoney > currentMoney){
                    JOptionPane.showMessageDialog(null, "You do not have that amount, please try again");
                }
                else{
                    currentMoney = currentMoney - withDrawMoney;
                    JOptionPane.showMessageDialog(null, "Your current money is: " + currentMoney);
                }
                break;
            
            case 3:
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Please, enter a valid option");
                break;
        }           
    }
}
