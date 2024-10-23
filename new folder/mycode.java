// Superclass
class Animal {
    String name;

    // Constructor for Animal
    public Animal(String name) {
        this.name = name;
    }

    // Superclass method
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Superclass method
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass that extends Animal
class Dog extends Animal {
    // Subclass instance variable
    String breed;

    // Constructor for Dog
    public Dog(String name, String breed) {
        super(name); // Call to the superclass constructor
        this.breed = breed;
    }

    // Subclass-specific method
    public void fetch() {
        System.out.println(name + " is fetching a ball.");
    }

    // Overriding the superclass method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Overriding the superclass method
    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }
}

public class mycode {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        // Calling the subclass-specific method
        myDog.fetch(); // Buddy is fetching a ball.

        // Calling the overridden method
        myDog.makeSound(); // Dog barks

        // Calling the overridden method
        myDog.eat(); // Buddy is eating dog food.
    }
}

