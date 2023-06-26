package homework;

import java.util.ArrayList;
import java.util.Collections;

public class SortRectangleObject {

	public static void main(String[] args) {
		ArrayList<Rectangle> arrayOfRectangle = new ArrayList<>();
		Rectangle r1 = new Rectangle(12, 12);
		arrayOfRectangle.add(r1);
		Rectangle r2 = new Rectangle(10, 10);
		arrayOfRectangle.add(r2);
		Rectangle r3 = new Rectangle(23, 23);
		arrayOfRectangle.add(r3);
		Rectangle r4 = new Rectangle(5, 5);
		arrayOfRectangle.add(r4);
		
		for (Rectangle bObj: arrayOfRectangle) {
			System.out.println("its perimeter is " + bObj.getPerimeter());
		}
		
		Collections.sort(arrayOfRectangle);
		System.out.println("\nAfter sorting: ");

		for (Rectangle bObj: arrayOfRectangle) {
			System.out.println("\t its perimeter is " + bObj.getPerimeter());
		}
	}

}
