package CheapestCar;

/**
 *
 * @author MrDoisaac
 */
public class Auto {
    private String brand;
    private String model;
    private float price;
    
    /**
     * Sets the values of a new Car
     * @param brand Car's Brand
     * @param model Car's Model
     * @param price Car's Price
     */
    public Auto(String brand, String model, float price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    public float getPrice(){
        return price;
    }
    
    public String getData(){
        return "\n\tThe cheapest Car \nBrand: " + brand + "\nModel: " + model + "\nPrice: " + price + "\n"; 
    }
    
    
}
