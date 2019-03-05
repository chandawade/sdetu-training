package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//declare and define variable to define career
		String career = "development"; 
		System.out.println("Program is starting");
		System.out.println("My career is: " + career);
		
		//compute annual salary
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + "at the rate of $" + rate + " is $" + salary);
		
		//salary is rate * hours per week * weeks per year
	}

}
