package Basics;

public class weatherLoops {

	public static void main(String[] args) {
		// Temperature suggestions
		int temperature = 20;
		String sunCondition = "Sunny";
		
		if (temperature > 80) {
			System.out.println("It's a pleasant day wear shorts and t-shirts.");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler, wear a long-sleeve shirt and jeans.");
		}
		else {
			System.out.println("Looks like a cold day. Bring a jacket");
		}

	}

}
