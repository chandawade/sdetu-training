package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		//call methods
		printName();
		
		int a = 10;
		int b = 20;
		addNumbers(a,b);
		
		System.out.println(multiplyNumbers(a,b));
	}
	
	//methods 
	static void printName() { //this is passing no params 
		System.out.println("My name is Chanda");
	}
	
	static void addNumbers(int a, int b) {  //passing in some parameters
		//fx adds two numbers 
		int sum = a + b;
		System.out.println("The sum of numbers " + a + " and " + b + " is " + sum);
	}
	
	static int multiplyNumbers(int numA, int numB) {
		int product = numA * numB;
		return product;  //return gives value back to the fx. 
	}
}
