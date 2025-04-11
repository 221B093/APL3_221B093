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

// Voice2 class with Template Method Pattern
class Voice2 {
    private Animal[] animals;

    // Method to prepare the array of animals
    private void prepareVoice() {
        animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        System.out.println("Animals are ready!");
    }

    // Method to hear the voices of all animals
    private void hear() {
        if (animals == null) {
            System.out.println("No animals are prepared. Call prepareVoice() first.");
            return;
        }
        for (Animal animal : animals) {
            animal.makeVoice(); // Polymorphism in action
        }
    }

    // Template Method to enforce the correct sequence of operations
    public void templateMethod() {
        prepareVoice(); // Step 1: Prepare the animals
        hear();        // Step 2: Hear the voices
    }
}

// Test class
public class Test {
    public static void main(String[] args) {
        Voice2 voice2 = new Voice2();

        // Using the template method to ensure correct sequence
        System.out.println("Using templateMethod():");
        voice2.templateMethod();

        // Trying to call hear() directly (without prepareVoice())
        System.out.println("\nCalling hear() directly:");
        voice2.hear(); // This will not work as expected
    }
}