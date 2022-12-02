package Amazon;

/**
 *
 * @author MrDoisaac
 */
public class Package {
    
    //Atributes
    private int numOfPackage;
    private String dni;
    private double weight;
    private int priority;
    
    //Constructor
    public Package(int numOfPackage, String dni, double weight, int priority) {
        this.numOfPackage = numOfPackage;
        this.dni = dni;
        this.weight = weight;
        this.priority = priority;
    }
    
    // Getters
    public int getNumOfPackage(){
        return numOfPackage;
    }

    public String getDni() {
        return dni;
    }

    public double getWeight() {
        return weight;
    }

    public int getPriority() {
        return priority;
    }
    
    public String showPackageData(){
        return "\nPackage number: " + numOfPackage
                + "\nDNI: " + dni
                + "\nWeight: " + weight
                + "\nPrioriry: " + priority;
    }
    
    
}
