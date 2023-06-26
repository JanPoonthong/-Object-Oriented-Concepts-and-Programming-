package uml;

public class Baseball extends Ball {
	public Baseball(String brandName, int weight) {
		super(brandName, weight);
		
	}

	@Override
	public void bounce() {
		System.out.println("Baseball is bounce");		
	}

	@Override
	public void toss() {
		System.out.println("Baseball is toss");		
		
	}
}
