import java.util.Scanner;

public class TernaryOp {
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How old you are?: ");
        byte age = in.nextByte();
        String output = (age > 50)? "quite old": "still young";
        System.out.println("You are " + output);
        in.close();
    }
}
