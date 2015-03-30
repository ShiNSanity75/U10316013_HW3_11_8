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
	public NewAccount(String newName, int newId, double newBalance) {
		name = newName;
		id = newId;
		balance = newBalance;
	}
	
	//constructor with the name of the customer,specified id , balance and newAnnualInterestRate
	public NewAccount(String newName,  int newId, double newBalance, double newAnnualInterestRate) {
		name = newName;
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}
	
	//get method for name
	public String getName() {
		return name;
	}
	
	//set method for name
	public void setName(String newName) {
		name = newName;
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
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
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
			balance -= amount;
			Transaction transaction = new Transaction('W', amount, balance, "withdraw");
			transactions.add(transaction);
			return balance;
	}
	
	//deposit a specified amount to the account
	double deposit(double amount) {
		balance += amount;
		Transaction transaction = new Transaction('D', amount, balance, "deposit");
		transactions.add(transaction);
		return balance;
	}
	
	//get method of transactions
	ArrayList getTransactions() {
		for (int i = 0; i < transactions.size(); i++) {
			System.out.println(transactions.get(i));
		}
		return transactions;
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
	public char getType() {
		return type;
	}
	
	//set method for type
	public void setType(char newType) {
		type = newType;
	}
	
	//get method for amount
	public double getAmount() {
		return amount;
	}
	
	//set method for amount
	public void setAmount(double newAmount) {
		amount = newAmount;
	}
	
	//get method for balance
	public double getBalance() {
		return balance;
	}
	
	//set method for balance
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	//get method for description
	public String getDescription() {
		return description;
	}
	
	//set method for description
	public void setDescription(String newDescription) {
		description = newDescription;
	}
	
	//get method for date
	public Date getDate() {
		 return date;
	}
	
	//toString method
	public String toString() {	
		return getType() + "      " + amount + "      " + getBalance() + "      " + getDescription();
	}
}
