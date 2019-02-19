package entities;

public class Account {
	
	private String holder;
	private double balance;
	private int number;
	
	public Account(String holder, double initialDeposit, int number) {
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit);
	}
	
	public Account(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getNumber() {
		return number;
	}

	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= (value + 5.0);
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
