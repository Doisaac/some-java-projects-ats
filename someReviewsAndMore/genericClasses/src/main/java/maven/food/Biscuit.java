package maven.food;

public class Biscuit {
    
    private String brand;
    private String flavor;

    public Biscuit(String brand, String flavor) {
        this.brand = brand;
        this.flavor = flavor;
    }
    
    @Override
    public String toString(){
        return brand;
    }
}
