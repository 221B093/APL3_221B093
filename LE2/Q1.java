/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

// Base class Animal
abstract class Animal {
	abstract void makeVoice();
}

// Subclasses of Animal
class Cow extends Animal {
	@Override
	void makeVoice() {
		System.out.println("Cow says: Moo!");
	}
}

class Dog extends Animal {
	@Override
	void makeVoice() {
		System.out.println("Dog says: Woof!");
	}
}

class Pig extends Animal {
	@Override
	void makeVoice() {
		System.out.println("Pig says: Oink!");
	}
}

class Goat extends Animal {
	@Override
	void makeVoice() {
		System.out.println("Goat says: Baa!");
	}
}

class Lion extends Animal {
	@Override
	void makeVoice() {
		System.out.println("Lion says: Roar!");
	}
}

// Voice class
class Voice {
	private Animal[] animals;

	// Method to prepare the array of animals
	void prepareVoice() {
		animals = new Animal[5];
		animals[0] = new Cow();
		animals[1] = new Dog();
		animals[2] = new Pig();
		animals[3] = new Goat();
		animals[4] = new Lion();
	}

	// Method to hear the voices of all animals
	void hear() {
		for (Animal animal : animals) {
			animal.makeVoice(); // Polymorphism in action
		}
	}
}

// Test class
public class Test {
	public static void main(String[] args) {
		Voice voice = new Voice();
		voice.prepareVoice(); // Prepare the array of animals
		voice.hear();         // Hear the voices of all animals
	}
}