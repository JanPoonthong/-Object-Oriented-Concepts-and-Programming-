package uml;

public abstract class Ball implements Tossable, Comparable<Ball> {
	private String brandName;
	private int weight;
	
	public Ball(String brandName, int weight) {
		this.brandName = brandName;
		this.weight = weight;
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public abstract void bounce();
	
	@Override
	public int compareTo(Ball o) {
		  return Integer.compare(this.weight, o.weight);

	}
}
