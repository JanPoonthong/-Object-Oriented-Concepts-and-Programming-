package week3;

import java.util.Scanner;

public class CharacterProcessing1 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        char uInput;
        do{
            System.out.print("Enter a character: ");
            char aChar = myScan.next().charAt(0);
            System.out.println("According to Character.isDigit");
            if (Character.isDigit(aChar))
                System.out.println(aChar + " is a digit");
            else
                System.out.println(aChar + " is not a digit");
            System.out.println("According to Character.isLetter");
            if (Character.isLetter(aChar))
                System.out.println(aChar + " is a letter");
            else
                System.out.println(aChar + " is not a letter");
            System.out.println("According to Character.isLetterOrDigit");
            if (Character.isLetterOrDigit(aChar))
                System.out.println(aChar + " is a letter or a digit");
            else
                System.out.println(aChar + " is not a letter or a digit");
            System.out.print("Enter a character, c, if you want to continue: ");
            uInput = myScan.next().charAt(0);
            System.out.println();
        } while( uInput == 'c');
        myScan.close();
    }
}
