import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class IsPositive {
    public static void main(String[] args) {
//        Scanner userInput = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = userInput.nextInt();  // Read user input
//
//      System.out.println(isPositive(number));
        System.out.println(largestThree(6, 4, 5));
        System.out.println(randomNumber(1, 6));

    }

    public static boolean isPositive(int a) {
        return a > 0;
    }

    public static int largestValue(int a, int b) {
        return Math.max(a, b);
    }

    public static int largestThree(int a, int b, int c) {
        return largestValue(largestValue(a, b), c);
    }

    public static int randomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);    }
}
