// Class representing a Rectangle
class Rectangle {
    double length;
    double width;

    // Parameterized constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Parameterized constructor called.");
    }

    // Method to calculate and return the area of the rectangle
    public double area() {
        return length * width;
    }
}

// Main class to demonstrate the parameterized constructor
public class  assi3 {
    public static void main(String[] args) {
        // Creating a Rectangle object using the parameterized constructor
        Rectangle rect1 = new Rectangle(10, 5);
        System.out.println("Area of rectangle 1: " + rect1.area());

        System.out.println();

        // Creating another Rectangle object with different dimensions
        Rectangle rect2 = new Rectangle(8, 4);
        System.out.println("Area of rectangle 2: " + rect2.area());
    }
}
