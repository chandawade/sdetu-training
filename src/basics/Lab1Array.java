package basics;

public class Lab1Array {
	public static int max(int[] exampleArray) {
		int max = exampleArray[0];
		for(int i=0; i < exampleArray.length; i++) {
			if(exampleArray[i]>max) {
				max = exampleArray[i];
			}
		}
		return max; 
	}
	
	public static int avg(int [] exampleArray) {
		int sum = 0;
		
		for(int i=0; i < exampleArray.length; i++) {
			sum = sum + exampleArray[1];
		}
		return sum / exampleArray.length; 
		
	}
	
	
	public static int min(int[] exampleArray) {
		int min = exampleArray[0];
		
		for(int i=0; i < exampleArray.length; i++) {
			if(exampleArray[i] < min) {
				min = exampleArray[i];
			}
		}
		return min;
	}
	
	
	
	public static void main(String[] args) {
			//fx that takes an array as a parameter 
			//return the min, avg, and max value of array
		int exampleArray[] = new int[] {22, 3, 30, 11, 4, 26 }; 
			System.out.println("Min: " + min(exampleArray));
			System.out.println("Max: " + max(exampleArray));
			System.out.println("Avg: " + avg(exampleArray));
		}
		

		
}
