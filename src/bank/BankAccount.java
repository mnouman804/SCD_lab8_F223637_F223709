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

	public BankAccount(double val) {
		this.balance = val;
	}

	public double accountBalance() {
		return this.balance;
	}

	public static void main(String[] args) {

		BankAccount account = new BankAccount(1000.00);

		System.out.println("Initial balance: " + account.accountBalance());

		account.deposit(500);
		System.out.println("Balance after deposit of $500: " + account.accountBalance());

		account.withdraw(300);
		System.out.println("Balance after withdrawal of $300: " + account.accountBalance());

		account.withdraw(2000);
		System.out.println("Balance after failed withdrawal of $2000: " + account.accountBalance());
	}

}
