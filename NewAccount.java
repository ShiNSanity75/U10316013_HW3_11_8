import java.util.Date;
import java.util.ArrayList;

public class NewAccount {
	private int id; //ID for the account
	private double balance; //Balance for the account
	private double annualInterestRate; //Store the current interest rate
	private String name; //name of the customer
	java.util.Date dateCreated = new java.util.Date(); //stores the date when the account was created
	ArrayList transactions = new ArrayList(); 
	
	//no-arg constructor
	public NewAccount() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	//constructor with the specified id , initial balance and newAnnualInterestRate
	public NewAccount(int newID, double newBalance,double newAnnualInterestRate) {
		id = newID;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}
	
	//constructor with the name of the customer,specified id and balance
	public Account(String newName, int newId, double newBalance) {
		name = newName;
		id = newId;
		balance = newBalance;
	}
	
	//constructor with the name of the customer,specified id , balance and newAnnualInterestRate
	public Account(String newName,  int newId, double newBalance, double newAnnualInterestRate) {
		name = newName;
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}
	
	//get method for id
	public int getID() {
		return id;
	}
	
	//set method for id
	public void setId(int newId) {
		id = newId;
	}
	
	//get method for balance
	public double getBalance() {
		return balance;
	}
	
	//set method for balance
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	//get method for annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	//set method for annualInterestRate
	public void setAnnualInterestRate(double newAnnualInterestRat) {
		annualInterestRate = newAnnualInterestRat;
	}
	
	//get method for dateCreated
	public Date getDateCreated() {
		 return dateCreated;
	}
	
	//return the monthly interest rate
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	//return monthly interest
	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	//withdraw a specified amount from the account
	double withdraw(double amount) {
			return balance -= amount;
	}
	
	//deposit a specified amount to the account
	double deposit(double amount) {
		return balance += amount;
	}
}

class Transaction {
	private java.util.Date date = new java.util.Date(); //The date of this transactions
	private char type; //'w' for withdrawal, 'D' for deposit
	private double amount; //The amount of this transactions
	private double balance; //The new balance of this transactions
	private String description; //The description of this transactions

//constructor with specific date, type, balance, and description
	Transaction(char newType, double newAmount, double newBalance, String newDescription) {
		type = newType;
		amount = newAmount;
		balance = newBalance;
		description = newDescription;
	}

	//get method for type
	public int getType() {
		return type;
	}
	
	//set method for type
	public void setType(int newType) {
		type = newType;
	}
	
	//get method for amount
	public int getAmount() {
		return amount;
	}
	
	//set method for amount
	public void setAmount(int newAmount) {
		amount = newAmounte;
	}
	
	//get method for balance
	public int getBalance() {
		return balance;
	}
	
	//set method for balance
	public void setBalance(int newBalance) {
		balance = newBalance;
	}
	
	//get method for description
	public int getDescription() {
		return description;
	}
	
	//set method for description
	public void setDescription(int newDescription) {
		description = newDescription;
	}
	
	//get method for date
	public Date getDate() {
		 return date;
	}
	
}
