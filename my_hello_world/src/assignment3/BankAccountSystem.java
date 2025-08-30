package assignment3;

class BankAccount{
	int accountNumber;
	double balance;
	
	void deposit(double amount) {
		balance +=amount;
	}
}

class SavingsAccount extends BankAccount{
	double interestRate;
	
	SavingsAccount(int accNo, double balance, double rate){
		this.accountNumber = accNo;
		this.balance = balance;
		this.interestRate = rate;
	}
	double calculateInterest() {
		return (balance*interestRate)/100;
	}
}
public class BankAccountSystem {
	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount(1001, 2345.678, 8);
		
		System.out.println(account.calculateInterest());
		account.deposit(537.95);
		System.out.println(account.calculateInterest());
		
	}
}
