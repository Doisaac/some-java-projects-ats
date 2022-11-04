
// This program calculates the square of a sum.

package com.douglas.projects;

import java.util.Scanner;

public class SquareOfASum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int number1, number2, addition;
        
        System.out.print("Type number 1: ");
        number1 = sc.nextInt();
        
        System.out.print("Type number 2: ");
        number2 = sc.nextInt();
        
        int operation = (int) Math.pow(number1, 2) + (int) Math.pow(number2, 2)
                      + 2*(number1 *number2); 
        
        System.out.println("The result is: " + operation);
    }
}
