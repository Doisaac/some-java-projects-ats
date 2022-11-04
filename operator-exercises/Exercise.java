
/* Ejercicio 1: Guillermo tiene N, dólares. Luis tiene la mitad de lo que posee
Guillermo. Juan tiene la mitad de lo que poseen Luiss y Guillermo juntos. Hacer
un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
*/

/* Exercise 1: Guillermo has N dollars. Luis has the half of what Guillermo owns.
Juan has half of what Luiss and Guillermo have together. Do a program that 
calculates and prints the amount of money that the three of them have*/

package com.douglas.projects;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //user input
        
        float guillermo, luis, juan, total;
        
        System.out.print("Type the amount of money Guillermo Has ");
        guillermo = sc.nextFloat(); 
        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;
        total = guillermo + luis + juan;
        
        System.out.println("The amount of money they have together is: " + total + "$");
    }
}
