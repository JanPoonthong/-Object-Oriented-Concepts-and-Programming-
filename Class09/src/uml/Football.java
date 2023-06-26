package uml;

public class Football extends Ball {

	public Football(String brandName, int weight) {
		super(brandName, weight);
	}

	@Override
	public void bounce() {
		System.out.println("Football is bounce");

	}

	@Override
	public void toss() {
		System.out.println("Football is toss");
		
	}
}
