package IsoscelesTriangle;

/**
 *
 * @author MrDoisaac
 */
public class IsoscelesTriangle {
    
    private double base;
    private double side;
    
    public IsoscelesTriangle(double base, double side){
        this.base = base;
        this.side = side;
    }
    
    // formula to get the perimeter of a triangle
    public double getPerimeter(){
        double perimeter = (2*side) + base;
        return perimeter;
    }
    
    // formula to get the area of a isosceles triangle
    public double getArea(){
        double area = (base*Math.sqrt(Math.pow(side, 2) - ((Math.pow(base, 2)) / 4) ))/2;
        return area;
    }
    
    public String getData(){
        return "Base: "+base+"\nSide: "+side+"\nPerimeter: "+getPerimeter()+"\nArea: " + getArea();
    }
}
