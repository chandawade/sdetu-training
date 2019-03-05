package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		//number is defined by sum of 2 previous numbers 
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) = fib1 plus fib0 = 0 plus 1 = 1
		//fib(3) = fib2 plus fib1 = 1 plus 1 = 2
		//fib(4) = fib3 plus fib2 = 2 plus 1 = 3
		//fib(5) = fib4 plus fib3 = 3 plus 2 = 5
		 
		System.out.println(fib(4));
	}
	public static int fib(int n) {
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}
	
}
