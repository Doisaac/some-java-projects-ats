 /* Program that calculates and prints the weekly salary of an employee depending
How many hours did the employee work*/

/* Programa que calcula e imprime el salario semanal de un empleado dependiendo
de cuantas horas trabajo*/

package com.douglas.projects;
import java.util.Scanner;

public class SalaryOfAnEmployee {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Scanner
    
        double totalSalary, salaryPerHour , hoursWorked, operation; //variables
        
        
        System.out.print("Enter the salary per hour ");
        salaryPerHour = sc.nextDouble();
        System.out.print("How many hours did the employee work ");
        hoursWorked = sc.nextDouble();
        
        // operation 
        operation = salaryPerHour * hoursWorked;
        totalSalary = operation;
        
        System.out.println("The Total of the salary is: " + totalSalary + " $");
    }
}
