public class Q2_6511286 {
    public static void main(String[] args) {
        String test1 = "hello there!";
        String test2 = "**Another** **Example!**";

        System.out.println(withTwiceChar(test1,'e')); //hello theeree!
        System.out.println(withTwiceChar(test1,'l')); //hellllo there!
        System.out.println(withTwiceChar(test2,'e')); //**Anotheer** **Examplee!**
        System.out.println(withTwiceChar(test2,' ')); //**Anotheer** **Examplee!**
        System.out.println(withTwiceChar("oppo v3",'o'));
        System.out.println(withTwiceChar("abandon",'n'));
        System.out.println(withTwiceChar("without you",'a'));

    }

    public static String withTwiceChar(String str, char more) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == more) {
                result.append(str.charAt(i)).append(more);
            }
            else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
