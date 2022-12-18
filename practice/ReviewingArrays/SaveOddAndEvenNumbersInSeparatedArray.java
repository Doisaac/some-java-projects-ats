package ReviewingArrays;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class SaveOddAndEvenNumbersInSeparatedArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] unorderedNumbers = new int[10];
        int[] evenNumbers;
        int[] oddNumbers;
        int evenCount = 0, oddCount = 0, ep = 0, op = 0 ;

        System.out.println("Please enter the numbers");
        for (int i = 0; i < unorderedNumbers.length; i++) {
            System.out.print("Please enter number #" + (i + 1) + ": ");
            unorderedNumbers[i] = sc.nextInt();
        }

        // check the length of the arrays
        for (int i = 0; i < unorderedNumbers.length; i++) {

            if (unorderedNumbers[i] % 2 == 0) {
                evenCount++;
            } else if (unorderedNumbers[i] % 2 != 0) {
                oddCount++;
            }

        }
        
        // initialized both arrays
        evenNumbers = new int[evenCount];
        oddNumbers = new int[oddCount];

        // fill the arrays
        for (int i = 0; i < unorderedNumbers.length; i++) {

            if (unorderedNumbers[i] % 2 == 0) {
                evenNumbers[ep] = unorderedNumbers[i];
                ep++;
            } 
            else if (unorderedNumbers[i] % 2 != 0) {
                oddNumbers[op] = unorderedNumbers[i];
                op++;
            }

        }
        
        //show both arrays
        
        System.out.println("\nEven numbers");
        for(int e: evenNumbers){
            System.out.print(e + " ");
        }
        
        System.out.println("\nOdd numbers");
        for(int e: oddNumbers){
            System.out.print(e + " ");
        }
        

    }
}
