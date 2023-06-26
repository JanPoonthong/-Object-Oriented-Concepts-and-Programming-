import java.util.Scanner;
public class StringProcessing {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String aStr = "Another Example!";
        System.out.println("This is a pre-defined String ===> " + aStr);
        System.out.print("Then create the same string: ===> ");
        String myStr = myScan.nextLine();
        System.out.println("Let's see the output");
        if (aStr.equals(myStr))
            System.out.println("These two strings are the same.");
        else
            System.out.println("These two strings are different.");
        System.out.println("Why????\nCan you correct this program?");
        myScan.close();
    }

}
