
    // Base class for distance in miles
class Distance {
    double distanceInMiles;

    // Constructor to initialize distance in miles
    public Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    // Method to calculate and print travel time for distance in miles
    public void travelTime() {
        double speedInMilesPerHour = 60.0;
        double time = distanceInMiles / speedInMilesPerHour;
        System.out.println("Travel time to cover " + distanceInMiles + " miles at 60 miles per hour: " + time + " hours.");
    }
}

// Derived class for distance in kilometers
class DistanceInKilometers extends Distance {
    double distanceInKilometers;

    // Constructor to initialize distance in kilometers
    public DistanceInKilometers(double distanceInKilometers) {
        // Convert kilometers to miles for the base class
        super(distanceInKilometers * 0.621371); // 1 kilometer = 0.621371 miles
        this.distanceInKilometers = distanceInKilometers;
    }

    // Override method to calculate and print travel time for distance in kilometers
    @Override
    public void travelTime() {
        double speedInKilometersPerHour = 100.0;
        double time = distanceInKilometers / speedInKilometersPerHour;
        System.out.println("Travel time to cover " + distanceInKilometers + " kilometers at 100 kilometers per hour: " + time + " hours.");
    }
}

public class  assi12 {
    public static void main(String[] args) {
        // Create an object of the base class for distance in miles
        Distance distanceInMiles = new Distance(120);  // 120 miles
        distanceInMiles.travelTime();

        // Create an object of the derived class for distance in kilometers
        DistanceInKilometers distanceInKilometers = new DistanceInKilometers(200);  // 200 kilometers
        distanceInKilometers.travelTime();
    }
}

