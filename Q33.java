
     import java.util.Scanner;

// Main class to run the demo
public class Q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read sales from the user
        System.out.print("Enter the sales amount: ");
        int sells = scanner.nextInt();

        // Check if the sales amount is valid
        if (sells < 0) {
            System.out.println("Invalid input");
        } else {
            // Create an instance of Commission with the sales value
            Commission commission = new Commission(sells);

            // Call the com method and print the commission
            double commissionValue = commission.com();
            System.out.println("The commission is: " + commissionValue);
        }

        scanner.close(); // Close the scanner to avoid resource leak
    }
}

// Commission class to handle commission calculations
class Commission {
    private int sells;

    // Constructor to initialize the sells value
    public Commission(int sells) {
        this.sells = sells;
    }

    // Method to calculate the commission (10% of sales)
    public double getCommission() {
        return 0.10 * sells;
    }

    // Method to return the commission value
    public double com() {
        return getCommission();
    }
}

    

