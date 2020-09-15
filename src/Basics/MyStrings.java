package Basics;

public class MyStrings {

	public static void main(String[] args) {
		// after typing the string variable and use '.' we get different API's to use
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		if (bookTitle.contains(wordChoice)) {//The Book title has what is declared in string.
			System.out.println("The book contains the word! " +wordChoice);
		}
		else {
			System.out.println("The book does NOT contain the word!");
		}
		System.out.println("=====Using .equalsIgnoreCase method ========");
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("Chrome"));{
		System.out.println("The browser is Chrome!");
		}
		
		System.out.println("=====Using .substring method ========");
		String firstName = "Nehemiah";
		String lastName = "Nyabero";
		String SSN = "922943196";
		
		//Print the length of the SSN
		System.out.println("There are " +SSN.length()+ " digits in my SSN.");

		//Print the Name initials plus last 4 digits
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(SSN.substring(5));
		


	}

}
