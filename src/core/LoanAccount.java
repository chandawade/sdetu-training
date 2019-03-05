package core;

public class LoanAccount implements IRate {
	
	public void setRate() {
		System.out.println("Rate");
		
	}
	public void increaeRate() {
		System.out.println("increase rate");
		
	}
	
	public void setTerm(int term) {
		System.out.println("Setting the term to: " + term + " years.");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Ammortization Schedule");
	}
}
