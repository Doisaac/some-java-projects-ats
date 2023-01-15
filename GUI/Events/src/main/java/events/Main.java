package events;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int option;
        
        do {
            System.out.println("");
            System.out.println("[1] Window with action listener example");
            System.out.println("[2] Window with mouse listener example");
            System.out.println("[3] Window with mouse event example");
            System.out.println("[4] Window with mouse motion listener example");
            System.out.println("[5] Window with mouse wheel listener example");
            System.out.println("[6] Window with key listener example");
            System.out.println("\n-1 EXIT");

            System.out.print("\nSelect an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    //creates a window's object and make it visible
                    Window window1 = new Window();
                    window1.setVisible(true);
                    break;
                case 2:
                    Window2 window2 = new Window2();
                    window2.setVisible(true);
                    break;
                case 3:
                    Window3 window3 = new Window3();
                    window3.setVisible(true);
                    break;
                case 4:
                    Window4 window4 = new Window4();
                    window4.setVisible(true);
                    break;
                case 5:
                    Window5 window5 = new Window5();
                    window5.setVisible(true);
                    break;
                case 6: 
                    Window6 window6 = new Window6();
                    window6.setVisible(true);
                    break;
                case -1:
                    break;
                default:
                    System.out.println("\nPlease select a valid option");
                    break;
            }
        } while (option != -1);

    }

}
