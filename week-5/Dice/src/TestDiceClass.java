public class TestDiceClass {
    public void testCall() {
        System.out.println("You can call me now");
    }
    public static void main(String[] args) {
        Dice myDice = new Dice(5);
        System.out.println(myDice.getPips());
//        System.out.printf("Default value: %d", myDice.getPips());
        for (int i = 0; i < 20; i++) {
            myDice.tossDice();
            System.out.println(myDice.getPips());
        }
        System.out.printf("The number of dice is %d\n", Dice.nDice);
        Dice ourDice = new Dice();
        System.out.println(ourDice.getPips());
        System.out.printf("The number of dice is %d\n", Dice.nDice);
        Dice thirDice = new Dice();
        System.out.printf("The number of dice is %d\n", Dice.nDice);

        TestDiceClass m = new TestDiceClass();
        m.testCall();
    }
}
