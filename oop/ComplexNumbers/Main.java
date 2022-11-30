/*
 * Enter a complex number, then just choose an option.
 */
package ComplexNumbers;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ComplexNumber number1, number2, sum, mult, same;
        double a,b,c,d;
        int option, integer;
        
        do{
            System.out.println("\n\t.:Operations:.");
            System.out.println("1. Sum two complex numbers");
            System.out.println("2. Multiplicate two complex numbers");
            System.out.println("3. Compare two complex numbers");
            System.out.println("4. Multiplicate a complex number with an integer one");
            System.out.println("5. Exit");
            
            System.out.print("\nPlease select an option: ");
            option = sc.nextInt();
            
            switch(option){
                case 1: 
                    System.out.println("\nEnter the first complex number");
                    System.out.print("Enter the real number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter the imaginary number: ");
                    b = sc.nextDouble();
                    
                    System.out.println("\nEnter the Second complex number");
                    System.out.print("Enter the real number: ");
                    c = sc.nextDouble();
                    System.out.print("Enter the imaginary number: ");
                    d = sc.nextDouble();
                    
                    number1 = new ComplexNumber(a, b);
                    number2 = new ComplexNumber(c, d);
                    sum = number1.calcSum(number2);
                    System.out.println("The sum is: " + sum.getNum1()+" + " + sum.getImaginary() + "i");
                    break;
                    
                case 2:
                    System.out.println("\nEnter the first complex number");
                    System.out.print("Enter the real number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter the imaginary number: ");
                    b = sc.nextDouble();
                    
                    System.out.println("\nEnter the Second complex number");
                    System.out.print("Enter the real number: ");
                    c = sc.nextDouble();
                    System.out.print("Enter the imaginary number: ");
                    d = sc.nextDouble();
                    
                    number1 = new ComplexNumber(a, b);
                    number2 = new ComplexNumber(c, d);
                    mult = number1.calcMult(number2);
                    System.out.println("The multiplication is: " + mult.getNum1()+" + " + mult.getImaginary() + "i");
                    break;
                    
                case 3:
                    System.out.println("\nEnter the first complex number");
                    System.out.print("Enter the real number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter the imaginary number: ");
                    b = sc.nextDouble();
                    
                    System.out.println("\nEnter the Second complex number");
                    System.out.print("Enter the real number: ");
                    c = sc.nextDouble();
                    System.out.print("Enter the imaginary number: ");
                    d = sc.nextDouble();
                    
                    number1 = new ComplexNumber(a, b);
                    number2 = new ComplexNumber(c, d);
                    
                    if ( number1.calcSame(number2)){
                        System.out.println("They're the same complex numbers");
                    } else {
                        System.out.println("They aren't the same");
                    }
                    
                    break;
                case 4:
                    System.out.println("\nEnter the first complex number");
                    System.out.print("Enter the real number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter the imaginary number:");
                    b = sc.nextDouble();
                    
                    System.out.print("Enter an integer number: ");
                    integer = sc.nextInt();
                    
                    number1 = new ComplexNumber(a, b);
          
                    mult = number1.multiplicationWithAnInteger(integer);
                    System.out.println("The multiplication is: " + mult.getNum1()+" + " + mult.getImaginary() + "i");
                    break;
                    
                case 5:
                    break;
                
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
        } while(option != 5);
        
        
        
    }
}
