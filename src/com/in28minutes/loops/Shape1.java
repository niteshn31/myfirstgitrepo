package com.in28minutes.loops;

//Abstract class representing a geometric shape
abstract class Shape {
	// Abstract method to calculate area (implementation will be provided by
	// subclasses)
	public abstract double calculateArea();

	// Abstract method to display information about the shape
	public abstract void display();
}

//Concrete subclass representing a Circle
class Circle extends Shape {
	private double radius;

	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// Implementation of the abstract method to calculate the area of a circle
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	// Implementation of the abstract method to display information about the circle
	@Override
	public void display() {
		System.out.println("Circle with radius " + radius);
	}
}

//Concrete subclass representing a Square
class Square extends Shape {
	private double side;

	// Constructor
	public Square(double side) {
		this.side = side;
	}

	// Implementation of the abstract method to calculate the area of a square
	@Override
	public double calculateArea() {
		return side * side;
	}

	// Implementation of the abstract method to display information about the square
	@Override
	public void display() {
		System.out.println("Square with side length " + side);
	}
}
