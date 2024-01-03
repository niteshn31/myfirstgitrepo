package inheritance;

//Parent class
class Shape {
	public void draw() {
		System.out.println("Drawing a shape");
	}
}

//Subclass 1
class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

//Subclass 2
class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}
}

//Subclass 3
class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}
}
