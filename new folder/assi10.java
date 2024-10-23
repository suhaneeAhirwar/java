
    // Vehicle Class (Base Class)
class Vehicle {
    // Protected instance variables
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    // Constructor for the Vehicle class
    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    // Method to display vehicle information
    public void showData() {
        System.out.println("This is a Vehicle class.");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}

// Bus Class (Subclass of Vehicle)
class Bus extends Vehicle {
    // Private instance variable
    private int routeNumber;

    // Constructor for the Bus class
    public Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName); // Calling superclass constructor
        this.routeNumber = routeNumber;
    }

    // Method to display bus information
    @Override
    public void showData() {
        super.showData(); // Call the super class method to display vehicle info
        System.out.println("This is a Bus.");
        System.out.println("Route Number: " + routeNumber);
    }
}

// Car Class (Subclass of Vehicle)
class Car extends Vehicle {
    // Private instance variable
    private String manufacturerName;

    // Constructor for the Car class
    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName); // Calling superclass constructor
        this.manufacturerName = manufacturerName;
    }

    // Method to display car information
    @Override
    public void showData() {
        super.showData(); // Call the super class method to display vehicle info
        System.out.println("This is a Car.");
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

// Main class to test the program
public class assi10 {
    public static void main(String[] args) {
        // Create a Bus object
        Bus bus = new Bus("MH12AB1234", 80, "Yellow", "John Doe", 101);
        bus.showData();

        System.out.println(); // Empty line for better readability

        // Create a Car object
        Car car = new Car("MH14XY5678", 120, "Red", "Jane Doe", "Toyota");
        car.showData();
    }
}
