import java.util.Arrays;

import java.util.Scanner;

public class MiddleValueInStat {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many number(s)?: ");
        int userInt = userInput.nextInt();
        double[] numberList = new double[userInt];


        for (int i = 0; i < userInt; i++) {
            System.out.printf("Enter number#%d: ", i + 1);
            numberList[i] = userInput.nextDouble();
        }
        userInput.close();
        System.out.printf("The mean of these number(s) is %f\n", mean(numberList));
        System.out.printf("The median of these number(s) is %f\n", median(numberList));
        System.out.printf("The mode of these number(s) is %d\n", (int) mode(numberList));
        System.out.printf("The arjan mode of these number(s) is %d\n", (int) arjanMode(numberList));


    }

    public static double median(double[] arr) {
        Arrays.sort(arr);
        double middlePointArray;
        double middlePoint = arr.length / 2.0;
        if (middlePoint % 2 == 0) {
            middlePointArray = (arr[(int) middlePoint - 1] + arr[(int) middlePoint]) / 2.0;
        } else {
            middlePointArray = arr[(int) middlePoint];
        }
        return middlePointArray;
    }

    public static double mean(double[] arr) {
        double sum = 0;
        for (double each : arr) {
            sum += each;
        }
        return sum / arr.length;
    }

    public static double mode(double[] arr) {
        double maxValue = 0;
        int maxCount = 0;

        for (double v : arr) {
            int count = 0;
            for (double value : arr) {
                if (v == value) {
                    count++;
                }
            }

            if (count >= maxCount) {
                maxCount = count;
                maxValue = v;
            }
        }
        return maxValue;
    }

    public static double arjanMode(double[] arr) {
        Arrays.sort(arr);
        int count;
        int maxCount = 0;
        double maxValue = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            count = 0;
            if (arr[i] == arr[i + 1]) {
                count++;
            }
            if (count >= maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
