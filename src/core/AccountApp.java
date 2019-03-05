package core;

//polymorphism - changes where we are pointing
public class AccountApp {
	
	public static void main(String[] args) {
		LoanAccount la = new LoanAccount(); 
		la.increaeRate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		
		//create new obj with IRate properties, pointing to LoanAccount. 
		//available methods are defined in interface
		//to call the methods, it calls LoanAccount Methods
		IRate account1 = new LoanAccount(); 
		account1.increaeRate();
		account1.setRate();
	}
	

}
