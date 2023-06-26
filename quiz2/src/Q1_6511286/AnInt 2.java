package Q1_6511286;

public class AnInt implements SwapEnd {
	private int number;

	public AnInt(int number) {
		this.number = number;
	}

	public void setNumber(int number) {
		this.number = number;
//        System.out.println(number + " is set");
	}

	public int getNumber() {
		return this.number;
	}

	@Override
	public void swap() {
		String numberString = Integer.toString(number);
		String a = "";
		if (numberString.length() <= 1) {
			a += this.number;
		} else {
			if (numberString.charAt(0) == '-') {
				a += "-";
				a += numberString.charAt(numberString.length() - 1);
				a += numberString.substring(2, numberString.length() - 1);
				a += numberString.charAt(1);
				this.number = Integer.parseInt(a);
			} else {
				a += numberString.charAt(numberString.length() - 1);
				a += numberString.substring(1, numberString.length() - 1);
				a += numberString.charAt(0);
				this.number = Integer.parseInt(a);
			}
		}
	}

}
