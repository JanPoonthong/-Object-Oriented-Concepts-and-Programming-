package inheritanceExample;

public class TestAllSubclass {

	public static void main(String[] args) {
		Square mySquare = new Square(10);
		System.out.println(mySquare);
		mySquare.printSquare();
		
		System.out.println();
		
		Circle circleObj = new Circle();
		circleObj.setRadius(3.14);
		System.out.println("Circle: " + circleObj);
		
		System.out.println();
		
		Rectangle myRectangle = new Rectangle(20, 40, "red", false);
		System.out.println("Rectangle: " + myRectangle);
	}

}
