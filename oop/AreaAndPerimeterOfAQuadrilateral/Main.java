/*
 * Build a software which calculates the area and perimeter of a quadrilateral
   given the length of both sizes. If it is a square, you just give one size
   in the constuctor.
 */
package AreaAndPerimeterOfAQuadrilateral;

import javax.swing.JOptionPane;

/**
 *
 * @author MrDoisaac
 */
public class Main {
    
    public static void main(String[] args) {
        
        Quadrilateral q1;
        //ask for the sides
        float side1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the side number 1"));
        float side2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the side number 2"));
        
        if(side1 == side2){
            q1 = new Quadrilateral(side1);
        }
        else{
            q1 = new Quadrilateral(side1, side2);
        }
        
        JOptionPane.showMessageDialog(null, "The perimeter is: " + q1.getPerimeter() 
                + "\nThe area is: " + q1.getArea());
    }
}
