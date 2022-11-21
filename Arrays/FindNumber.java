/*
 * Enter 5 numbers, and then enter a number to be search in the array.
 */
package com.douglas.projects;

import java.util.Scanner;

public class FindNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];
        int sNumber, position = 0;
        boolean found = false;

        //fill array
        System.out.println("Please complete the list");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("What number do you want to find?");
        sNumber = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (numbers[position] == sNumber) {
                found = true;
                break;
            } else {
                position++;
            }
        }

        if (found == true) {
            System.out.println("***************************");
            System.out.println("Number found in position: " + position);
            System.out.println("***************************");
        }
        else{
            System.out.println("Sorry, that number is not in the list");
        }

    }
}
