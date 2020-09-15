package Labs;

public class newStudentLab2 {

	public static void main(String[] args) {
		// Abstracts
		newStudentConst stud = new newStudentConst("Nemmy", "Dengu","399023483");//Constructor
		//newStudentConst stud2 = new newStudentConst("398305");
		stud.setPhone("321-144-2477");
		stud.setCity("Melbourne");
		stud.setState("Florida");
		stud.getName("");
		
		
	
		
		stud.enroll ("Math 1");
		stud.enroll("English");
		System.out.println(stud);
		
		stud.pay(998);
	

	}

}
class newStudentConst {
	// Properties of the New Student
	private String userID; //Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN =xxxxssss2222
	private static int ID = 1000; 
	private String name;
	private String SSN;
	private String email; //Automatically create an email ID based on the name
	private String courses = "";
	private static final int costOfCourse = 1000;
	private int balance;
	private String phone;
	private String city;
	private String state;
	private String firstName;
	private String lastName;
	
	
	
	
	//1. New Student constructor that takes name and SSN in the arguments
	//Constructor
	public newStudentConst (String firstName, String lastName,String SSN) {
		this.SSN = SSN;
		this.name =lastName + "," + firstName;
		ID++;
		//System.out.println("Student ID: " + ID);
		//setEmail();
		setUserID();
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@newstudent.com";
	}
		
		public void getName(String string) {
		
		
	}

		public String getPhone() {
			return phone;
			}
			public void setPhone(String phone) {
			this.phone = phone;
			}
			public String getCity() {
			return city;
			}
			public void setCity(String city) {
			this.city = city;
			}
			public String getState() {
			return state;
			}
			public void setState(String state) {
			this.state = state;
			}

	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * (max-min));
		random = random + min;
		//System.out.println("Randon number: " + random);
		userID = ID + "" + random + SSN.substring(5);
		//System.out.println("New Student user ID: " + userID);
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		//System.out.println(courses);
		balance = balance + costOfCourse;
		
	}
	public void pay(int amount) {
		balance = balance - amount;
		System.out.println("Your payment of $" + amount + " has been applied and your new balance is: $" + balance);
	}
	public void checkBalance() {
		System.out.println("Your balance is: $" + balance);
	}
	
	public String toString() {
		return "Student Information:\n"+"\nName: " + name + "\nYour User ID: " + userID + "\nYour Phone#: " + phone + "\nYour City: " 
	+ city + "\nYour State: " + state + "\nYour Email: " + email + "\nCourses: " + courses +" \nBalance: $" + balance;
	}
	
	public void showCourses() {
		System.out.println("You have enrolled in: " + courses);
	}
}