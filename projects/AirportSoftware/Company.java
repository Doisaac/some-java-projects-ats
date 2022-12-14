package AirportSoftware;

/**
 *
 * @author MrDoisaac
 */
public class Company {
    
    private String name;
    private Flight flights[] = new Flight[10];
    private int flightNumber = 0;
    
    public Company(String name){
        this.name = name;
    }

    public Company(String name, Flight flights[]) {
        this.name = name;
        this.flights = flights;
        this.flightNumber = flights.length;
    }
    
    public void insertFlight(Flight flight){
        flights[flightNumber]  = flight;
        flightNumber++;
    }

    public String getName() {
        return name;
    }

    public int getFlightNumber() {
        return flightNumber;
    }
    
    // get flight by number
    public Flight getFlight(int i){
        return flights[i];
    }
    
    // get flight by identifier
    
    public Flight getFlight (String identifier){
        
        int i = 0;
        boolean found = false;
        Flight flight = null;
        
        // sequential search
        while ( (!found) && (i < flightNumber) ){
            
            if ( (identifier.equals(flights[i].getIdentifier()) ) ){
                found = true;
                flight = flights[i];
            }
            
            i++;
        }
        
        return flight;
    }
    
    
}
