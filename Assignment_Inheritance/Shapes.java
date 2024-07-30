package Assignment_Inheritance;

public class Shapes {

	public static void main(String[] args) {
		Shape circle = new Circle(10.7);
		System.out.println("Area of Circle is : "+ circle.getArea());
		Shape rectangle = new Rectangle(15.5, 18.6);
		System.out.println("Area of Rectangle is : "+ rectangle.getArea());
		Shape square = new Square(7.2);
		System.out.println("Area of Square is : "+ square.getArea());
	}
}

class Shape {
	public double getArea() {
		return 0;
	}
}

class Circle extends Shape {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}
}

class Square extends Shape {
	private double side;
	Square(double side){
		this.side = side;
	}
	public double getArea() {
		return side * side;
	}
}
