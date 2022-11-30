package AreaAndPerimeterOfAQuadrilateral;

public class Quadrilateral {
    //Atributes
    private float side1;
    private float side2;
    
    //Constructors
    /**
     * 
     * @param s1 side number 1
     * @param s2 side number 2
     */
    public Quadrilateral(float s1, float s2){
        this.side1 = s1;
        this.side2 = s2;
    }
    
    /**
     * Use this when you have a square Quadrilateral 
     * @param s1 length of both sizes
     */
    public Quadrilateral(float s1){
        this.side1 = this.side2 = s1;
    }
    
    // getters  
    public float getPerimeter(){
        float perimeter = 2*(side1+side2);
        return perimeter;
    }
    
    public float getArea(){
        float area = (side1 * side2);
        return area;
    }
}
