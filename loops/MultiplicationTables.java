/*
 * Basically you enter a number and the software will you show you a
   multiplication table of that number from 1 to 10.
 */
package com.douglas.projects;

import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number, operation;

        do {
            System.out.print("Number of the table you need: ");
            number = sc.nextInt();

            if (number >= 0) {
                
                System.out.println("\n****************************************");
                
                for (int i = 1; i <= 10; i++) {
                    operation = number * i;
                    
                    System.out.println(
                            Integer.toString(number) + "*" + Integer.toString(i)
                            + " = " + operation);
                }
                
                System.out.println("****************************************\n");

            } else System.out.println("The number has to be more or equal than 0");
            
        } while (number >= 0);

    }
}
