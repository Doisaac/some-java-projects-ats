package AreaOfPolygons;

/**
 *
 * @author MrDoisaac
 */
public abstract class Polygon {
    
    protected int numOfSides;

    public Polygon(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public int getNumOfSides() {
        return numOfSides;
    }
    
    // Declarates the method for calculate the area 
    public abstract double area();
       
    
    @Override
    public String toString(){
        return "The number of sides is: " + numOfSides;
    }
}
