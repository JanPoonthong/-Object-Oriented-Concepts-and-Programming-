package example;

import java.util.ArrayList;

class TestGenerics1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("jai");
		list.add("jackson");
		list.add("kim");
		String s = list.get(2);// type casting is not required
		System.out.println("element is: " + s);

		for (String each : list)
			System.out.println(each);

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

	}
}