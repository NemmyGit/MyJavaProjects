
  package OOP;
  
  //Parent Class
  public class BankAccountApp {
  
	 public static void main(String[] args) { // Creating a new Bank account >>Think as to Instantiate an object 
	  BankAccount acc1 = new BankAccount("New Account Created.");//No effect adding "New Account Created." from just new BankAccount().
	  acc1.accountNumber = "0211311";
	  acc1.name = "Mr. Nehemiah";
	  acc1.balance = 1000;
	  acc1.deposit(1500);
	  acc1.deposit(3500);
	  acc1.withdraw(52000);
	  System.out.println(acc1.toString());//toString was overridden from BankAccount class under public toString Method.
	
			  
	  
	  BankAccount acc2 = new BankAccount("Checking Account"); 
	  acc2.accountNumber = "0211222";	  
	  
	  BankAccount acc3 = new BankAccount("Savings Account", 5000);
	  acc3.accountNumber = "0211333";
  
	  System.out.println(acc1.routingNumber);
	  System.out.println(acc2.accountNumber);
	  System.out.println(acc3.accountNumber);
	  
	  
	  //Demo for inheritance from inHeritCD_Account Class
	  inHeritCD_Account cd1 = new inHeritCD_Account(); //constructor from inHeritCD_Account class
	  cd1.balance = 3000;
	  cd1.name = "Juan";
	  cd1.accountType = "CD Account";
	  System.out.println(cd1.toString());
	  
	  System.out.println("***********Encapsulation Example from EncapsulationDemo Class**********");
	  EncapsulationDemo acc4 = new EncapsulationDemo();
	  acc4.getName();//This works to get the name from EncapsulationDemo class, but also can use setName but have to enter the string ("Nehemiah").
      acc4.setSsn(321145151);
      acc4.setBalance(44);
      System.out.println("Customer's Name: " + acc4.getName());
      System.out.println("Customer's SSN: " + acc4.getSsn());
      System.out.println("Customer's Age: " + acc4.getBalance());
	  
  		}
  
  }
 
