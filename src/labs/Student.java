package labs;

public class Student {
	
//	properties of a user/student
	private String firstName; 
	private String lastName;
	private String DOB;
	private String SSN;
	private String email; 
	private static int studentID = 101;
	
	
	public Student() {
		System.out.println("New Student Created:");
		this.SSN = "12345678";
		this.firstName = "Phil";
		this.lastName  = "Jackson";
		this.DOB = "8/10/1988";
		studentID++; 
//		getFirstName();
//		getLastName();
//		getDOB();
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println(DOB);
		System.out.println(SSN);
		setEmail(); 
		System.out.println("Student ID: " + studentID);
	}
	
	public Student(String firstName,String lastName, String DOB, String SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.DOB = DOB;
		this.SSN = SSN;
		System.out.println("New Student Created:");
		System.out.println("First Name: "+firstName + " \nLast Name: "+ lastName + "\nDOB: "+ DOB + "\nSSN: "+SSN);
		studentID++;
		System.out.println("Student ID: " + studentID);
		setEmail();
	}
	

	
	//methods for student database (student can change email, last name, address, drop/add classes, )
	public void changeEmail(String email) {
		System.out.println("Email Successfully Changed");
	}
	
	public void changeLastName(String lastName) {
		System.out.println("Last Name Changed");
	}
	
	public void changeAddress(String address) {
		System.out.println("Address Changed");
	}
	
	public void dropClass(String dropClass) {
		System.out.println("Class Dropped");
	}
	
	public void addClass(String addClass) {
		System.out.println("Class Added");
	}
	
	
	//getters and setters 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println("Last Name: " + lastName);
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	} 
	
	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail() {
		String newEmail = (firstName + "." + lastName + "@labs.com");
		System.out.println("Email: " + newEmail);
		//this.email = email;
	}

	public int getStudentID() {
		return studentID; 
	}

}
