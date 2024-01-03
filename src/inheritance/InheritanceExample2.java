package inheritance;

public class InheritanceExample2 {
	public static void main(String[] args) {
		// Creating an instance of the Animal class
		Animal2 genericAnimal = new Animal2("Generic Animal", 5);

		// Accessing the public method to get the name
		System.out.println("Animal's name: " + genericAnimal.getName());

		// Accessing the protected property and method
		System.out.println("Animal's age: " + genericAnimal.age);
		genericAnimal.displayInfo();

		// Creating an instance of the Dog class
		Dog2 myDog = new Dog2("Buddy", 3, "Golden Retriever");

		// Accessing the public method to get the name and breed
		System.out.println("Dog's name: " + myDog.getName());
		System.out.println("Dog's breed: " + myDog.getBreed());

		// Accessing the protected property and method from the parent class
		System.out.println("Dog's age: " + myDog.age);
		myDog.displayInfo();

		// Accessing the public method specific to the Dog class
		myDog.bark();
	}
}
