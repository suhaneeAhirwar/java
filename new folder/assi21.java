
    // Define custom exception for NoMatchFound
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class assi21 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a country name as a command line argument.");
            return;
        }

        // Retrieve the country from command line argument
        String country = args[0].toLowerCase();

        try {
            // Get the capital of the country
            String capital = getCapital(country);

            // If a match is found, print the capital
            System.out.println("The capital of " + country + " is: " + capital);

        } catch (NoMatchFoundException e) {
            // If no match found, catch the exception and print the error message
            System.out.println(e.getMessage());
        }
    }

    // Method to get the capital based on the country name
    public static String getCapital(String country) throws NoMatchFoundException {
        switch (country) {
            case "usa":
                return "Washington, D.C.";
            case "india":
                return "New Delhi";
            case "france":
                return "Paris";
            case "germany":
                return "Berlin";
            case "japan":
                return "Tokyo";
            default:
                throw new NoMatchFoundException("No match found for country: " + country);
        }
    }
}

