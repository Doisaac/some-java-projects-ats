package SomeExercises;

import java.util.Scanner;

public class AsteriskFigures {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int option;
        do {
            System.out.println("--------------------------");
            System.out.println("1. Square");
            System.out.println("2. Triangle");
            System.out.println("3. Inverted Triangle");
            System.out.println("4. Triangle With Spaces");
            System.out.println("5. Complete Triangle");
            System.out.println("6. Reverted Complete Triangle");
            System.out.println("7. Diamond");
            System.out.println("8. Unfilled Square");
            System.out.println("");
            System.out.println("-1. exit");
            System.out.println("--------------------------");

            // choose an option
            System.out.print("Choose an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    square();
                    break;
                case 2:
                    triangle();
                    break;
                case 3:
                    invertedTriangle();
                    break;
                case 4:
                    triangleWithSpaces();
                    break;
                case 5:
                    completeTriangle();
                    break;
                case 6:
                    revertedCompleteTriangle();
                    break;
                case 7:
                    diamond();
                    break;
                case 8:
                    unfilledSquare();
                    break;
                case -1:
                    System.out.println("THANK YOU, SEE YOU!");
                    break;
                default:
                    System.out.println("PLEASE SELECT A VALID OPTION");
            }
        } while (option != -1);
    }

    public static void square() {
        System.out.print("How many rows do you want?: ");
        int row = sc.nextInt();

        System.out.println("\nSquare");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void triangle() {
        System.out.print("How many rows do you want?: ");
        int row = sc.nextInt();

        System.out.println("\nTriangle");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void invertedTriangle() {
        System.out.print("How many rows do you want?: ");
        int row = sc.nextInt();

        System.out.println("\nInverted Triangle");
        for (int i = 0; i < row; i++) {
            for (int j = (row - i); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void triangleWithSpaces() {
        System.out.print("How many rows do you want?: ");
        int row = sc.nextInt();

        System.out.println("\nTriangle With spaces");
        for (int i = 0; i < row; i++) {

            // blank spaces
            for (int j = (row - i); j > 0; j--) {
                System.out.print(" ");
            }

            // asterisks
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    public static void completeTriangle() {
        System.out.print("How many rows do you want?: ");
        int row = sc.nextInt();

        System.out.println("\nComplete Triangle");

        //row
        for (int i = 0; i < row; i++) {

            // spaces
            for (int j = 0; j < (row - i); j++) {
                System.out.print(" ");
            }

            // asterisks
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            // new line
            System.out.println(" ");
        }
    }

    public static void revertedCompleteTriangle() {
        System.out.print("How many rows do you want?: ");
        int row = sc.nextInt();

        System.out.println("\nReverted Triangle");

        //row
        for (int i = 0; i < row; i++) {

            // spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            // asterisks
            for (int k = (row - i); k > 0; k--) {
                System.out.print("* ");
            }

            // new line
            System.out.println(" ");
        }
    }

    public static void diamond() {
        System.out.print("How many rows do you want?: ");
        int row = sc.nextInt();

        System.out.println("\nDiamond");

        //row
        for (int i = 0; i < row; i++) {

            // spaces
            for (int j = 0; j < (row - i); j++) {
                System.out.print(" ");
            }

            // asterisks
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            // new line
            System.out.println(" ");
        }

        // below part
        for (int i = 0; i < row; i++) {

            // spaces
            for (int j = 0; j <= i + 1; j++) {
                System.out.print(" ");
            }

            // asterisks
            for (int k = (row - i - 1); k > 0; k--) {
                System.out.print("* ");
            }

            // new line
            System.out.println(" ");
        }

    }

    public static void unfilledSquare() {
        System.out.print("How many rows do you want?: ");
        int row = sc.nextInt();

        System.out.println("\nUnfilled Square");
        
        // top line
        for (int i = 0; i < row; i++) {
            System.out.print("* ");
        }
        // new line
        System.out.println();
        
        // center
        for (int i = 0; i < (row-2); i++) {
            
            System.out.print("* ");
            
            // blank spaces
            for (int j = 0; j < (row-2); j++) {
                System.out.print("  ");
            }
            System.out.println("*");
            
        }
        
        
        // bottom line
        for (int i = 0; i < row; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        
    }

}

