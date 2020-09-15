package Basics;

public class myFunction {

	public static void main(String[] args) {
		// calling the methods
		System.out.println("Program is now stating\n");
		printName();
		
		//Declare integers to be passed in addNumbers
		int numA=10, numB = 20;
		addNumbers(numA, numB);
		
		//Declare the integers to be passed in the multipleNumbers
		int product = multipleNumbers(numA, numB);
		System.out.println("\nThe sum of both numbers is: "+ product);
		
		
		
	}
		//When using 'void' that means we will not return anything.
		static void printName() {//This is method 1 
			System.out.println("My name is Nehemiah");
}
		static void addNumbers(int number1, int number2) { //This is method 2 will receive numA and numB
			int sum = number1 + number2;
			System.out.println("\nThe sum of both numbers is: "+sum);
		}
		
		static int multipleNumbers(int valueA, int valueB) {//This is method 3
			int product = valueA * valueB;
			//We can also call a function inside another function
			addNumbers(product + 50, product);
			
			return product; //The product result will be returned to 'multipleNumbers function
		}
		

	

}
