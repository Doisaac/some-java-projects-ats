
package maven.genericclasses;
import maven.food.*;

/**
 *
 * @author MrDoisaac
 */
public class GenericClasses {

    public static void main(String[] args) {
        
        // creates new bags with different type of objects
        Bag<Chocolate> bag1 = new Bag<>();
        Bag<Biscuit> bag2 = new Bag<>();
        
        // add elements to the bag that can contains chocolate
        bag1.addElement(new Chocolate("Mr. Beast", false));
        bag1.addElement(new Chocolate("Hershey's", true));
        
        // add elements to the bag that can contains biscuits (cookies)
        bag2.addElement(new Biscuit("Principe", "Lemon"));
        bag2.addElement(new Biscuit("Oreo", "Chocolate"));
        
        //  print the elements of both bags
        System.out.println("List of the bag #1: " + bag1.getList());
        System.out.println("List of the bag #2: " + bag2.getList());
        
    }
}
