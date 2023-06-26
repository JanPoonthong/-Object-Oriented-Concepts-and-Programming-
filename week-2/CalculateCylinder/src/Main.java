import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hollow Cylinder Calculator");

        System.out.print("Enter the outer radius: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the inner radius: ");
        double secondRadius = scanner.nextDouble();

        System.out.print("Enter the height:: ");
        double height = scanner.nextDouble();

        double firstCylinderResult = Math.PI*radius*radius*height;
        double secondCylinderResult = Math.PI*secondRadius*secondRadius*height;

        double totalArea = firstCylinderResult - secondCylinderResult;
        String result = new DecimalFormat("#.##").format(totalArea);
        System.out.println("The volume of this hollow cylinder is " + result);
    }
}