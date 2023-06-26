import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter weight (in kg): ");
        double weight = inputReader.nextInt();

        System.out.print("Enter height (in cm): ");
        double height = inputReader.nextInt();

        double bmi = weight / (Math.pow(height / 100, 2));

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi >= 30) {
            System.out.println("Obese");
        }
    }
}