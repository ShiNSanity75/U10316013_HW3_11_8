import java.util.Date;
import java.util.ArrayList;

public class TestNewAccount {
	//main method
	public static void main(String[] args) {
		NewAccount myNewAccount = new NewAccount("George", 1122, 1000.0, 0.015);
		myNewAccount.deposit(30.0);
		myNewAccount.deposit(40.0);
		myNewAccount.deposit(50.0);
		myNewAccount.withdraw(5.0);
		myNewAccount.withdraw(4.0);
		myNewAccount.withdraw(2.0);
		
		System.out.println("Date: " + myNewAccount.getDateCreated());
		System.out.println("Name: " + myNewAccount.getName());
		System.out.println("ID: " + myNewAccount.getID());
		System.out.println("Monthly Interest: " + myNewAccount.getMonthlyInterestRate());
		System.out.println("Balance: " + myNewAccount.getBalance());
		System.out.println("\nType" + "   Amount" + "   Balance" + "   Description");
		myNewAccount.getTransactions();
	}
}
