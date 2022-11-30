/*
 * Program to carry out procedures in a bank in which we will 
   have 2 classes (Customer and Account). Consider that a client is 
   characterized by his name, surname and ID. The client can check balance,
   as well as enter and withdraw money from their accounts. In addition, each 
   account is characterized by an account number and a balance.
 */
package SantaAnaBank;
import java.util.Scanner;
/**
 *
 * @author MrDoisaac
 */
public class Main {
    
    public static int searchAccount(Account accounts[], int n){
        
        int i = 0, indice = 0;
        boolean found = false;
        
        while(i < accounts.length && found == false){
            if ( accounts[i].getIdAccount() == n){
                found = true;
                indice = i;
            }
            i++;
        }
        
        
        if (found == false){
            indice = -1;
        }
        
        return indice;
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name, lastName;
        final int DUI;
        int accountNumber, nAccounts, option, accountSelected, accountIndice;
        double amount;
        
        Account accounts[];
        Client client1;
        
        System.out.println("\tClient Information");
        System.out.print("Client name: ");
        name = sc.nextLine();
        
        System.out.print("Client last name: ");
        lastName = sc.nextLine();
        
        System.out.print("Enter the client DUI: ");
        DUI = sc.nextInt();
        
        System.out.print("Enter how many accounts do you want?: ");
        nAccounts = sc.nextInt();
        
        accounts = new Account[nAccounts];
        
        for (int i = 0; i < accounts.length; i++){
            System.out.println("\n\tAccount #" + (i+1));
            System.out.println("Enter the account information");
            
            System.out.print("Account number: ");
            accountNumber = sc.nextInt();
            
            System.out.print("Inicial Amount: ");
            amount = sc.nextDouble();
            
            accounts[i] = new Account(accountNumber, amount);
        }
        
        client1 = new Client(name, lastName, DUI, accounts);
        
        do{
            System.out.println("\n*:*:*:*:*:*:*:*:*:*:*:*:*:*:*:*:*:");
            System.out.println("\t.:MENU:.");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Money");
            System.out.println("4. EXIT");
            
            System.out.print("\nPlease select an option: ");
            option = sc.nextInt();
            System.out.println("*:*:*:*:*:*:*:*:*:*:*:*:*:*:*:*:*:");
            
            switch(option){
                case 1:
                    System.out.print("\nPlease enter the account number: ");
                    accountSelected = sc.nextInt();
                    
                    accountIndice = searchAccount(accounts, accountSelected);
                    
                    if(accountIndice == -1){
                        System.out.println("\nSorry, that account number does not exist");
                    }
                    else{
                        System.out.println("\nPlease enter the amount to add in your account");
                        amount = sc.nextDouble();
                        
                        client1.addMoneyInAccount(accountIndice, amount);
                        
                        System.out.println("\nOPERATION DONE SUCCESSFULLY");
                        System.out.println("CURRENT AMOUNT: " + client1.checkMoneyInAccount(accountIndice));
                    }
                    
                    break;
                 
                case 2:
                    System.out.println("\nPlease enter the account number");
                    accountSelected = sc.nextInt();
                    
                    accountIndice = searchAccount(accounts, accountSelected);
                    
                    if(accountIndice == -1){
                        System.out.println("\nSorry, that account number does not exist");
                    }
                    else{
                        System.out.println("\nPlease enter the amount to withdraw");
                        amount = sc.nextDouble();
                        
                        if (amount > client1.checkMoneyInAccount(accountIndice)){
                            System.out.println("Sorry you don't have that amount");
                        }
                        else{
                            client1.withdrawMoneyInAccount(accountIndice, amount);
                            System.out.println("\nOPERATION DONE SUCCESSFULLY");
                            System.out.println("CURRENT AMOUNT: " + client1.checkMoneyInAccount(accountIndice));
                        }
                        
                    }
                    break;
                
                case 3:
                    System.out.println("\nPlease enter the account number");
                    accountSelected = sc.nextInt();
                    
                    accountIndice = searchAccount(accounts, accountSelected);
                    
                    if(accountIndice == -1){
                        System.out.println("\nSorry, that account number does not exist");
                    }
                    else {
                        System.out.println("\nCURRENT AMOUNT" + client1.checkMoneyInAccount(accountIndice));
                    }
                    break;
                    
                case 4:
                    break;
                
                default:
                    System.out.println("Please select a valid option");
                    break;
            }
            
        } while(option != 4);
        
    }
}
