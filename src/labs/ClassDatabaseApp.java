package labs;

import java.util.Random;

/**
 * @author cn163848
 *
 */
public class ClassDatabaseApp {

	public static void main(String[] args) {
//		New Student constructor that takes name and SSN in the arguments
		
		ClassDatabaseApp s1 = new ClassDatabaseApp("Prince Nelson", "012345568");
		
		s1.setCity("St. Louis");
		System.out.println(s1.getCity());
		
		s1.setState("MO");
		System.out.println(s1.getState());
		
		s1.setPhone("314-747-0000");
		System.out.println(s1.getPhone());
		
		s1.enroll("Health 101");
		s1.enroll("Social Scienece 101");
		s1.enroll("History 212\n");
	
		System.out.println(s1.toString());
		
		s1.checkBalance(null);
		s1.pay();
	}
	
	private String name;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private String email;
	private static String studentID = "22";
	private String course; 
	
	//Constructor
	public ClassDatabaseApp(String name, String SSN) {
		System.out.println("New Student Profile Created:");
		getName();
		getSSN();
		this.name = name; 
		this.SSN = SSN;
		System.out.println(name);
		setStudentID();
		setEmail();
	
	}
	

	//Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
	
	public void pay() {
		System.out.println("Tuition Paid");
		
	}
	
	public void checkBalance(Double balance) {
		Double OutstandingBalance = 52.50;
		System.out.println("Balance is: $" + OutstandingBalance);
		
	}
	
	public void enroll(String course) {
		this.course = this.course + "\n" + course;
		System.out.println("Current classes: " + course);
		
	}
	
	//getters & setters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String SSN) {
		SSN = SSN;
	}

	public String getPhone() {
		return (phone + "\n");
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail() {
		String newEmail = (name.replace(" ","") + "@labs.com");
		System.out.println("Email: " + newEmail);
//		this.email = email;
	}

	public void setState(String state) {
		this.state = state;
	}
	
/* Generate a user ID that is combination of Static ID, 
	random 4-digit number between 1000 and 9000, and 
	last 4 of SSN */
	public String setStudentID() {
		int randomID = (int) (Math.random() * 1000 + 8000);
		studentID = studentID + randomID + SSN.substring(5,9);
		System.out.println("Student ID: " + studentID);
		return studentID;
	}
	
	private String getStudentID() {
			return studentID; 
	}
	
	
	public String toString() {
		String data = "[Name: " + name + ". Student ID: " + studentID + ". Email: " + email + ". State: " + state + ". City: " + city + ". Phone: " + phone + "]";
		return data;
		
	}
	
}
