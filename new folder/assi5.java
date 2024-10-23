// Base class (Superclass)
class Animal {
    // Field for animal name
    String name;

    // Constructor to initialize the name of the animal
    public Animal(String name) {
        this.name = name;
    }

    // Method to display the sound made by the animal
    public void sound() {
        System.out.println("This animal makes a sound.");
    }

    // Method to display the name of the animal
    public void showName() {
        System.out.println("Animal name: " + name);
    }
}

// Derived class (Subclass) that extends the Animal class
class Dog extends Animal {

    // Constructor for Dog class, calling the superclass constructor
    public Dog(String name) {
        super(name); // Calling the superclass constructor
    }

    // Overriding the sound method in Dog class
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Another derived class (Subclass) that extends the Animal class
class Cat extends Animal {

    // Constructor for Cat class, calling the superclass constructor
    public Cat(String name) {
        super(name); // Calling the superclass constructor
    }

    // Overriding the sound method in Cat class
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

// Main class to demonstrate inheritance
public class assi5{
    public static void main(String[] args) {
        // Creating an instance of the Dog class
        Dog dog = new Dog("Buddy");
        dog.showName();  // Calling inherited method from Animal class
        dog.sound();     // Calling overridden method from Dog class

        System.out.println();

        // Creating an instance of the Cat class
        Cat cat = new Cat("Whiskers");
        cat.showName();  // Calling inherited method from Animal class
        cat.sound();     // Calling overridden method from Cat class
    }
}
