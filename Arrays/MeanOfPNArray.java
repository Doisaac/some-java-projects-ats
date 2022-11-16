/*
 * This software allow you type 5 numbers in an array, and in the end
   it will show you the mean of positive numbers, the mean of negative 
   numbers and how many zeros are there.
 */
package com.douglas.projects;

import java.util.Scanner;

public class MeanOfPNArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0, negativeCount = 0, zeros = 0, pSum = 0, nSum = 0;
        float pmean, nmean;

        short numbers[] = new short[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ".Enter a number: ");
            numbers[i] = sc.nextShort();

            if (numbers[i] > 0) {
                pSum += numbers[i];
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
                nSum += numbers[i];
            } else {
                zeros++;
            }

        }

        if (positiveCount == 0) {
            System.out.println("You can't have an avarage");
        } else {
            pmean = (float)   pSum / positiveCount;
            System.out.println("\nThe average of positive numbers is: " + pmean);
        }

        if (negativeCount == 0) {
            System.out.println("You can't have an avarage");
        } else {
            nmean = (float) nSum / negativeCount ;
            System.out.println("The average of negative numbers is: " + nmean);
        }

        System.out.println("The number of zeros is: " + zeros);

    }
}
