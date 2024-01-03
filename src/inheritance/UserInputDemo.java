package inheritance;

import java.util.Scanner;

public class UserInputDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read an integer
		System.out.print("Enter an integer: ");
		int intValue = scanner.nextInt();
		System.out.println("You entered an integer: " + intValue);

		// Clear the buffer
		scanner.nextLine();

		// Read a double
		System.out.print("Enter a double: ");
		double doubleValue = scanner.nextDouble();
		System.out.println("You entered a double: " + doubleValue);

		// Clear the buffer
		scanner.nextLine();

		// Read a character
		System.out.print("Enter a character: ");
		char charValue = scanner.next().charAt(0);
		System.out.println("You entered a character: " + charValue);

		// Clear the buffer
		scanner.nextLine();

		// Read a string
		System.out.print("Enter a string: ");
		String stringValue = scanner.nextLine();
		System.out.println("You entered a string: " + stringValue);

		// Close the scanner
		scanner.close();
	}
}
