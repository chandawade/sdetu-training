package labs;

public class AppBankAcount {

	public static void main(String[] args) {
	}
	
	class Account {
		//properties of bank account 
		private String accountNumber; // id + random 2 digit number + first 2 of ssn
		private static final String routingNumber = "123456";
		private String name;
		private String ssn;
		private Double balance;
		private int ID = 100;				//internal, unique ID  
		Account account1 = new Account("123");
		
		//Constructor
		public Account(String ssn) {
			System.out.println("New Account Created");
			this.ssn = ssn; //set value of instance variable to local variable of ssn 
			ID++;
			setAccountNumber(); 
		}
		
		private void setAccountNumber() {
			int random = (int) Math.random() * 100;
			System.out.println(random);
			accountNumber = ID + "" + random + ssn.substring(0,2);
			System.out.println("Your Account Number: " + accountNumber);
		}
	}

}
	
	
