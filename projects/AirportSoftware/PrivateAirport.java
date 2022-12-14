package AirportSoftware;

/**
 *
 * @author MrDoisaac
 */
public class PrivateAirport extends Airport {
    
    private String sponsoringCompanies [] = new String[10];
    private int spongCompaniesNumber;

    public PrivateAirport(String airportName, String airportCity, String airpotCountry) {
        super(airportName, airportCity, airpotCountry);
    }

    public PrivateAirport(String airportName, String airportCity, String airpotCountry, Company[] companies, String [] sponsoringCompanies) {
        super(airportName, airportCity, airpotCountry, companies);
        this.sponsoringCompanies = sponsoringCompanies;
        this.spongCompaniesNumber = sponsoringCompanies.length;
    }
    
    public void insertCompanies(String[] companies){
        this.sponsoringCompanies = companies;
        this.spongCompaniesNumber = companies.length;
    }
    
    public void insertCompany(String company){
        sponsoringCompanies[spongCompaniesNumber] = company;
        spongCompaniesNumber++;
    }

    public String[] getSponsoringCompanies() {
        return sponsoringCompanies;
    }
    
    public int getCompany() {
        return spongCompaniesNumber;
    }
    
          
    
}
