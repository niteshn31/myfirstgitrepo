package inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		// Creating an instance of the Animal class
		Animal genericAnimal = new Animal("Generic Animal");
		genericAnimal.displayInfo();

		// Creating an instance of the Dog class
		Dog myDog = new Dog("Buddy", "Golden Retriever");
		myDog.displayInfo();
		myDog.bark();
	}
}
