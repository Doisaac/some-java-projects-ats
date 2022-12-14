package AirportSoftware;

/**
 *
 * @author MrDoisaac
 */
public class Passenger {
    
    private String fullName;
    private String passport;
    private String nationality;
    
    /**
     * Creates a new passenger  
     * @param fullName 
     * @param passport
     * @param nationality 
     */
    public Passenger(String fullName, String passport, String nationality) {
        this.fullName = fullName;
        this.passport = passport;
        this.nationality = nationality;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassport() {
        return passport;
    }

    public String getNationality() {
        return nationality;
    }
    
    
    
}
