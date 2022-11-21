package com.douglas.projects;

import java.util.Scanner;


class SearchANumber2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int array[], numOfArray, numToFind, position = 0;
        boolean found = false, increasing = true;

        System.out.print("how many numbers do you want to enter?  ");
        numOfArray = sc.nextInt();

        array = new int[numOfArray];

        do {
            System.out.println("\nPlease fill the list");
            for (int i = 0; i < numOfArray; i++) {
                System.out.print("Enter number #" + (i + 1) + ": ");
                array[i] = sc.nextInt();
            }
            
            //conditions that evaluates if the array is in an increasing order
            for(int i = 0; i < (numOfArray-1); i++){
                
                if(array[i] < array[i+1]){
                    increasing = true;
                }
                else{
                    increasing = false;
                    break;
                }
                
            }
            
            if(increasing == false){
                System.out.println("\nPlease enter an increasing list");
            }
            
        } while(increasing == false);
            
        //number to search
        System.out.println("\nNow enter a number for search it in the list");
        numToFind = sc.nextInt();

        //Search the number in the array
        for (int i = 0; i < numOfArray; i++) {
            if (array[i] != numToFind) {
                position++;
            } 
            else if (numToFind == array[i]) {
                found = true;
                break;
            }
        }

        if (found == true) {
            System.out.println("\nNumber found. The numbers was found in the position: " + '"' + position + '"');
        }
        else{
            System.out.println("Sorry that number is not in the list");
        }

    }
}
