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
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;  
        }
    }
    public static void main(String [] args)
    {
    	
    }
}
