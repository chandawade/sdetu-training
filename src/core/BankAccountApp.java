package core;

public class BankAccountApp {   //this is the client  

	public static void main(String[] args) {
		//create an object from a class 
		
		BankAccount acc1 = new BankAccount();
		
//		 encapsulation 
		acc1.setName("Chanda Wade");
		System.out.println(acc1.getName());
	/*	
		acc1.setSsn("1233334567");
		System.out.println("SSN: " + acc1.getSsn());
		
		  
		acc1.accountNumber = "12345";
		//acc1.name = "Chanda Wade"; this is how to define a variable before implementing encapsulation 
		acc1.balance = 1000;
		
		acc1.deposit(100);
		acc1.deposit(500);
		acc1.withdraw(350);
		acc1.setRate();
		acc1.increaeRate();
		
		//polymorphism through overriding 
		System.out.println(acc1.toString()); 
		
		//polymorphism thru overloading 
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "6789";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "10111213";
		acc3.checkBalance();
		
		
//		inheritance 
		CDAccount cd1 = new CDAccount();
		cd1.accountNumber = "1617181920";
		cd1.interestRate = "4.5";
		//cd1.name = "Juan";  pre-encapsulation
		cd1.compound();
		System.out.println(cd1.toString());
		*/
		
	}
	

}
