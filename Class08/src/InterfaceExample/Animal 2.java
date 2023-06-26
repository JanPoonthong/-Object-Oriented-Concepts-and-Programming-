package InterfaceExample;

abstract class Animal {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /** Return animal sound */
    public abstract String sound();
}

class Chicken extends Animal implements Edible, Comparable {
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }
    
    @Override
    public int compareTo(Object c) {
    	return (int)(this.getWeight() - ((Chicken) c).getWeight());
    }

    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger: RROOAARR";
    }
}

abstract class Fruit implements Edible {
    // Data fields, constructors, and methods omitted here
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}