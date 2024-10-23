import javax.swing.Box;

public class assi4 {
    // Class demonstrating constructor overloading
class Box {
    double width;
    double height;
    double depth;

    // Constructor 1: No parameters (default constructor)
    public Box() {
        width = 0;
        height = 0;
        depth = 0;
        System.out.println("Default constructor called.");
    }

    // Constructor 2: Three parameters to initialize dimensions
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
        System.out.println("Parameterized constructor called with width, height, and depth.");
    }

    // Constructor 3: One parameter (cube)
    public Box(double sideLength) {
        width = height = depth = sideLength;
        System.out.println("Constructor called to create a cube.");
    }

    // Method to calculate and return the volume of the box
    public double volume() {
        return width * height * depth;
    }
}

// Main class to demonstrate constructor overloading
public class Main {
    public static void main(String[] args) {
        // Creating a Box object using default constructor
        Box box1 = new Box();
        System.out.println("Volume of default box: " + box1.volume());

        System.out.println();

        // Creating a Box object using parameterized constructor
        Box box2 = new Box(5, 10, 3);
        System.out.println("Volume of box with given dimensions: " + box2.volume());

        System.out.println();

        // Creating a Box object using the constructor for a cube
        Box box3 = new Box(4);
        System.out.println("Volume of cube: " + box3.volume());
    }
}

    
}
