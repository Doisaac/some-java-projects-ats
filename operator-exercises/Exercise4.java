/*
Exercise 4: Construct a program that, given
a total number of hours, returns the number
of equivalent in weeks, days and hours. For 
example, given a total of 1000 hours it should
show 5 weeks, 6 days and 16 hours.
 */

 /*
Ejercicio 4: Construir un programa que, dado
un numero total de horas, devuelve el numero
de semanas, dias y horas equivalentes. Por
ejemplo, dado un total de 1000 horas debe
mostrar 5 semanas, 6 dias y 16 horas.
 */
package com.douglas.projects;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalHours, weeks, days, hours;
        
        System.out.print("Type the total of hours: ");
        totalHours = sc.nextInt();
        
        weeks = totalHours / (24*7);
        days = totalHours%168 / 24;
        hours = totalHours%24;
        
        System.out.println("\nThe result is: ");
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
    }

}
