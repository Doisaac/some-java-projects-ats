package com.douglas.projects;

import java.util.Scanner;

public class BubbleMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int array[], numOfList;
        
        System.out.print("How many numbers do you want in  your list? : ");
        numOfList = sc.nextInt();
        
        array = new int[numOfList];
        
        //fill the array
        System.out.println("\nPlease complete the list");
        for(int i = 0; i < numOfList; i++){
            System.out.print("Enter number #" + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        
        //shows the original array
        System.out.println("\nYour original list is");
        for(int el : array){
            System.out.print(el + " - ");
        }
        System.out.println("");
        
        //sorting the array
        int aux;
        for(int v = 0; v < numOfList; v++){
            for(int i = 0; i < (numOfList-1); i++){
                if(array[i] > array[i+1]){
                aux = array[i+1];
                array[i+1] = array[i];
                array[i] = aux;
                }
            }
        }
        
        
        System.out.println("\nYour sorted list is");
        for (int i = 0; i < numOfList; i++) {
            System.out.print(array[i] + " ");
        }
        
    }
}
