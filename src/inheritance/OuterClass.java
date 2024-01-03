package inheritance;

import java.util.Scanner;

public class OuterClass {
	private int outerField = 10;

	// Inner class
	public class InnerClass {
		public void readInput() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a value for the outer field: ");
			outerField = scanner.nextInt();
			scanner.close();
		}

		public void display() {
			System.out.println("Inner class display method. Outer field: " + outerField);
		}
	}

	public static void main(String[] args) {
		// Create an instance of the outer class
		OuterClass outerObject = new OuterClass();

		// Create an instance of the inner class using the outer class instance
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();

		// Call the readInput method of the inner class
		innerObject.readInput();

		// Call the display method of the inner class
		innerObject.display();
	}
}

// To access the inner class, create an object of the outer class, and then create an object of the inner class