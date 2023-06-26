package ulmpractice;

public class TestClass {

	public static void main(String[] args) {
		Book a = new Book();
		a.addAuthor("Jan");
		a.addAuthor("Hello");
		System.out.println(a.getAuthors());
	}

}
