package SantaAnaBank;

/**
 *
 * @author MrDoisaac
 */
public class Client {
    private String name;
    private String lastName;
    private final int DUI;
    Account [] accounts;

    public Client(String name, String lastName, int DUI, Account[] accounts) {
        this.name = name;
        this.lastName = lastName;
        this.DUI = DUI;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDUI() {
        return DUI;
    }
    
    public double checkMoneyInAccount(int n){
        return accounts[n].getMoney();
    }
    
    public void addMoneyInAccount(int n, double amount){
        accounts[n].addMoney(amount);
    }
    
    public void withdrawMoneyInAccount(int n, double amount){
        accounts[n].withdrawMoney(amount);
    }
    
}
