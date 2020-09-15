package Basics;

public class BasicAssignment {

	public static void main(String[] args) {
		// Question 1: /Write a function that takes a value n returns the sum of numbers 1 to n
		//Declare integers to be passed in addNumbers
				//int numA=10, numB = 20;
				//addNumbers(numA, numB);
		/* Question 2:
		 * Write a function that computes the factorial value;
		 * Definition: n! = n*(n-1)! , where 0! = 1
		 * 1! = 1
		 * 2! = 2 * 1! = 2 * 1
		 * 3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
		 * 4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
		Hint: use the recursive method that was used to calculate Fibonacci number
		 */
				System.out.println("=============Solution 1=============");
				System.out.println(sum(3));
				System.out.println("=============Solution 2=============");
				System.out.println(fib(5));
		
		
	}
	public static int sum(int n) { //This is method 2 will receive numA and numB values.
		//int sum = value1 + value2;
		//ystem.out.println("\nThe sum of both numbers is: "+sum);
		
		//Instructor's Solution
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + 1;
			System.out.println(" = " + sum);
		}
		return sum;
	}
	public static int fib(int x) {
		if (x==0) {
			return 1;
		}
		System.out.println(x);
		return fib(x-1) * x; //recursion
	}
		

}
