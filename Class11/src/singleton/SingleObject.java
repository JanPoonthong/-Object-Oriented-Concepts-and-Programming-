package singleton;

public class SingleObject {

	// create an object of SingleObject
//	private static SingleObject instance;
	private static SingleObject instance = new SingleObject();


	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {
	}

	// Get the only object available
	public static SingleObject getInstance() {
		return instance;
//		if (instance == null) {
//			return new SingleObject();
//		}
//		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
