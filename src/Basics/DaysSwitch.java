package Basics;

public class DaysSwitch {

	public static void main(String[] args) {
		// Value executed based on the week
		String dayOfWeek = "Wednesday";
		
		switch (dayOfWeek) {
		case "Monday":
		    System.out.println("Today is Monday!");
		    break;
		case "Tuesday":
			System.out.println("Today is Tuesday!");
		    break;
		
		case "Wednesday":
			System.out.println("Today is Wednesday!");
			break;
		case "Thursday":
			System.out.println("Today is Thursday!");
			break;
		case "Friday":
			System.out.println("Today is Friday!");
			break;
		}

	}

}
