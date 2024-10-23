
    // Base class with an instance method
class Parent {
    // Method in Parent class
    public void display() {
        System.out.println("This is the Parent class method.");
    }
}

// Subclass that overrides the method of the Parent class
class Child extends Parent {
    // Overriding the display() method in Child class
    @Override
    public void display() {
        System.out.println("This is the Child class method.");
    }
}

// Main class to demonstrate method overriding
public class assi6{
    public static void main(String[] args) {
        // Parent class reference and object
        Parent parentObj = new Parent();
        parentObj.display();  // Calls Parent's display method

        // Child class reference and object
        Child childObj = new Child();
        childObj.display();  // Calls Child's overridden display method

        // Parent class reference pointing to a Child object
        Parent parentChildObj = new Child();
        parentChildObj.display();  // Calls Child's overridden display method (runtime polymorphism)
    }
}

