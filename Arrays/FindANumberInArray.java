/*
 * Enter 10 numbers in an increasing way 
   in an array and then enter a number to find it.
 */
package com.douglas.projects;

import java.util.Scanner;


public class FindANumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[], number;
        boolean increasing = true;
        array = new int[10];
        
        do{
            System.out.println("Fill the array");
            
            //Insert array
            for(int i = 0; i<10; i++){
                System.out.println((i+1) + ".Enter a number: ");
                array[i] = sc.nextInt();
            }
            
            //validates if array is increasing
            for(int i = 0; i<9; i++){
                if(array[i] < array[i+1]){
                    increasing = true;
                }
                if(array[i] > array[i+1]){
                    increasing = false;
                    break;
                }
            }
            
            if(increasing == false){
                System.out.println("-------------------------");
                System.out.println("Enter an increasing array");
                System.out.println("__________________________\n");
            }
            
        }while(increasing == false);
        
        //read a number to search
        System.out.println("\nWhat number do you want to search?");
        number = sc.nextInt();
        
        //search number in the array
        int i = 0;
        while(i<10 && array[i]<number){
            i++;
        }
        
        if(i == 10){
            System.out.println("Number not found");
        }
        else{
            if(array[i] == number){
                System.out.println("\n Number found, in the position: " + i);
            }
            else{
                System.out.println("\nNumber not found");
            }
        }
        
        
       }
    }

