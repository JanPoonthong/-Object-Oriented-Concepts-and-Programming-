package factoryMethod;

import java.util.ArrayList;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		ArrayList<Shape> shapes = new ArrayList<Shape>();
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				if (i % 2 == 0) {
					shapes.add(shapeFactory.getShape("circle"));
				} else {
					shapes.add(shapeFactory.getShape("rectangle"));
				}
			} else {
				shapes.add(shapeFactory.getShape("3"));
			}
		}

		shapes.add(shapeFactory.getShape("square"));

		for (Shape each : shapes) {
			each.draw();
		}
//		// get an object of Circle and call its draw method.
//		Shape shape1 = shapeFactory.getShape("CIRCLE");
//
//		// call draw method of Circle
//		shape1.draw();
//
//		// get an object of Rectangle and call its draw method.
//		Shape shape2 = shapeFactory.getShape("RECTANGLE");
//
//		// call draw method of Rectangle
//		shape2.draw();
//
//		// get an object of Square and call its draw method.
//		Shape shape3 = shapeFactory.getShape("SQUARE");
//
//		// call draw method of square
//		shape3.draw();
	}
}
