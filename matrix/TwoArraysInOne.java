/*
 * This software accepts two arrays [10], and put them together in a new Array[20]
 */
package com.douglas.projects;

import java.util.Scanner;

public class TwoArraysInOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[], b[], c[];

        a = new int[10];
        b = new int[10];
        c = new int[20];

        //Asks for array[a]
        System.out.println("Array 1");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ".Enter a number: ");
            a[i] = sc.nextInt();
        }

        //Asks for array[b]
        System.out.println("\nArray 2");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ".Enter a number: ");
            b[i] = sc.nextInt();
        }
        
        //Fill array c
        int j = 0;
        for(int i = 0; i<10; i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        
        //Shows final array c 
        for(int i = 0; i<20; i++){
            System.out.print(c[i] + " ");
        }

    }
}
