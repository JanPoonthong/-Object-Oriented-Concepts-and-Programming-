import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Hello Again! Who are you?: ");
        String uName = myScanner.nextLine();
        System.out.println("Ok, " + uName + " Nice to meet you");
        myScanner.close();
    }
}