package inheritance;

//Parent class
class Animal2 {
	// Private property accessible only within the class
	private String name;

	// Protected property accessible within the class and its subclasses
	protected int age;

	// Constructor
	public Animal2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Public method to get the name (getter)
	public String getName() {
		return name;
	}

	// Protected method accessible within the class and its subclasses
	protected void displayInfo() {
		System.out.println("I am an animal named " + name + " and I am " + age + " years old.");
	}
}

//Child class inheriting from the Animal class
class Dog2 extends Animal2 {
	// Private property specific to the Dog class
	private String breed;

	// Constructor
	public Dog2(String name, int age, String breed) {
		// Call the constructor of the parent class (Animal)
		super(name, age);
		this.breed = breed;
	}

	// Public method to get the breed (getter)
	public String getBreed() {
		return breed;
	}

	// Overriding the displayInfo method to add more specific information for dogs
	@Override
	protected void displayInfo() {
		System.out.println("I am a dog named " + getName() + " of breed " + breed + " and I am " + age + " years old.");
	}

	// Additional method specific to the Dog class
	public void bark() {
		System.out.println("Woof! Woof!");
	}
}
