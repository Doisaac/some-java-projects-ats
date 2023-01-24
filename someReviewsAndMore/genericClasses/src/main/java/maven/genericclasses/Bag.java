package maven.genericclasses;
import java.util.ArrayList;

// generic class that will help us to saving differents kind of objects
public class Bag<E> {
    
    /**
     * creates an array list of the type of data we will
       define when we instantiate the class
     */ 
    private ArrayList<E> list = new ArrayList<>();
    
    /**
     * Allows us add a new object into the list
     * @param object the object to add to the list
     */
    public void addElement(E object){
        list.add(object);
    }
    
    /**
     * Returns us the complete list
     * @return 
     */
    public ArrayList<E> getList(){
        return list;
    }
    
    
}
