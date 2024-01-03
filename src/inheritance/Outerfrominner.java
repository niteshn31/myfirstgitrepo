package inheritance;

public class Outerfrominner {
	private int outerField = 10;

	// Inner class
	public class InnerClass {
		public void accessOuterField() {
			// Accessing the private field of the outer class
			System.out.println("Inner class accessing outerField: " + outerField);
		}
	}

	public static void main(String[] args) {
		// Create an instance of the outer class
		Outerfrominner outerObject = new Outerfrominner();

		// Create an instance of the inner class using the outer class instance
		Outerfrominner.InnerClass innerObject = outerObject.new InnerClass();

		// Call the method in the inner class that accesses the outer field
		innerObject.accessOuterField();
	}
}
// The InnerClass is able to access the private outerField of the OuterClass directly.
// One advantage of inner classes, is that they can access attributes and methods of the outer class.