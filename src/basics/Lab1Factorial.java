package basics;

public class Lab1Factorial {
	
	public static int factorial(int n) {
		if(n <= 1){
			return 1; 
			}
		else
			return (n*factorial(n-1));
	}
	public static void main(Strings[] args) {
		System.out.println(factorial(4));
		
	}

}
