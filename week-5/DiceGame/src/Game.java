import java.util.Scanner;

public class Game {
    Player player1 = new Player();
    Player player2 = new Player();
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();

    private void playRound() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Player one -> to toss press (y): ");
        String toss = userInput.next();

        int playerDice1Value = 0;
        int playerDice2Value = 0;

        int player2Dice1Value = 0;
        int player2Dice2Value = 0;


        if (toss.equals("y")) {
            playerDice1Value = dice1.tossDice();
            playerDice2Value = dice2.tossDice();

            System.out.printf("Player one toss first dice and got: %d\n", playerDice1Value);
            System.out.printf("Player one toss second dice and got: %d\n", playerDice2Value);
        }

        System.out.print("Player two -> to toss press (y): ");
        String tossTwo = userInput.next();

        if (tossTwo.equals("y")) {
            player2Dice1Value = dice1.tossDice();
            player2Dice2Value = dice2.tossDice();
            System.out.printf("Player two toss first dice and got: %d\n", player2Dice1Value);
            System.out.printf("Player two toss second dice and got: %d\n", player2Dice2Value);
        }


        if (playerDice1Value + playerDice2Value > player2Dice1Value + player2Dice2Value) {
            System.out.println("Player one won this round");
            player1.addToScore(1);
        } else if (player2Dice1Value + player2Dice2Value > playerDice1Value + playerDice2Value) {
            System.out.println("Player two won this round");
            player2.addToScore(1);
        }
        else if (playerDice1Value + playerDice2Value == player2Dice1Value + player2Dice2Value) {
            System.out.println("Draw on this round");
        }
    }

    private void getWinner() {
        if (player1.getScore() > player2.getScore()) {
            System.out.println("WINNER -> Player one won this game");
        } else if (player1.getScore() == player2.getScore()) {
            System.out.println("DRAW -> This game is a Draw");
        } else {
            System.out.println("WINNER -> Player two won this game");
        }
    }

    public void playGame() {
        for (int i = 1; i < 6; i++) {
            System.out.println("********Round " + i + "********");
            playRound();
            System.out.println();
        }
        getWinner();
    }
}
