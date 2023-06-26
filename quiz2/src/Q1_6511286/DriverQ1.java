package Q1_6511286;

public class DriverQ1 {
    public static void main(String[] args){
        System.out.println("---AnInt----");
        SwapEnd myInt = new AnInt(-4123);
        myInt.swap();
        System.out.println(((AnInt)myInt).getNumber());
        System.out.println(2*((AnInt)myInt).getNumber());
        
        System.out.println("--------");
        
        ((AnInt)myInt).setNumber(1234);
        myInt.swap();
        System.out.println(((AnInt)myInt).getNumber());
        System.out.println(2*((AnInt)myInt).getNumber());
        
        System.out.println("--------");

        
        ((AnInt)myInt).setNumber(-34129);
        myInt.swap();
        System.out.println(((AnInt)myInt).getNumber());
        System.out.println(2*((AnInt)myInt).getNumber());
        
        System.out.println("--------");
                
        ((AnInt)myInt).setNumber(-1000);
        myInt.swap();
        System.out.println(((AnInt)myInt).getNumber());
        System.out.println(2*((AnInt)myInt).getNumber());

        System.out.println("--------");
        
        ((AnInt)myInt).setNumber(3);
        myInt.swap();
        System.out.println(((AnInt)myInt).getNumber());
        System.out.println(2*((AnInt)myInt).getNumber());

        
        
        System.out.println("---AString----");


        SwapEnd myStr = new AString("Hello");
        myStr.swap();
        System.out.println(((AString)myStr).getStr());
        
        ((AString)myStr).setStr("a");
        myStr.swap();
        System.out.println(((AString)myStr).getStr());
        
        ((AString)myStr).setStr("bye bye!");
        myStr.swap();
        System.out.println(((AString)myStr).getStr());
        
        ((AString)myStr).setStr("ABCD");
        myStr.swap();
        System.out.println(((AString)myStr).getStr());

    }
}
