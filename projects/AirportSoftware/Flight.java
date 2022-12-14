package AirportSoftware;

/**
 *
 * @author MrDoisaac
 */
public class Flight {
    
    private String identifier;
    private String homeTown;
    private String destinationCity;
    
    private double price;
    
    private int maxNumOfPassengers;
    private int currentNumberOfPassengers;
    
    private Passenger passengers[];

    public Flight(String identifier, String homeTown, String destinationCity, double price, int maxNumOfPassengers) {
        this.identifier = identifier;
        this.homeTown = homeTown;
        this.destinationCity = destinationCity;
        this.price = price;
        this.maxNumOfPassengers = maxNumOfPassengers;
        this.currentNumberOfPassengers = 0;
        this.passengers = new Passenger[maxNumOfPassengers];
    }
    
    public void insertPassanger(Passenger p){
        passengers[currentNumberOfPassengers] = p;
        currentNumberOfPassengers++;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxNumOfPassengers() {
        return maxNumOfPassengers;
    }

    public int getCurrentNumberOfPassengers() {
        return currentNumberOfPassengers;
    }
    
    
    // get passenger by position
    public Passenger getPassenger(int i){
        return passengers[i];
    }
    
    // get passenger by passport
    public Passenger getPassenger(String passport){
        
        boolean found = false;
        int i = 0;
        Passenger pas = null;
       
        // sequential search
        while ( (!found) && (i < currentNumberOfPassengers)){
            
            if ( passport.equals(passengers[i].getPassport())){
                found = true;
                pas = passengers[i];
            }
            i++;
        }
        return pas;
        
    }
    
    
}
