public class Main {
    public static void main(String[] args) {
        star(1);
    }

    public static void star(int n) {
        for (int j = 1; j < n+1; j++) {
            for (int i = n; i > j; i--) {
                System.out.print("_");
            }
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}