/*
 * 
application that helps us manage the grades
of an educational center. Each group (or class)
is made up of 5 students. You are asked to read the
first, second and third semesters' grades of
a group. We must show at the end: the note
group mean in each trimester, and the mean
of the student who is in position N
(read by the keyboard)
 */
package com.douglas.projects;

import java.util.Scanner;


public class MiniCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float semester1[] = new float[5]; 
        float semester2[] = new float[5]; 
        float semester3[] = new float[5]; 
        
        float s1Sum = 0, s2Sum = 0, s3Sum = 0; // this contains semesters
        float s1Mean, s2Mean, s3Mean; //  this contains the avarage of each semester
        int nStudent;
        float sStudent = 0;
        float stMean;
        
        //ask for semester 1 grades 
        System.out.println("Insert Grades of semester #1");
        for(int i = 0; i < 5 ; i++){
            System.out.print((i+1)+".Enter a grade: ");
            semester1[i] = sc.nextFloat();
            s1Sum += semester1[i];
        }
        
        //ask for semester 2 grades 
        System.out.println("\nInsert Grades of semester #2");
        for(int i = 0; i < 5 ; i++){
            System.out.print((i+1)+".Enter a grade: ");
            semester2[i] = sc.nextFloat();
            s2Sum += semester2[i];
        }
        
        //ask for semester 3 grades 
        System.out.println("\nInsert Grades of semester #3");
        for(int i = 0; i < 5 ; i++){
            System.out.print((i+1)+".Enter a grade: ");
            semester3[i] = sc.nextFloat();
            s3Sum += semester3[i];
        }
        
        //calcules the averages
        s1Mean =  s1Sum / 5;
        s2Mean =  s2Sum / 5;
        s3Mean =  s3Sum / 5;
        
        
        
        do{
            System.out.println("\nEnter a number of a student to know his/her average");
            nStudent = sc.nextInt();
        } while(nStudent < 0 && nStudent > 4);
        
        // calculates the average of the student given by the user
        sStudent = semester1[nStudent] + semester2[nStudent] + semester3[nStudent];
        stMean = sStudent / 3;
        
        //shows results
        System.out.println("\n----------------------------------------------------");
        System.out.println("Results\n");
        System.out.println("First semester average: " + s1Mean);
        System.out.println("Second semester average: " + s2Mean);
        System.out.println("Third semester average: " + s3Mean);
        System.out.println("----------------------------------------------------");
        
        
        System.out.println("*******************************");
        System.out.println("Student average: " + stMean);
        System.out.println("*******************************");
    }
}
