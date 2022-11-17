/*
 * Enter two arrays in an increasing order and then the software will 
   show you just one in a increasing order.
 */
package com.douglas.projects;

import java.util.Scanner;

public class MixTwoArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean increasing = true, increasing2 = true;

        int array1[] = new int[10];
        int array2[] = new int[10];
        int array3[] = new int[20];

        int end = 0, end2 = 10;// final of the array

        do {
            System.out.println("Enter the first array in an increasing way");

            // asks for array 1
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter number #" + (i + 1) + ": ");
                array1[i] = sc.nextInt();
            }

            //evaluates if the array is increasing order or not
            for (int i = 0; i < 9; i++) {

                if ((array1[i] < array1[i + 1])) {
                    increasing = true;
                }

                if ((array1[i] > array1[i + 1])) {
                    increasing = false;
                    break;
                }
            }

            //shows only if the software find an array in a decreasing order.
            if (increasing == false) {
                System.out.println("\n_________________________________________________");
                System.out.println("Please enter the numbers in an increasing order");
                System.out.println("_________________________________________________\n");
            }

        } while (increasing == false);

        // the same with array 2
        do {
            System.out.println("\nEnter Array 2 in an increasing order");

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter number #" + (i + 1) + ": ");
                array2[i] = sc.nextInt();
            }

            //evaluates array 2
            for (int i = 0; i < 9; i++) {

                if ((array2[i] < array2[i + 1])) {
                    increasing2 = true;
                }

                if ((array2[i] > array2[i + 1])) {
                    increasing2 = false;
                    break;
                }
            }

            //message to reorder
            if (increasing2 == false) {
                System.out.println("\n_________________________________________________");
                System.out.println("Please enter the numbers in an increasing order");
                System.out.println("_________________________________________________\n");
            }

        } while (increasing2 == false);

        // adding both arrays in array3
        int a = 0, b = 0, c = 0;

        while (a < 10 && b < 10) {

            if (array1[a] < array2[b]) {
                array3[c] = array1[a];
                a++;
                c++;

            } else if (array2[b] < array1[a]) {
                array3[c] = array2[b];
                b++;
                c++;
            }
        }

        // this happens if one array is done, and the other already has numbers.
        if (a == 10) { // if array 1 is completed
            while (b < 10) {
                array3[c] = array2[b]; // pass array2 elements to array3
                b++; // to move one position in the array which isn't empty
                c++; // to move one position in the final array
            }

        }

        if (b == 10) { // if array 2 is completed
            while (a < 10) {
                array3[c] = array2[a];
                a++; // to move one position in the array which isn't empty
                c++; // to move one position in the final array
            }

        }
 
        // shows final array
        for (int i = 0; i < 20; i++) {
            System.out.print(array3[i] + "-");
        }
    }
}
