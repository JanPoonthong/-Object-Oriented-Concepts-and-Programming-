public class Dice {
    private int faceUp;// Don't let other class or package use the variable

    static int nDice = 1;

    public Dice() {
        faceUp = 1;
        nDice++;
    }

    public Dice(int faceUp) {
        this.faceUp = faceUp;
    }
    public void tossDice() {
        faceUp = (int) ((Math.random() * 10) % 6) + 1;
    }

    public int getPips() {
        return faceUp;
    }
}