package Basics;

public class myArrays {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "Miami", "Dallas", "Orlando"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//Declare and define the array using new (size as 5)
		String[] states = new String[5];
		System.out.println("=============");
		System.out.println(states[0] = "Florida");
		System.out.println(states[1] = "Georgia");
		System.out.println(states[2] = "Alabama");
		System.out.println(states[3] = "Arizona");
		System.out.println(states[4] = "Ohio");
		
		//Using a do loop to test then test condition the above array
		System.out.println("=====Do-while loops========");
		int i = 0;
		do {
			System.out.println("STATES: "+states[i]);
			i = i + 1;
		} while(i<5);
		
		System.out.println("=====While loops========");
		//Using a While loop to test the condition first then enters loop
		int n=0;
		while (n < 5) { //May also use n <= 4 which will be similar.
			System.out.println("STATES: "+states[n]);
			n = n + 1; //n++ may also be used here.
		}
		System.out.println("=====While loops with boolean========");
		int s = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[s];
			System.out.println("Boolean STATES: "+states[s]);
			if (state == "Florida") {
				System.out.println("STATE FOUND");
				stateFound = true;
				}
			s++;
		}
		System.out.println("=====Printing with FOR LOOP ========");
		//For loop: Best structure for iterating through an array
		for (int x = 0;x < 5; x++) {
			System.out.println(states[x]);
		}

	}

}
