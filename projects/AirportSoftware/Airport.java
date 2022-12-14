package AirportSoftware;

/**
 *
 * @author MrDoisaac
 */
public class Airport {
    
    private String airportName;
    private String airportCity;
    private String airpotCountry;
    private Company companies[] = new Company[10];
    private int companyNumber;

    public Airport(String airportName, String airportCity, String airpotCountry) {
        this.airportName = airportName;
        this.airportCity = airportCity;
        this.airpotCountry = airpotCountry;
        this.companyNumber = 0;
    }
    
    public Airport(String airportName, String airportCity, String airpotCountry, Company companies[]) {
        this.airportName = airportName;
        this.airportCity = airportCity;
        this.airpotCountry = airpotCountry;
        this.companies = companies;
        this.companyNumber = companies.length;
    }
            
    // insert individual company
    public void insertCompany(Company company){
        companies[companyNumber] = company; 
        companyNumber++;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getAirportCity() {
        return airportCity;
    }

    public String getAirpotCountry() {
        return airpotCountry;
    }

    public Company[] getCompanies() {
        return companies;
    }

     public int getCompanyNumber() {
        return companyNumber;
    }
    
    // get company by position
    public Company getCompany(int i){
        return companies[i];
    }
    
    // get company by name
    public Company getCompany (String nombre){
        boolean found = false;
        int i = 0;
        Company company = null;
        
        while ((!found) && (i < companyNumber)){
            
            if ( nombre.equals(companies[i].getName())){
                found = true;
                company = companies[i];
            }
            i++;
        }
        
        return company;
    }
    
    
}
