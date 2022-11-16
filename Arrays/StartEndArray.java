/*
 * This program accepts 10 numbers and save them in an array. Then it will 
   show you the fist element and the last one, then the second one and the 
   one previos the last one. in that order.
*/
package com.douglas.projects;
import java.util.Scanner;

public class StartEndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numbers [] = new int[10];
        
        for(int i = 0; i < 10; i++){
            System.out.print((i+1) + ".Enter a number: ");
            numbers[i] = sc.nextInt();
        }
        
        int b = 0, a = 9;
        // show array 
        for(int i = 0; i<5; i++){
            System.out.print(numbers[b] + " ");
            System.out.print(numbers[a] + " ");
            b++;
            a--;
        }
        
    }
}
