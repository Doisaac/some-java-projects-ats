/* Program that calculates the average of a student, giving only 3 grades.
The final score is going to be round*/

/* Programa que calclta el promedio de un estudiante, dando solo 3 notas.
La nota final será aproximada*/

package com.douglas.projects;

import java.util.Scanner;

public class SchoolAverage {

    public static void main(String[] args) {
        //Scanner or user input
        Scanner sc = new Scanner(System.in);
        
        // variables
        float grade1, grade2, grade3, addition;
        int average;
        
        //this asks for your grades 
        System.out.println("Type your grades");
        System.out.print("Grade #1 ");
        grade1 = sc.nextFloat();
        System.out.print("Grade #2 ");
        grade2 = sc.nextFloat();
        System.out.print("Grade #3 ");
        grade3 = sc.nextFloat();
        
        // operators
        addition = grade1 + grade2 + grade3;
        average = Math.round(addition / 3);
        
        System.out.println("Your Final Score is: " + average);
    }
}
