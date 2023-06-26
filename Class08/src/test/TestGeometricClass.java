package test;

public class TestGeometricClass {

	public static void main(String[] args) {
//		GeometricObject errObj = new GeometricObject(); // error
//		GeometricObject[] objList = new GeometricObject[3]; // why not error
//		objList[0] = new Circle();
//		objList[1] = new Rectangle();
//		objList[2] = new Rectangle(3, 4);
//		System.out.println();
//
//		GeometricObject geoObj1 = new Circle();
//		((Circle)geoObj1).setRadius(2.5);
//		System.out.println((Circle) geoObj1);
//		
//		// @@@
//		Rectangle rectObj1 = new Rectangle(2, 3);
//		System.out.println(rectObj1);
//		
//		Circle circleObj1 = new Circle();
//		System.out.println(circleObj1);
		
		GeometricObject[] objList = {new Circle(2), new Rectangle(2, 3), new Square(4)};
		System.out.println("There are " + objList.length + " objects");
		// This is polymorphism feature
		for (GeometricObject objElement: objList) {
			printArea(objElement);
		}
		
	}
	// This is polymorphism feature
	public static void printArea(GeometricObject obj) {
		System.out.println("There area is " + obj.getArea());
	}

}
