
    // Base class with a static method
class Parent {
    // Static method in Parent class
    public static void display() {
        System.out.println("Static method in Parent class");
    }
}

// Subclass that hides the static method of the Parent class
class Child extends Parent {
    // Static method in Child class that hides the Parent's static method
    public static void display() {
        System.out.println("Static method in Child class");
    }
}

// Main class to demonstrate method hiding
public class  asssi7 {
    public static void main(String[] args) {
        // Calling static method using Parent class reference
        Parent parentObj = new Parent();
        parentObj.display();  // This will call Parent's display method

        // Calling static method using Child class reference
        Child childObj = new Child();
        childObj.display();  // This will call Child's display method

        // Using Parent class reference to Child object
        Parent parentChildObj = new Child();
        parentChildObj.display();  // This will call Parent's display method because of method hiding
    }
}

