/*
 * A package delivery company has several branches throughout the country.
   Each branch is defined by its branch number, address, and city. To 
   calculate the price it costs to send each package, the branches 
   take into account the price of the package and the priority, knowing 
   that a dollar per kilo is charged, 10 dollars more if the priority is high
   and 20 if it is express. Each package sent will have a reference number and 
   the ID of the person sending it.
 */
package Amazon;

import java.util.Scanner;

/**
 *
 * @author MrDoisaac
 */
public class Main {
    
    public static int searchOffice (BranchOffice offices[], int branchOffice, int branchCounter){
        int position = 0;
        boolean found = false;
        
        for(int i = 0; i < branchCounter; i++){
            if(offices[i].getBranchOfficeNumber() == branchOffice){
                found = true;
                position = i;
            }
        }
        
        if (found == false){
            position = -1;
        }
        
        return position;
    }
    
    public static int searchPackage (Package packages[], int numOfPackage, int packageCount){
        int position = 0;
        boolean found = false;
        
        for(int i = 0; i < packageCount; i++){
            if(packages[i].getNumOfPackage() == numOfPackage){
                found = true;
                position = i;
            }
        }
        
        if (found == false){
            position = -1;
        }
        
        return position;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // arguments to be asked
        int numOfPackage, branchOfficeNumber = 0, numOfBranchOffice,searchPackage;
        int officeCount = 0, packageCount = 0;
        int searchOffice;
        double price;
        String dni, direction, city;
        double weight;
        int priority, option = 0;

        BranchOffice offices[] = new BranchOffice[50];
        Package packages[] = new Package[100];
        
        do{
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("\t.:MENU:.");
            System.out.println("\n1. Create new Branch Office");
            System.out.println("2. Send new package");
            System.out.println("3. Check branch office");
            System.out.println("4. Check package"); 
            System.out.println("5. Show all branch-offices"); 
            System.out.println("6. Show all the packages"); 
            System.out.println("7. Exit");
            
            System.out.print("\nPlease select one option: ");
            option = sc.nextInt();
            
            switch(option){
                case 1:
                    System.out.print("\nEnter the branch office number: ");
                    branchOfficeNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the direction: ");
                    direction = sc.nextLine();
                    
                    
                    System.out.print("Enter the city: ");
                    city = sc.nextLine();
                    
                    offices[officeCount] = new BranchOffice(branchOfficeNumber, direction, city);
                    officeCount++;
                    
                    break;
                    
                case 2:
                    System.out.print("\nEnter the number of the branch office: ");
                    numOfBranchOffice = sc.nextInt();
                    
                    searchOffice = searchOffice(offices, numOfBranchOffice, officeCount);
                    
                    if(searchOffice == -1){
                        System.out.println("Sorry that branch office doesn't exist");
                        break;
                    } else {
                        System.out.print("\nEnter the package number: ");
                        numOfPackage = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("\nEnter the client DNI: ");
                        dni = sc.nextLine();
                        
                        System.out.print("\nEnter the weight: ");
                        weight = sc.nextDouble();
                        
                        System.out.print("\nEnter the priority: (0=normal) (1=hight) (2=express)");
                        priority = sc.nextInt();
                        
                        packages[packageCount] = new Package(numOfPackage, dni, weight, priority);
                        
                        price = offices[searchOffice].calcPrice(packages[packageCount]);
                        
                        packageCount++;
                        System.out.println("ACTION DONE CORRECTLY");
                        System.out.println("TOTAL $" + price);
                        break;
                    }
                case 3:
                    System.out.print("Enter the Branch Office number: ");
                    numOfBranchOffice = sc.nextInt();
                    
                    searchOffice = searchOffice(offices, numOfBranchOffice, officeCount);
                    
                    if(searchOffice == -1){
                        System.out.println("\nSorry that branch office doesn't exist");
                    } 
                    else{
                        System.out.println("\t\nThe branch office information");
                        System.out.println(offices[searchOffice].showBranchOfficeData());
                    }
                    break;
                
                case 4:
                    System.out.print("\nEnter the package number: ");
                    numOfPackage = sc.nextInt();
                    
                    searchPackage = searchPackage(packages, numOfPackage, packageCount);
                    
                    if(searchPackage == -1){
                        System.out.println("\nSorry that package doesn't exist");
                    }
                    else{
                        System.out.println("\n\tThe package information");
                        System.out.println(packages[numOfPackage].showPackageData());
                    }
                    
                case 5:
                    for (int i = 0; i < officeCount; i++){
                        System.out.println("\n\tBranch Office #" + (i+1));
                        System.out.println(offices[i].showBranchOfficeData());
                    }
                    break;
                case 6:
                    for (int i = 0; i < packageCount; i++){
                        System.out.println("\n\tPackage #" + (i+1));
                        System.out.println(packages[i].showPackageData());
                    }
                    break;
                    
                case 7:
                    break;
                
                default:
                    System.out.println("_____________________________");
                    System.out.println("Please select a valid option");
                    System.out.println("_____________________________");
            }
        } while(option != 7);
    }

}
