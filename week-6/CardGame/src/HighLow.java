import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] suits = {"hearts", "diamonds", "spades", "clubs"};
        int currentCard = random.nextInt(13) + 1;
        String currentSuit = suits[random.nextInt(suits.length)];
        int count = 0;

        while (true) {
            System.out.println("The current card is: " + currentCard + " of " + currentSuit);
            System.out.println("Will the next card be higher or lower? (h/l)");
            String guess = scanner.nextLine();

            int nextCard = random.nextInt(13) + 1;
            String nextSuit = suits[random.nextInt(suits.length)];
            count++;

            if (guess.equals("h")) {
                if (nextCard > currentCard) {
                    System.out.println("The next card is higher: " + nextCard + " of " + nextSuit);
                } else {
                    System.out.println("The next card is lower: " + nextCard + " of " + nextSuit);
                    break;
                }
            } else if (guess.equals("l")) {
                if (nextCard < currentCard) {
                    System.out.println("The next card is lower: " + nextCard + " of " + nextSuit);
                } else {
                    System.out.println("The next card is higher: " + nextCard + " of " + nextSuit);
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter 'h' or 'l'.");
            }

            currentCard = nextCard;
            currentSuit = nextSuit;
        }

        System.out.println("Game over. You made " + count + " correct guesses.");
    }
}
