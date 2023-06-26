package learning;

class soundAnimal {
	public void Sound() {
		System.out.println("Different sounds of animal");
	}
}

class buffalo extends soundAnimal {
	public void Sound() {
		System.out.println("The buffalo sound- gho,gho");
	}
}

class snake extends soundAnimal {
	public void Sound() {
		System.out.println("The snake sound- his,his");
	}
}

class tiger extends soundAnimal {
	public void Sound() {
		System.out.println("The tiger sounds- roooo, rooo");
	}
}

public class Animal {

	public static void main(String[] args) {
		soundAnimal Animal = new soundAnimal();
		soundAnimal buffalo = new buffalo();
		soundAnimal snake = new snake();
		soundAnimal tiger = new tiger();
		Animal.Sound();
		buffalo.Sound();
		snake.Sound();
		tiger.Sound();
	}
}
