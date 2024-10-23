interface Animal {
    void sound();
}

interface Bird {
    void fly();
}

// Implementing multiple interfaces
class Bat implements Animal, Bird {

    // Implementing the method from Animal
    @Override
    public void sound() {
        System.out.println("Bat makes a sound");
    }

    // Implementing the method from Bird
    @Override
    public void fly() {
        System.out.println("Bat can fly");
    }
}

public class Main {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.sound(); // Calls sound() from Animal
        bat.fly();   // Calls fly() from Bird
    }
}

