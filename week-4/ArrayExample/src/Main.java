import java.util.Scanner;

public class Main {
    public static double mean(double[] arr) {
        double sum = 0;
        for (double each : arr) {
            sum += each;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many number(s)?: ");
        int userInt = userInput.nextInt();
        double[] numberList = new double[userInt];

        for (int i = 0; i < userInt; i++) {
            System.out.print(String.format("Enter number#%d: ", i+1));
            numberList[i] = userInput.nextDouble();
        }
        userInput.close();
        System.out.printf("The average of these number(s) is %f", mean(numberList));
    }

}