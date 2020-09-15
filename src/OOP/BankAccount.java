package OOP;

public class BankAccount {

	//Define variables
	
	//static >> belongs to the CLASS no the object instance
	//final >> It is like a CONSTANT that will not allow to be changed when called(often static final)
	static String accountNumber = "665002";
	static String routingNumber = "02213339";
	String name;
	String ssn;
	String accountType;
	public double balance;
	
	
	//Constructor definitions: unique methods
		//1. They are used to define / setup / initialize properties of an object
		//2. Constructors are IMPLICITLY called upon INSTANTIATION
		//3. The same name as the class itself
		//4. Constructors have no return type (like void or static)
	BankAccount(){//this is like a default.
		System.out.println("New Account Created.");// This will be called by BankAccount acc1 = new BankAccount(); 
	}
	
		//Overloading: call same methods name with different arguments.
	BankAccount(String accountType){
		System.out.println("New Account: " + accountType);//This will be called by BankAccount acc2 = new BankAccount("Checking Account");
	}
	BankAccount(String accountType, double initialDeposit){
		System.out.println("New Account: " + accountType);//This will be called by BankAccount acc3 = new BankAccount("Savings Account");
		System.out.println("Initial Deposit of: $" + initialDeposit); //this will be called by BankAccount acc3 = new BankAccount(5000);
	}
	//Define Methods
	
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	//When overriding the toString method from BankAccountApp class..Otherwise wwhen printing, it will give some weird numbers.
	@Override
	public String toString() {
		return "[" + name + ", " + accountNumber + ", BALANCE: $ " + balance + "]";
	}
	//make the method public to be accessible
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
		
	}
	private void showActivity (String activity) {
		System.out.println("Your Recent Activity" + activity);
		System.out.println("Your New Balance is:$ " + balance);
	}
	void checkBalance() {
	
	}
	//Make the method to private. Will be just within the class
	private void getStatus() {
		
	}
	
}
