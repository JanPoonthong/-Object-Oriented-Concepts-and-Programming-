package factoryMethod;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		
		else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		else if (shapeType == "3" || shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}
		System.out.println("You didn't have a " + shapeType + " map to an Object");
		return null;
	}
}
