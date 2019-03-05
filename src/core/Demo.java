package core;

class Person {
	String name;
	String email;
	String phone; 
	
	void running() {
		System.out.println(name + " is walking");
	}
	
	void napping() {
		System.out.println(name + " is napping");
	}
	void eat() {
		System.out.println(email);
	}
	
}
public class Demo {

	public static void main(String[] args) {
		//instantiating an object 
		Person person1 = new Person();
		
		//define properties
		person1.name = "Joe";
		person1.email = "joe@gmail.com";
		person1.phone = "3145962218";
		
		//abstraction
		person1.running();
		person1.napping();
		person1.eat();
		
		
	/*	//person
		String name = "Chanda";
		String email = "cwade@gmail.com";
		String phone = "3094440312";
		
		//what activity and behavior do i do
		//System.out.println(name + " is running");
		running(name);
		System.out.println(name + " is napping");
		
		String name2 = "Chris";
		String email2 = "chris@gmail.com";
		String phone2 = "3093440312";
		
		//what activity and behavior do i do
		//System.out.println(name2 + " is running");
		running(name2);
		System.out.println(name2 + " is napping");
	}	
	
	//enhance by adding fx to minimize code 
	static void running(String name) {
		System.out.println(name + " is running");
		
		*/
	}
}



