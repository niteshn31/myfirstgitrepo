package com.in28minutes.loops;

import java.util.Scanner;

public class ShapeRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose a shape to create:");
		System.out.println("1. Circle");
		System.out.println("2. Square");

		int choice = scanner.nextInt();

		Shape shape;

		// Create an instance based on user choice
		if (choice == 1) {
			System.out.print("Enter the radius of the circle: ");
			double radius = scanner.nextDouble();
			shape = new Circle(radius);
		} else if (choice == 2) {
			System.out.print("Enter the side length of the square: ");
			double side = scanner.nextDouble();
			shape = new Square(side);
		} else {
			System.out.println("Invalid choice. Exiting...");
			return;
		}

		// Call methods on the created shape
		shape.display();
		System.out.println("Area of the shape: " + shape.calculateArea());

		// Close the scanner
		scanner.close();
	}
}
