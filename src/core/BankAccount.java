package core;


public class BankAccount implements IRate {
	
	//static variable
	private static final String routingNumber = "01234"; //this belongs to the class not each obj instance. FINAL >> is constant  
	
	//instance variables 
	String accountNumber;
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;

	//constructor definitions that are unique method
		//used to initialize properties of an obj and are called upon instantiation 
		//has the same name as the class itself 
		//have no return type 
	
	BankAccount() {
		System.out.println("New Acct Created.");
	}
	
	//overloading: call same method name with diff args 
	BankAccount(String accountType) {
		System.out.println("New Account: " + accountType);
		 
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("new account: " + accountType);
		System.out.println("Initial Deposit of: $" + initDeposit);
		String msg = null; 
		if(initDeposit < 1000) {
			String errorMsg = "error: Minimum deposit must be at least $1,000";
			System.out.println(errorMsg);
		} else {
			msg = "Thanks for  your initial deposit of: $ " + initDeposit;
			}
		System.out.println(msg);
		balance = initDeposit; 
	}
	
	
	//define methods 
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	private void showActivity(String activity) {
		System.out.println("Your Recent Transaction: " + activity);
		System.out.println("Your new balance: " + balance);
	}
	
	void withdraw(double withdraw) {
		balance = balance - withdraw;
		showActivity("WITHDRAW");
	}
	
	void checkBalance() {
		System.out.println("Balance is "+ balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ Name: " + name + ". ACCOUNT NUMBER: " + accountNumber + ". ROUTING NUMBER: " + routingNumber + ". BALANCE: $" + balance + "]";
	}
	
//	getters and setters 
//	allow the user to define the fields.
//define public methods to iteract with private variables
	public void setName(String name) {
		this.name=name;
	}
	
	//for the client to receive something 
	public String getName() {
		return name; 
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
//	interface methods 
	public void setRate() {
		System.out.println("setting rate");
	}

	@Override
	public void increaeRate() {
		// TODO Auto-generated method stub
		
	}
}
