package test;

public class Square extends GeometricObject {
	
	private int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	public double getArea() {
		return 2.0 * side;
	}
	
	public double getPerimeter() {
		return 4.0 * side;
	}
	
	public double getDiameter() {
		return Math.sqrt((side*2.0) + (side*2));
	}
	
	public double getSide() {
		return getArea() / 4.0;
	}
	
	public String toString() {
		return "Square\nArea: " + getArea() + "\nThe Perimeter: " + getPerimeter() + "\nSide: " + getSide();
	}
	
	public void printSquare() {
		System.out.println("The square is created " + getDateCreated() + " and the area is " + getArea());
	}
}
