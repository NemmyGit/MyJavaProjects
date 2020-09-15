package OOP;

//Dog class extends Animal class
public class Dog extends AbstractAnimalDemo{
	
	public void sound() {
		System.out.println("Woof!");
	}
	public static void main(String args[]) {
		AbstractAnimalDemo obj = new Dog();
		obj.sound();
		
	}
}
