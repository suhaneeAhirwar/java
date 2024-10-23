
    import java.util.Scanner;

// Base abstract class ThreeDObject
abstract class ThreeDObject {
    // Abstract methods to be overridden in derived classes
    abstract double wholeSurfaceArea();
    abstract double volume();
}

// Derived class for Box
class Box extends ThreeDObject {
    double length, width, height;

    // Constructor for Box class
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Override methods
    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double volume() {
        return length * width * height;
    }
}

// Derived class for Cube
class Cube extends ThreeDObject {
    double side;

    // Constructor for Cube class
    Cube(double side) {
        this.side = side;
    }

    // Override methods
    @Override
    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

// Derived class for Cylinder
class Cylinder extends ThreeDObject {
    double radius, height;

    // Constructor for Cylinder class
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override methods
    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Derived class for Cone
class Cone extends ThreeDObject {
    double radius, height;

    // Constructor for Cone class
    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override methods
    @Override
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

// Main class to test the derived classes
public class assi9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create and test Box
        System.out.println("Enter length, width, and height for the box:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Create and test Cube
        System.out.println("\nEnter side for the cube:");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Create and test Cylinder
        System.out.println("\nEnter radius and height for the cylinder:");
        double radius = sc.nextDouble();
        double cylinderHeight = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, cylinderHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Create and test Cone
        System.out.println("\nEnter radius and height for the cone:");
        double coneRadius = sc.nextDouble();
        double coneHeight = sc.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        sc.close();
    }
}


