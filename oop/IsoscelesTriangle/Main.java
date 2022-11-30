/*
 * Enter a number of triangles to insert into the array, then enter the 
   information requested. The software will you the triangle with the 
   highest area next to its information.
 */
package IsoscelesTriangle;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class Main {
    
    /**
     * Enter an array of runners
     * @param triangles
     * @return the highestArea
     */
    public static double getHighestArea(IsoscelesTriangle triangles[]){
        double area = triangles[0].getArea();
        
        for(int i = 1; i < triangles.length; i++){
            if(triangles[i].getArea() > area){
                area  = triangles[i].getArea();
            }
        }
        return area;
    }
    
    public static int getInformationOfHighest(IsoscelesTriangle triangles[]){
        int position = 0;
        double area = triangles[0].getArea();
        
        for(int i = 1; i < triangles.length; i++){
            if(triangles[i].getArea() > area){
                area  = triangles[i].getArea();
                position = i;
            }
        }
        return position;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double base,side;
        int numTriangles;
        
        System.out.print("How many isosceles triangles do  you want?: ");
        numTriangles = sc.nextInt();
        
        IsoscelesTriangle [] triangles = new IsoscelesTriangle[numTriangles];
        
        for ( int i = 0; i < triangles.length; i++){
            System.out.print("\n\tPlease enter information for triangle #" + (i+1) +": ");
            
            System.out.print("\nEnter the base: ");
            base = sc.nextDouble();
            
            System.out.print("Enter a side: ");
            side = sc.nextDouble();
            
            triangles[i] = new IsoscelesTriangle(base, side);
            
            System.out.println("\nThe perimeter is: " + triangles[i].getPerimeter());
            System.out.println("The area is: " + triangles[i].getArea());
        }
        
        System.out.println("________________________________________________________");
        System.out.println("\n\tThe highest area is: " + getHighestArea(triangles));
        System.out.println("________________________________________________________");
        
        System.out.println("\nInformation of the highest triangle");
        System.out.println(triangles[getInformationOfHighest(triangles)].getData());
    }
}
