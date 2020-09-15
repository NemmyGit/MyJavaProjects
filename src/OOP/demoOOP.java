package OOP;

class Person {
	String name  ="Nehemiah";
	String email = "nehemiah@email.com";
	String phone = "3959593020";
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}

public class demoOOP {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		//Define some object properties
		//person1.name ="Nehemiah";
		//person1.email = "nehemiah@email.com";
		//person1.phone = "3959593020";
		
		//Abstraction
		person1.walk();
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.email = "sarah@eamil.com";
		
	person2.sleep();
		
		

	}

}
