/*
 * This is a program which shows the product of the first 10 odd numbers
*/
package com.douglas.projects;

public class ProductOddNumbers {
    
    public static void main(String[] args) {
        
        long product = 1;
        
        for(int i = 1; i<= 20; i+=2){
            product *= i;
        }
        
        System.out.println("The product is: " + product);
    }
    
}
