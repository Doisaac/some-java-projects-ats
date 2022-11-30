package SantaAnaBank;
/**
 *
 * @author MrDoisaac
 */
public class Account {
    
    private int idAccount;
    private double money;
    
    public Account (int id_account, double money){
        this.idAccount = id_account; ;
        this.money = money;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public double getMoney() {
        return money;
    }
    
    public void addMoney(double amount){
        this.money += amount;
    }
    
    public void withdrawMoney(double amount){
        this.money -= amount;
    }
    
    
}
