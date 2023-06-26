package example;

public class PolymorphismDemo1 {
	public static void main(String[] args) {
		Animal myAnimal = new Animal(); // Create a Animal object
		Animal myPig = new Pig("jump"); // Create a Pig object
		Animal myDog = new Dog(); // Create a Dog object
		Table table1 = new Table();
		makeSound(myAnimal);
		makeSound(myPig);
		makeSound(myDog);
		makeSound(table1);
	}
//	public static void makeSound(Object o){
//		((Animal) o).animalSound();
//	}

	// Check if Object is the instanceof
	public static void makeSound(Object o) {
		if (o instanceof Animal) {
			((Animal) o).animalSound();
		} else {
			System.out.println(o + " It's not an instance of Animal class.");
		}
	}
}

class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig extends Animal {
	public Pig() {

	}

	public Pig(String action) {
		System.out.println("This pig is going to " + action);
	}

	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

class Table {
	public void animalSound() {
		System.out.println("The table says: table table");
	}
}
