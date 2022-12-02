package Amazon;

/**
 *
 * @author MrDoisaac
 */
public class BranchOffice {
    //Atributes
    private int branchOfficeNumber;
    private String direction;
    private String city;
    
    //Constructor
    public BranchOffice(int branchOfficeNumber, String Direction, String City) {
        this.branchOfficeNumber = branchOfficeNumber;
        this.direction = Direction;
        this.city = City;
    }
    
    //Getters
    public int getBranchOfficeNumber() {
        return branchOfficeNumber;
    }

    public String getDirection() {
        return direction;
    }

    public String getCity() {
        return city;
    }
    
    public String showBranchOfficeData(){
        return "\nBranch Office Number: " + branchOfficeNumber
                + "\nDirection: " + direction
                + "\nCity: " + city;
    }
    
    // calculate price
    
    public double calcPrice(Package p){
        double price;
        price = p.getWeight();
        
        if(p.getPriority() == 1){
            price += 10;
        }
        else if(p.getPriority() == 2){
            price += 20;
        }
        return price;
    }
}
