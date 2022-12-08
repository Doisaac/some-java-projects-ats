package AreaOfPolygons;

/**
 *
 * @author MrDoisaac
 */
public class Triangle extends Polygon {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        super(3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
    @Override
    public String toString(){
       return "\n\tTriangle" +
                "\n" + super.toString() +
                "\nSide 1: " + side1 +
                "\nSide 2: " + side2 +
                "\nSide 3: " + side3;
    }
    
    @Override
    public double area(){
        double sum = (side1 + side2 + side3) / 2;
        
        double result = Math.sqrt( (sum*(sum-side1)) * (sum-side2) * (sum-side3) );
        
        return result;
    }
    
    
    
    
}
