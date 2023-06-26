public class Apple {
    String name;
    // For empty parameter while creating class Apple()
    public Apple() {

    }

    public Apple(String name) {
        // this.name refer to String name;
        this.name = name;
    }
    public void howToEat() {
        System.out.println("Make apple cyder!");
    }
    public static void main(String[] args) {
        Apple obj1 = new Apple();
        obj1.howToEat();
    }
}