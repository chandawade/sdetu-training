package labs;

public class Student2 {

	String name;
	String food;
	String color;
	int number; 
	
	private int var;
	
	public Student2() {
		this.var = 10;
	}
	
	public Student2(int num) {
		this.var = num;
	}
	
	public int getValue() {
		return var; 
	}
	
	Student2(String name, String food, String color, int number) {
		this.name = "Chanda";
		
		this.name = name;
		this.food = food;
		this.color = color; 
		this.number = number; 
	}
	
	void info() {
		System.out.println("Name: " + name +"\nFood : "+food + "\nColor: "+color + "\nNumber: "+number);
		
	}
	
	
	public static void main(String[] args) {
		Student2 obj = new Student2();
		System.out.println(obj.name);
		
		Student2 obj1 = new Student2("Chanda", "Pizza", "Purple", 22);
		Student2 obj2 = new Student2("Sheri", "Chicken", "Yellow", 60);
		obj1.info();
		obj2.info();
	
		Student2 obj3 = new Student2(); 
		Student2 obj4 = new Student2(100); 
		System.out.println("Var is: " +obj3.getValue());
		System.out.println("Var is: " +obj4.getValue());
	
	
	}

}
