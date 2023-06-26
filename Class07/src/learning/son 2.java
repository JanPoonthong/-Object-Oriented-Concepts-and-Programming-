package learning;

class grandfather {
	void swim() {
		System.out.println("Swimming");
	}
}

class father extends grandfather {
	void swim() {
		System.out.println("Swimming in river");
	}
}

class son extends father {
	void swim() {
		System.out.println("Swimming in pool");
	}

	public static void main(String args[]) {
		grandfather f1, f2, f3;
		f1 = new grandfather();
		f2 = new father();
		f3 = new son();
		f1.swim();
		f2.swim();
		f3.swim();
	}
}
