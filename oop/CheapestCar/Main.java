/*
 * In this software, you have to enter some cars with its brand,
   model and price. Finally The sotware will show you the cheapest.
 */
package CheapestCar;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class Main {
    
    // search the position of the cheapest car
    public static int getCheapestCar(Auto cars[]){
        int position = 0;
        float currentCheapest = cars[0].getPrice();
        
        for (int i = 1; i < cars.length; i++ ){
            if (cars[i].getPrice() < currentCheapest) {
                currentCheapest = cars[i].getPrice();
                position=i;
            }
        }
        return position;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String brand;
        String model;
        float price;
        int numberOfCars, cheapestCar;
        
        System.out.print("How many cars do you want to enter?: ");
        numberOfCars = sc.nextInt();
        
        // creates a new object for each car inside of an array
        Auto [] cars = new Auto[numberOfCars];
        
        // creates car by car
        for(int i = 0; i<cars.length; i++){
            System.out.println("\nPlease complete the information of car #" + (i+1));
            
            sc.nextLine();
            
            System.out.print("Enter the brand: ");
            brand = sc.nextLine();
            
            
            System.out.print("Enter the model: ");
            model = sc.nextLine();
            
            System.out.print("Enter the price: ");
            price = sc.nextFloat();
            
            cars[i] = new Auto(brand, model, price);
        }
        
        cheapestCar = getCheapestCar(cars);
        System.out.println(cars[cheapestCar].getData());
        
        
    }
    
}
