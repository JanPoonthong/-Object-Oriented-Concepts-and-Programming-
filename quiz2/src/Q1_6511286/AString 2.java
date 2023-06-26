package Q1_6511286;

public class AString implements SwapEnd {
	private String str;

	public AString(String str) {
		this.str = str;
	}

	public void setStr(String str) {
		this.str = str;
//		System.out.println(str + " is set");
	}

	public String getStr() {
		return this.str;
	}

	@Override
	public void swap() {
		String a = "";
		if (this.str.length() <= 1) {
			a += this.str;
		} else {
			a += str.charAt(str.length() - 1);
			a += str.substring(1, str.length() - 1);
			a += str.charAt(0);
		}
		this.str = a;
	}

}
