/*
 * You are in a cartesian plane, so first you enter you initial position,
   then you are able to move up,down,left and right, after any move the
   software shows you your new position
 */
package CartesianPlane;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plane p1;
        int x, y, option, step = 0;
        
        System.out.print("Please enter an initial position for x: ");
        x = sc.nextInt();
        
        System.out.print("\nPlease enter an initial position for y: ");
        y = sc.nextInt();
        
        p1 = new Plane(x, y);
        
        do{
            System.out.println("\n\t.:MENU:.");
            System.out.println("1. Move up");
            System.out.println("2. Move down");
            System.out.println("3. Move right");
            System.out.println("4. Move left");
            System.out.println("5. Exit");
            
            System.out.print("Enter an option: ");
            option = sc.nextInt();
            
            if(option != 5 && option > 0 && option < 5){
                System.out.println("\nEnter how many steps you want to move");
                step = sc.nextInt();
            }
            
            switch(option){
                case 1:
                    p1.moveUp(step);
                    break;
                
                case 2:
                    p1.moveDown(step);
                    break;
                case 3:
                    p1.moveRight(step);
                    break;
                case 4:
                    p1.moveLeft(step);
                    break;
                case 5: 
                    break;
                default: 
                    System.out.println("\n___________________________________");
                    System.out.println("Error, please select a valid option");
                    System.out.println("_____________________________________\n");
                    break;
            }
            
            System.out.println("\n"+p1.showPosition());
        } while(option != 5);
        
    }
    
}
