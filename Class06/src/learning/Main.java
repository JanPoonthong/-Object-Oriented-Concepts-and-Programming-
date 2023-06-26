package learning;

class Main {
	public static void main(String[] args) {
		Shapes myShape = new Shapes(); // Create a Shapes object

		myShape.area();
		myShape.area(5);
		myShape.area(6.0, 1.2);
		myShape.area(6, 2);
	}
}
