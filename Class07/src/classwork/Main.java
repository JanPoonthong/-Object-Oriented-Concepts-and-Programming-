package classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Double> arrayUserInput = new ArrayList<Double>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number of time to enter double integer: ");
		int runTime = scanner.nextInt();
		
		Scanner scannerTwo = new Scanner(System.in);
		for (int i = 0; i < runTime; i++) {
			System.out.print("Enter a float number: ");
			double userInput = scannerTwo.nextDouble();
			arrayUserInput.add(userInput);
		}
		
		Collections.sort(arrayUserInput);
		System.out.println("Sort " + arrayUserInput);
		System.out.println("Highest " + arrayUserInput.get(arrayUserInput.size() - 1));
		System.out.println("Lowest " + arrayUserInput.get(0));

		double total = 0.0;
		for (int i = 0; i < arrayUserInput.size(); i++) {
			total += arrayUserInput.get(i);
		}
		double average = total / arrayUserInput.size();
		System.out.println("Average " + average);
		
	}
}
