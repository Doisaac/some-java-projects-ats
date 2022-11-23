/*
 * ATM
 */
package com.douglas.projects;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int option;
        float currentMoney = 100, deposit, withdraw;
        
        do{
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
            
            System.out.println("       WELCOME TO SANTA ANA ATM       ");
            System.out.println("        Current Money: " + currentMoney);
            
            System.out.println("\n             Options                  \n");
            
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Exit");
            
            System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
            
            System.out.print("Please enter an option: ");
            option = sc.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("Please, enter the amount to deposit");
                    deposit = sc.nextFloat();
                    currentMoney += deposit;
                    break;
                case 2:
                    System.out.println("Please, enter the amount to withdraw");
                    withdraw = sc.nextFloat();
                    if ( withdraw > currentMoney){
                        System.out.println("Sorry you do not have that amount"
                                + " please try again");
                        break;
                    } else {
                        currentMoney -= withdraw;
                        break;
                    }
                    
                case 3:
                    System.out.println("Thank you for prefering us");
                    break;
                default:
                    System.out.println("Please enter a valid option");
            }
        } while(option < 1 ||  option > 3 || option != 3);
        
        
    }
}
