public class TestInt {
    public static void main(String[] args){
        SwapEnd myInt = new AnInt(-4123);
        myInt.swap();
        System.out.println(((AnInt)myInt).getNumber());
        System.out.println(2*((AnInt)myInt).getNumber());
    }
}
