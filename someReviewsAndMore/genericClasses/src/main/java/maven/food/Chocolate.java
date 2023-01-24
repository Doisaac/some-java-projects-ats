package maven.food;

public class Chocolate {
    
    private String brand;
    private boolean hasSugar;

    public Chocolate(String brand, boolean hasSugar) {
        this.brand = brand;
        this.hasSugar = hasSugar;
    }
    
    @Override
    public String toString(){
        return brand;
    }
}
