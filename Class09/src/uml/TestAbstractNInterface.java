package uml;
import java.util.ArrayList;
import java.util.Collections;

public class TestAbstractNInterface {

	public static void main(String[] args) {
//		Object[] objects = { new Football("Nike"), new Rock(), new Baseball("NFL") };
//		for (Object obj : objects) {
//			if (obj instanceof Tossable)
//				((Tossable) obj).toss();
//		}
//		for (Object obj : objects) {
//			if (obj instanceof Ball) {
//				((Ball) obj).bounce();
//				System.out.println(((Ball) obj).getBrandName());
//
//			}
//		}
			
		ArrayList<Ball> ballList = new ArrayList<Ball>();
		ballList.add(new Football("Puma", 12));
		ballList.add(new Football("Nike", 10));
		ballList.add(new Football("Addias", 9));
		
		ballList.add(new Baseball("Pura", 100));
		ballList.add(new Baseball("Nike", 90));
		ballList.add(new Baseball("Addias", 30));
		
		System.out.println(ballList.get(0).getBrandName());
		
		for (Ball bObj: ballList) {
			System.out.println(bObj.getBrandName() + " and its weight is " + bObj.getWeight());
		}
		
		Collections.sort(ballList);
	    System.out.println("\n \tAfter sorting: ");

		
	    for (Ball bObj: ballList) {
			System.out.println("\t " + bObj.getBrandName() + " and its weight is " + bObj.getWeight());
		}

//		Arrays.sort(balls);
//	    System.out.println(Arrays.toString(balls));

		
	}

}
