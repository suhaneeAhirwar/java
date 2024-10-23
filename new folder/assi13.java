
    // Base class (superclass)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (inherits from Animal)
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on land.");
    }
}

// Derived class (inherits from Mammal)
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class  assi13 {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog dog = new Dog();

        // Call methods from all levels of inheritance
        dog.eat();  // Inherited from Animal class
        dog.walk(); // Inherited from Mammal class
        dog.bark(); // Defined in Dog class
    }
}

