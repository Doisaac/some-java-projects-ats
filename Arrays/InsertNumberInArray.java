/*
 * Read 5 int elements ordered in a increasing way. Then it reads a number
   and insert it, in the correct position in order to keep the array in a
   increasing way.
*/
package com.douglas.projects;

import java.util.Scanner;


public class InsertNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean increasing = true;
        
        int numbers[] = new int[10];
        int newNumber, position = 0, j=0;
        
        do{
            System.out.println("Insert 5 numbers");
            //Asks for 5 numbers
            for(int i = 0; i <5; i++){
                System.out.print("Number #" + (i+1) +": ");
                numbers[i] = sc.nextInt();
            }
            
            //validate if the array is increasing
            for(int i = 0; i<4; i++){
                
                // the previos number is less than the next one [1] < [2]
                if(numbers[i] < numbers[i+1]){
                    increasing = true;
                }
                
                // the previos number is higher than the next one [2] > [1]
                if(numbers[i] > numbers[i+1]){
                    increasing = false;
                    break;
                }
            }
            
            //message if you did not enter a correct array
            if( (increasing == false) ){
                System.out.println("--------------------------------------------------");
                System.out.println("The array isn't increasing, please enter it again");
                System.out.println("--------------------------------------------------\n");
            }
            
        } while( increasing == false);
        
        // enter a number to insert into the array
        System.out.println("Enter a new number to insert it");
        newNumber = sc.nextInt();
        
        // this cicle determines where the new the number has to be
        while(numbers[j] < newNumber && j<5){
            position++;
            j++;
        }
        
        // move one position 
        for(int i = 4; i>=position; i--){
            numbers[i+1] = numbers[i];
        }
        
        numbers[position] = newNumber;
        
        //shows new array
        for(int i = 0; i < 6; i++){
            System.out.print(numbers[i] + "-");
        }
    }
}
