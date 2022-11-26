/**
 * Here I created the operations methods
 */
package BashCalculator;

public class Operation {
    
    // Addition method
    public Double sum( double num1, double num2){
        double operation = num1 + num2;
        return operation;
    }
    
    // Subtraction method
    public double rest(double num1, double num2){
        double rest = num1 - num2;
        return rest;
    }
    
    // Multiplication method
    public double multiplication(double num1, double num2){
        double multiplication = num1 * num2;
        return multiplication;
    }
    
    // Devision method
    public double division(double num1, double num2){
        double division = num1 / num2;
        return division;
    }
    
    //shows result
    public void showResults(double sum, double rest, double multiplication, double division){
        System.out.println("The sum is: " + sum);
        System.out.println("The rest is: " + rest);
        System.out.println("The multiplication is: " + multiplication);
        System.out.println("The division is: " + division);
    }
    
}
