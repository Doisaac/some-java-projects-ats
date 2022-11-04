/* Clasic calculator using commun operators*/
/* Calculadora clasica usando operadores comunes*/

package com.douglas.projects;
import java.util.Scanner;


public class BashCalculator {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); // User input
        
        //variables
        float number1, number2, addition, subtraction, multiplication, division;
        
        System.out.println("Type 2 numbers");
        number1 = sc.nextFloat(); // this one Asks number 1
        number2 = sc.nextFloat(); // this one Asks number 2
        
        // Operations 
        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;
        
        //output
        System.out.println("The Addition is: " + addition);
        System.out.println("The subtraction is: " + subtraction);
        System.out.println("The multiplication is: " + multiplication);
        System.out.println("The division is: " + division);
    }
}





