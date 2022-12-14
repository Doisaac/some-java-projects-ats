/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirportSoftware;
import java.util.Scanner;
/**
 *
 * @author MrDoisaac
 */
public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    final static int numOfAirports = 4;
    
    static Airport airports[] = new Airport[numOfAirports];
    
    
    
    
    public static void main(String[] args) {
        insertAirportData(airports);
        menu();
        
        
    }
    
    
    // insert data of airports
    public static void insertAirportData(Airport airports[]){
        airports[0] = new PublicAirport(80000000, "Oscar A.Romero", "San Salvador", "El Salvador");
        airports[0].insertCompany(new Company("Avianca"));
        airports[0].insertCompany(new Company("LATAM"));
        airports[0].getCompany("Avianca").insertFlight(new Flight("IB20", "San Salvador", "Mexico", 150.90, 120));
        airports[0].getCompany("LATAM").insertFlight(new Flight("IB21", "Peru", "Los Angeles", 200.99, 120));
        airports[0].getCompany("Avianca").getFlight("IB20").insertPassanger(new Passenger("Douglas Barrera", "22025", "Salvadoreño"));
        airports[0].getCompany("LATAM").getFlight("IB21").insertPassanger(new Passenger("Carolina Barrera", "22026", "Salvadoreña"));
        
        airports[1] = new PublicAirport(500000,"Guarulhos", "San Pablo", "Brazil");
        airports[1].insertCompany(new Company("Avianca"));
        airports[1].insertCompany(new Company("LATAM"));
        airports[1].getCompany("Avianca").insertFlight(new Flight("IB24", "San Pablo", "Dubai", 900, 120));
        airports[1].getCompany("LATAM").insertFlight(new Flight("IB25", "San Pablo", "Texas", 500, 120));
        airports[1].getCompany("Avianca").getFlight("IB24").insertPassanger(new Passenger("Illy Brown", "IB88", "Ireland"));
        airports[1].getCompany("LATAM").getFlight("IB25").insertPassanger(new Passenger("Jhon Brown", "JB88", "Ireland"));
        
        airports[2] = new PrivateAirport("Aeropuerto Internacional El Dorado", "Bogotá", "Colombia");
        airports[2].insertCompany(new Company("Avianca"));
        airports[2].insertCompany(new Company("LATAM"));
        airports[2].getCompany("Avianca").insertFlight(new Flight("IB26", "Bogotá", "El Salvador", 500, 120));
        airports[2].getCompany("LATAM").insertFlight(new Flight("IB27", "Bogotá", "Mexico", 400, 120));
        airports[2].getCompany("Avianca").getFlight("IB26").insertPassanger(new Passenger("Isabel Matías", "IM55", "American"));
        airports[2].getCompany("LATAM").getFlight("IB27").insertPassanger(new Passenger("Carlos Perez", "CP88", "American"));
        // down casting for insert sponsor companies
        String companies[] = {"Nike", "Top G"};
        ((PrivateAirport)airports[2]).insertCompanies(companies);
        
                
        airports[3] = new PrivateAirport("Aeropuerto Internacional de Tocumen", "Ciudad de Panamá", "Panamá");
        airports[3].insertCompany(new Company("Avianca"));
        airports[3].insertCompany(new Company("LATAM"));
        airports[3].getCompany("Avianca").insertFlight(new Flight("IB28", "Ciudad de Panama", "LA USA", 800, 120));
        airports[3].getCompany("LATAM").insertFlight(new Flight("IB29", "Ciudad de Panama", "LA USA", 1200, 120));
        airports[3].getCompany("Avianca").getFlight("IB28").insertPassanger(new Passenger("Maria Lopez", "ML68", "Hondureña"));
        airports[3].getCompany("LATAM").getFlight("IB29").insertPassanger(new Passenger("Monica Restrepo", "MR78", "Salvadoreña"));
        String companies2[] = {"Nike", "Mexico Tour"};
        ((PrivateAirport)airports[3]).insertCompanies(companies2);
    }
    
    public static void menu(){
        
        int option;
        String airportName, companyName, homeTownCityName, destinationCityName;
        Airport airportFound;
        Company company; 
        
        do {
            System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-++");
            System.out.println("\t\t.:MENU:.");
            System.out.println("1. Display aiports (public and private)");
            System.out.println("2. Display companies (private) or government grant (public)");
            System.out.println("3. Display companies working in an airport");
            System.out.println("4. Display flights in a company");
            System.out.println("5. Display available flights from home towm to destination city");
            System.out.println("6. EXIT");
            
            System.out.print("\nSelect an option: ");
            option = sc.nextInt();
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-++");
            
            switch(option){
                case 1: // Display aiports (public and private
                    showAirports(airports);
                    break;
                    
                case 2: // Display companies (private) or government grant (public)
                    showCompanies(airports);
                    break;
                    
                case 3: // Display companies working in an airport
                    System.out.print("\nPlease enter the Airplane name: ");
                    sc.nextLine();
                    airportName = sc.nextLine();
                    airportFound = searchAirport(airportName, airports);
                    
                    if (airportFound == null){
                        System.out.println("SORRY, THAT AIRPORT DOESN'T EXIST");
                    } 
                    else {
                        showCompanies(airportFound);
                    }
                    break;
                    
                case 4: // Display flights in a company
                    System.out.print("\nPlease enter the Airplane name: ");
                    sc.nextLine();
                    airportName = sc.nextLine();
                    airportFound = searchAirport(airportName, airports);
                    
                    if (airportFound == null){
                        System.out.println("SORRY, THAT AIRPORT DOESN'T EXIST");
                    } 
                    else {
                        System.out.print("Enter the company name: ");
                        companyName = sc.nextLine();
                        company = airportFound.getCompany(companyName);
                        
                        if (company == null){
                            System.out.println("SORRY, THAT COMPANY DOESN'T EXIST");
                        }
                        else{
                            showFlights(company);
                        }
                    }
                    break;
                    
                case 5: // Availble flights from home towm to destination city
                    sc.nextLine();
                    System.out.print("\n\tPlease enter the home town city: ");
                    homeTownCityName = sc.nextLine();
                    
                    System.out.print("\n\tPlease enter the destination city: ");
                    destinationCityName = sc.nextLine();
                    showFlightsFromTownToDestinyCity(homeTownCityName, destinationCityName, airports);
                    
                    break;
                case 6: // EXIT
                    break;
                default:
                    System.out.println("PLEASE SELECT A VALID OPTION");
                    break;
                
            }
            
            
        } while(option != 6);
    }
    
    public static void showAirports(Airport airports[]){
        for(int i = 0; i < airports.length; i++){
            
            if (airports[i] instanceof PrivateAirport){
                System.out.println("\n\tPrivate Airport");
                System.out.println("Name: " + airports[i].getAirportName());
                System.out.println("City: " + airports[i].getAirportCity());
                System.out.println("Country: " + airports[i].getAirpotCountry());
            }
            else{
                System.out.println("\n\tPublic Airport");
                System.out.println("Name: " + airports[i].getAirportName());
                System.out.println("City: " + airports[i].getAirportCity());
                System.out.println("Country: " + airports[i].getAirpotCountry());
            }
        }
    }
    
    public static void showCompanies(Airport airports[]){
        String sponsoringCompanies[];
        double gGrant;
        for (int i = 0; i < airports.length; i++){
            
            if(airports[i] instanceof PrivateAirport){
                System.out.println("\n\tPrivate Airport");
                System.out.println("Name: " + airports[i].getAirportName());
                // downcasting for the array
                sponsoringCompanies = ((PrivateAirport)airports[i]).getSponsoringCompanies();
                System.out.println("\nSponsor Companies");
                for(int j = 0 ; j < sponsoringCompanies.length; j++){
                    System.out.println(sponsoringCompanies[j]);
                }
            }
            
            else {
                System.out.println("\n\tPublic Airport");
                System.out.println("Name: " + airports[i].getAirportName());
                gGrant = ((PublicAirport)airports[i]).getGovernmentGrant();
                System.out.println("Government Grant: " + gGrant);
            }
            
        }
        
    }
    
    public static Airport searchAirport (String airportName, Airport airports[]){
        boolean found = false;
        int i = 0;
        Airport airport = null;
        
        while ((!found) && (i < airports.length)){
            
            if ( (airportName.equals(airports[i].getAirportName())) ){
                found = true;
                airport = airports[i];
            }
            
            i++;
            
        }
        
        return airport;
    }
    
    public static void showCompanies (Airport airportFound){
        
        System.out.println("\n\tThe companies working in " + '"'+ airportFound.getAirportName() +'"');
        
        for (int i = 0; i < airportFound.getCompanyNumber(); i++){
            System.out.println(airportFound.getCompany(i).getName());
        }
    }
    
    public static void showFlights(Company companyName){
        Flight flight;
        System.out.println("\n\tThe available flights of the company " + '"' + companyName.getName() +'"');
        
        for (int i = 0; i < companyName.getFlightNumber(); i++){
            flight = companyName.getFlight(i);
            System.out.println("Identifier: " + flight.getIdentifier());
            System.out.println("Home Town: " + flight.getHomeTown());
            System.out.println("Destination City: " + flight.getDestinationCity());
            System.out.println("Price: " + flight.getPrice());
        }
        
    }
    
    
    public static Flight[] searchFlightsFromTowntoDestinyCity(String town, String destiny, Airport airports[]){
        
        Flight flight;
        int counter = 0;
        Flight flights[];
        
        for (int i = 0; i < airports.length; i++){ // road airports
            
            for (int j = 0; j < airports[i].getCompanyNumber(); j++){ // road the companies
                
                for (int k = 0; k < airports[i].getCompany(j).getFlightNumber(); k++){ // road the flights
                    
                    flight = airports[i].getCompany(j).getFlight(k);
                    if ( (town.equals(flight.getHomeTown()) && (destiny.equals(flight.getDestinationCity())) )){
                        counter++;
                    }
                    
                }
                
            }
        }
        
        flights = new Flight[counter];
        int q = 0;
        
        for (int i = 0; i < airports.length; i++){
            
            for (int j = 0; j < airports[i].getCompanyNumber(); j++){
                
                for ( int k = 0; k < airports[i].getCompany(j).getFlightNumber(); k++){
                   
                    flight = airports[i].getCompany(j).getFlight(k);
                    
                    if ( (town.equals(flight.getHomeTown())) && (destiny.equals(flight.getDestinationCity())) ){
                        flights[q] = flight;
                        q++;
                    }
                    
                }
               
            }
            
        }
        
        return flights;
    }
    
    
    public static void showFlightsFromTownToDestinyCity (String town, String destiny, Airport airports[]){
        
        Flight flights[] = searchFlightsFromTowntoDestinyCity(town, destiny, airports);
        
        if ( flights.length == 0){
            System.out.println("Sorry, there are not available flights");
        }
        else {
            
            System.out.println("\n\tAvailable Flights");
            
            for(int i = 0; i < flights.length; i++){
                System.out.println("\nIdentifier: " + flights[i].getIdentifier());
                System.out.println("Home Town: " + flights[i].getHomeTown());
                System.out.println("Destination: " + flights[i].getDestinationCity());
                System.out.println("Price: " + flights[i].getPrice());
            }
        }
        
    }
    
    
    
}
