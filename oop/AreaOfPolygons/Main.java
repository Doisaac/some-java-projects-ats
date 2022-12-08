/**
 * This program is able to calculate the area of polygons (Triangles and Rectangles).
 * At the end the program will show , the area and the data of each one.
 */
package AreaOfPolygons;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Polygon> polygons = new ArrayList<Polygon>();

    
    public static void fillTriangle(){
        
        double side1, side2, side3;
        
        System.out.print("\nEnter side 1: ");
        side1 = sc.nextDouble();
        
        System.out.print("Enter side 2: ");
        side2 = sc.nextDouble();
        
        System.out.print("Enter side 3: ");
        side3 = sc.nextDouble();
        
        Triangle triangle = new Triangle(side1, side2, side3);
        polygons.add(triangle);
    }
    
    public static void fillRectangle(){
        
        double side1, side2;
        
        System.out.print("\nEnter side 1: ");
        side1 = sc.nextDouble();
        
        System.out.print("Enter side 2: ");
        side2 = sc.nextDouble();
        
        
        Rectangle rectangle = new Rectangle(side1, side2);
        polygons.add(rectangle);
    }
    
    
    // method for fill a polygon
    public static void fillPolygon() {
        //menu atributes
        int menuOption;
        char addAnotherPolygon;
        
        do {

            do {
                System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                System.out.println("\tWhat polygon do you prefer?");

                System.out.println("1.  Triangle");
                System.out.println("2.  Rectangle");

                System.out.print("\nEnter an option: ");
                menuOption = sc.nextInt();
                
            } while (menuOption < 1 || menuOption > 2);
            
            switch(menuOption){
                case 1: // add a tringle
                    fillTriangle();
                    break;
                    
                case 2: // add a rectangle
                    fillRectangle();
                    break;
            }
            
            System.out.print("\nDo you want to enter another polygon? (s/n): ");
            addAnotherPolygon = sc.next().charAt(0);
            System.out.println("");
            
        } while (addAnotherPolygon == 's' || addAnotherPolygon == 'S');
    }
    
    
    public static void showPolygons (){
        for(Polygon pol : polygons){
            System.out.println(pol.toString());
            System.out.println("Area: " + pol.area());
        }
    }
    
    
    
    //Main
    public static void main(String[] args) {
        
        fillPolygon();
        
        // shows polygons
        showPolygons();
    }
}
