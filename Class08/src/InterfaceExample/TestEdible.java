package InterfaceExample;

public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple(),new Orange()};
        for (Object obj: objects) {
            if (obj instanceof Edible)
                System.out.println(((Edible)obj).howToEat());
            
//            System.out.println("-----");
//            if (obj instanceof Animal) {
//                System.out.println(((Animal)obj).sound());
//            }
            /*
            for (int i = 0; i < objects.length; i++) {
                if (objects[i] instanceof Edible)
                    System.out.println(((Edible)objects[i]).howToEat());

                if (objects[i] instanceof Animal) {
                    System.out.println(((Animal)objects[i]).sound());
            }
             */
        }
    }
}

