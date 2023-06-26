import java.util.Scanner;
import java.util.Arrays;

public class MiddleValueInStat {
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
        System.out.printf("The mean of these number(s) is %f\n", findMean(numberList));
        System.out.printf("The median of these number(s) is %f\n", findMedian(numberList));
    }

    public static double findMedian(double[] arr) {
        Arrays.sort(arr);
        int middlePoint = arr.length / 2;
        if (middlePoint % 1 == 0) {

        }
        System.out.println(middlePoint);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Hello %f", arr[i]);
        }
        return 10.2;
    }

    public static double findMean(double[] arr) {
        double sum = 0;
        for (double each : arr) {
            sum += each;
        }
        return sum / arr.length;
    }

    public static double findMode() {
        return 12.21;
    }
}
