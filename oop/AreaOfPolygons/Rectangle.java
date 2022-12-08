package AreaOfPolygons;

/**
 *
 * @author MrDoisaac
 */
public class Rectangle extends Polygon{
    
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        super(2);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }
    
    @Override
    public String toString() {
        return "\n\tRectangle" +
                "\n" + super.toString() +
                "\nSide 1: " + side1 +
                "\nSide 2: " + side2;
    }
    
    @Override
    public double area(){
        return side1 * side2;
    }
    
    
    
    
}
