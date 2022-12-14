/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirportSoftware;

/**
 *
 * @author MrDoisaac
 */
public class PublicAirport extends Airport {
    
    private double governmentGrant;
   
    public PublicAirport(String airportName, String airportCity, String airpotCountry) {
        super(airportName, airportCity, airpotCountry);
    }

    public PublicAirport(double governmentGrant, String airportName, String airportCity, String airpotCountry, Company[] companies) {
        super(airportName, airportCity, airpotCountry, companies);
        this.governmentGrant = governmentGrant;
    }

    public PublicAirport(double governmentGrant, String airportName, String airportCity, String airpotCountry) {
        super(airportName, airportCity, airpotCountry);
        this.governmentGrant = governmentGrant;
    }
    
    public double  getGovernmentGrant(){
        return governmentGrant;
    }
    
}
