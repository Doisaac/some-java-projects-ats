/*
Ejercicio 2: Una compañía de venta de carros usados, paga a su personal de 
ventas un salario de $1000 mensuales, mas una comisión de $150 por cada carro
vendido, más el 5% del valor de la venta por carro. Cada mes el capturista de
la compañia ingresa en la computadora los datos pertinentes. Hacer un programa 
* que calcule e imprima el salario mensualde un vendedor dado
*/

/* 
Exercise 4: A used car sales company pays its sales staff a salary of $1000 
monthly, plus a commission of $150 for each car sold, plus 5% of the value of 
the sale per car. Each month the capturist of the company insert into the computer
the relevant data. Write a program that calculates and prints the monthly salary 
of a given  salesperson
*/

package com.douglas.projects;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float salary = 1000f, commission = 150f, totalSalary, carsSoldAmount; 
        int carsSold;
        
        System.out.print("How many cars did the employee sell? ");
        carsSold = sc.nextInt();
        
        System.out.print("What is the total amount of the cars sold ");
        carsSoldAmount = sc.nextFloat();
        
        totalSalary = salary + (carsSold * 150) + (carsSoldAmount * 0.05f);
        
        System.out.println("The Employee's Salary is: " + totalSalary + "$");
    }
}
