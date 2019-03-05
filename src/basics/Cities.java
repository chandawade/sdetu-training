package basics;

public class Cities {
	public static void main(String[] args) {
		//declare and define an array 
		String[] cities = {"Chicago", "St Louis", "Miami", "Dallas"};
		
		//to access values need to use index
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		
		//declare the array 
		String[] states = new String[4];
		states[0] = "Illinois";
		states[1]= "Missouri";
		states[2]= "Florida";
		states[3]= "Texas";
		int i=0;
		
		do {
		System.out.println("State: " + states[i]);
		i=i+1;
		} while (i<5);
	
		int n = 0;
		while (n<= 4) {
			System.out.println("State at " + n + " : " + states[n]);
			n++;
		}
	}


}
