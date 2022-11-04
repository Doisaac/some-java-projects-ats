
/* Exercise 5: The final grade of a Computer Science student is calculated
based on the ratings of Four aspects academic performance:
1- participation,
2- first partial exam, 
3- second partial exam 
4- final exam.

Knowing that the Previous grades enter into the final grade with weights from the
10%, 25%, 25% and 40%, Make a program that calculates and prints the score
final obtained by a student.*/

 /* Ejercicio 5: La calificación final de un estudiante de Informática se calcula 
con base a las calificaciones de Cuatro aspectos rendimiento académico participación, 
primer examen parcial, segundo examen parcial y examen final. Sabiendo que las 
calificaciones anteriores entran a la calificación final con ponderaciones del 
10%, 25%, 25% y 40%, Hacer un programa que calcule e imprima la calificación 
final obtenida por un estudiante.
 */
package com.douglas.projects;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float participation, grade1, grade2, grade3, finalGrade;
        
        /*************************************/
        System.out.println("Type the grades: ");
    
        System.out.print("Participation: ");
        participation = sc.nextFloat()*0.10f;
        
        System.out.print("Partial 1: ");
        grade1 = sc.nextFloat()*0.25f;
        
        System.out.print("Partial 2: ");
        grade2 = sc.nextFloat()*0.25f;
        
        System.out.print("Partial 3: ");
        grade3 = sc.nextFloat()*0.40f;
        /*************************************/
        
        finalGrade = participation + grade1 + grade2 + grade3;
        
        System.out.println("The final grade is: " + finalGrade); 
    }
}
