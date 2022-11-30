package CartesianPlane;

/**
 *
 * @author MrDoisaac
 */
public class Plane {
    
    private int x;
    private int y;
    
    /**
     * Sets the initial position 
     * @param x position of x
     * @param y position of y
     */
    public Plane(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void moveUp(int value){
        y += value;
    }
    
    public void moveDown(int value){
        y -= value;
    }
    
    public void moveRight(int value){
        x += value;
    }
    
    public void moveLeft(int value){
        x -= value;
    }
    
    public int getY(){
        return y;
    }
    
    public int getX(){
        return x;
    }
    
    public String showPosition(){
        return "Your current position (x,y) is (" + x + "," + y +")";
    }
}
