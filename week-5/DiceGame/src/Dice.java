public class Dice {
    public int tossDice() {
        return (int) (Math.random() * 10) % 6 + 1;
    }

}