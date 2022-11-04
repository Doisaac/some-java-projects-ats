package com.douglas.projects;

import java.util.Scanner;

public class SecondGradeEquation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, x1, x2;
        
        System.out.print("Type the number for a: ");
        a = sc.nextInt();
        System.out.print("Type the number for b: ");
        b = sc.nextInt();
        System.out.print("Type the number for c: ");
        c = sc.nextInt();
        
        double pow = Math.pow(b,2);
        double root = Math.sqrt(pow - (4*a*c));
        double resultx1 = (-b + root) / (2*a);    
        
        System.out.println("\nThe result of your equation is: " + resultx1);
    }
}
