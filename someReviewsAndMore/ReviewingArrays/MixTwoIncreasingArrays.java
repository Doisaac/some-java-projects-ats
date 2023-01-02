// Enter two arrays, then the softwares mixes them in a new array but bieng always in an increasing way
package ReviewingArrays;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class MixTwoIncreasingArrays {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers1 = new int[10];
        int[] numbers2 = new int[10];
        int[] finalArray = new int[20];

        boolean increasing = true;

        do {
            // fills  the array numbers1
            System.out.println("Please fill the list #1");
            for (int i = 0; i < numbers1.length; i++) {
                System.out.print("Enter number #" + (i + 1) + ": ");
                numbers1[i] = sc.nextInt();
            }

            //checks if it is increasing
            for (int i = 0; i < (numbers1.length - 1); i++) {
                if (numbers1[i] > numbers1[i + 1]) {
                    increasing = false;
                    break;
                }
                else {
                    increasing = true;
                }
            }
            System.out.println("");
        } while (increasing == false);

        do {
            // fills  the array numbers1
            System.out.println("Please fill the list #2");
            for (int i = 0; i < numbers2.length; i++) {
                System.out.print("Enter number #" + (i + 1) + ": ");
                numbers2[i] = sc.nextInt();
            }

            //checks if it is increasing
            for (int i = 0; i < (numbers2.length - 1); i++) {
                if (numbers2[i] > numbers2[i + 1]) {
                    increasing = false;
                    break;
                }
                else{
                    increasing = true;
                }
            }
            System.out.println("");
        } while (increasing == false);

        int i = 0; // tours numbers1
        int j = 0; // tours numbers2
        int k = 0; // tours finalArray

        while ( i< 10 && j < 10 ) {

            if (numbers1[i] < numbers2[j]) {
                finalArray[k] = numbers1[i];
                i++;
            } else {
                finalArray[k] = numbers2[j];
                j++;
            }

            k++;

        }

//         in this case numbers1 ends first. So we fill with numbers2
        if (i == 10) {
            while (j < 10) {
                finalArray[k] = numbers2[j];
                k++;
                j++;
            }
        }
        else { // means numbers2 is completed, so we fill it with numbers1
            while(i < 10){
                finalArray[k] = numbers2[i];
                k++;
                i++;
            }
        }
        
        System.out.println("\nThe new mix Array is");
        for ( int e: finalArray){
            System.out.print(e + " ");
        }

    }
}
