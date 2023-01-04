package SomeExercises;

import java.util.Scanner;

public class FibonacciSeries {
    static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        System.out.print("How many numbers do you want?: ");
        int numbers = sc.nextInt();
        
        System.out.println("");
        FibonacciSeries(numbers);
    }
    
    /**
     * The fibonacci series starts with the numbers 0 and 1,
     * from these, each new term is the sum of the two previous
     * @param numOfElements The amount of numbers you want to be printed
     */
    public static void FibonacciSeries(int numOfElements){
        
        int numA = 0, numB = 1, sumAB = 0;
        
        System.out.println("The Fibonacci Series");
        
        for (int i = 0; i < numOfElements; i++) {
            System.out.print(numA + " ");
            sumAB = numA + numB;
            numA = numB;
            numB = sumAB;
        }
        
    }
}

