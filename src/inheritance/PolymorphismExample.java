package inheritance;

import java.util.Scanner;

public class PolymorphismExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the type of shape (circle, square, triangle):");
		String shapeType = scanner.nextLine().toLowerCase();

		Shape shape;

		// Create an object based on user input
		switch (shapeType) {
		case "circle":
			shape = new Circle();
			break;
		case "square":
			shape = new Square();
			break;
		case "triangle":
			shape = new Triangle();
			break;
		default:
			System.out.println("Invalid shape type. Drawing a default shape.");
			shape = new Shape();
		}

		// Polymorphic behavior: calling the draw method on the chosen object
		shape.draw();

		// Close the scanner
		scanner.close();
	}
}
