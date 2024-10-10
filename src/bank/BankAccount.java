package bank;

public class BankAccount {
    private double balance;
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false; 
        }
    }
}
