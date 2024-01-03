package inheritance;

//Parent class
class Animal {
	String name;

	// Constructor
	public Animal(String name) {
		this.name = name;
	}

	// Method to display information about the animal
	public void displayInfo() {
		System.out.println("I am an animal named " + name);
	}
}

//Child class inheriting from the Animal class
class Dog extends Animal {
	// Additional property specific to the Dog class
	String breed;

	// Constructor
	public Dog(String name, String breed) {
		// Call the constructor of the parent class (Animal)
		super(name);
		this.breed = breed;
	}

	// Overriding the displayInfo method to add more specific information for dogs
	@Override
	public void displayInfo() {
		System.out.println("I am a dog named " + name + " of breed " + breed);
	}

	// Additional method specific to the Dog class
	public void bark() {
		System.out.println("Woof! Woof!");
	}
}
