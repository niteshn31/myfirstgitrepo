package inheritance;

import java.util.Scanner;

public class Staticinnerclass {
	private static int outerStaticField = 10;

	// Static inner class
	public static class StaticInnerClass {
		public void readInput() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a value for the outer static field: ");
			outerStaticField = scanner.nextInt();
			scanner.close();
		}

		public void display() {
			System.out.println("Static inner class display method. Outer static field: " + outerStaticField);
		}
	}

	public static void main(String[] args) {
		// Create an instance of the static inner class
		StaticInnerClass staticInnerObject = new StaticInnerClass();

		// Call the readInput method of the static inner class
		staticInnerObject.readInput();

		// Call the display method of the static inner class
		staticInnerObject.display();
	}
}
// The StaticInnerClass is declared as static within the OuterClass. This means you can create an instance of the static inner class without having an instance of the outer class.