package Firsteverjavaprogram;

public class BankAccount {
	
	String acountnumber ;
	double balance = 1000 ;
	
	double deposit(double amount) {
		balance += amount ;
		return balance ;
	}
	void displaybalance() {
		System.out.println("Current updated balance : " + balance);
	}

}
