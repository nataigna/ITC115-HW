import java.text.NumberFormat;

public class BankAccount {
	String name;
	double balance;
	double transactionFee;
	
	
	public BankAccount(String initName, double initBalance, double initTransactionFee) {
		name = initName;
		balance = initBalance;
		transactionFee = initTransactionFee;
	}
	
	public void deposit(double amount) {
		balance = balance+ amount;
		
	}
	
	public void withdraw(double amount) {
		if((balance - amount - transactionFee) >= 0) {
			balance = balance - amount - transactionFee;
		}
	}
    
	public String toString() {
		String outputString = name + ", " + NumberFormat.getCurrencyInstance().format(this.balance);
		return outputString;
	}
}
