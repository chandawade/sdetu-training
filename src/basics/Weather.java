package basics;

public class Weather {
	public static void main(String[] args) {
		//gives suggestions of what to wear based on temp
		
		int temperature = 61;
		String sunCondition = "sunny";
		
		if (temperature > 80) { System.out.println("Wear shorts and a t-shirt"); }
		else if ((temperature > 60) && (sunCondition=="sunny")) { System.out.println("Wear long-sleeve shirt and jeans"); }
		else { System.out.println("bring a sweater"); }
	}
}
